package Sprint_Examen_Final.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Sprint_Examen_Final.modelo.dao.*;
import Sprint_Examen_Final.modelo.entity.*;

@Service
public class UnidadOPServiceImpl implements IUnidadOPService{
	
	@Autowired
	private IUnidadOpDao unidadDao;
	
	@Override
	public Unidad_Operativa saveUnidad_Operativa(Unidad_Operativa unidad) {
		return unidadDao.save(unidad);
	}

	@Override
	@Transactional (readOnly=true)
	public List<Unidad_Operativa> listarUnidad_Operativa() {
		return (List<Unidad_Operativa>) unidadDao.findAll();
	}

	@Override
	public Unidad_Operativa updateUnidad_Operativa(Unidad_Operativa unidad, Long id) {
		Unidad_Operativa facDB = unidadDao.findById(id).get();
		
		return unidadDao.save(facDB);
	}

	@Override
	public void deleteUnidad_OperativaById(Long id) {
		unidadDao.deleteById(id);
	}

	@Override
	public Unidad_Operativa findUnidad_OperativaById(Long id) {
		return unidadDao.findById(id).get();
	}

}
