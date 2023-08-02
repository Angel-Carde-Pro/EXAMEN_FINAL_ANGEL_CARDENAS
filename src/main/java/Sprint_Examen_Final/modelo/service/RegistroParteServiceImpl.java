package Sprint_Examen_Final.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Sprint_Examen_Final.modelo.dao.*;
import Sprint_Examen_Final.modelo.entity.*;


@Service
public class RegistroParteServiceImpl implements IRegistroParteService{
	
	@Autowired
	private IRegistroDiarioDao registroDAO;

	@Override
	public Registro_Parte_Diario saveRegistro_Parte_Diario(Registro_Parte_Diario registro) {
		return registroDAO.save(registro);
	}

	@Override
	@Transactional (readOnly=true)
	public List<Registro_Parte_Diario> listarRegistro_Parte_Diario() {
		return (List<Registro_Parte_Diario>) registroDAO.findAll();
	}
/*
	@Override
	public Registro_Parte_Diario updateProducto(Registro_Parte_Diario registro, Long idregistro) {
		Registro_Parte_Diario prDB = registroDAO.findById(idregistro).get();
		
		if (Objects.nonNull(registro.getNombre()) && !"".equalsIgnoreCase(producto.getNombre())) {
			prDB.setNombre(producto.getNombre());
		}
		
		if (Objects.nonNull(producto.getPrecio()) && producto.getPrecio()>0) {
			prDB.setPrecio(producto.getPrecio());
		}
		
		if (Objects.nonNull(producto.getStock()) && producto.getStock()>0) {
			prDB.setStock(producto.getStock());
		}
		
		return productoDao.save(prDB);
	}
*/
	@Override
	public void deleteRegistro_Parte_DiarioById(Long idregistro) {
		registroDAO.deleteById(idregistro);
	}

	@Override
	public Registro_Parte_Diario findRegistro_Parte_DiarioById(Long id) {
		return registroDAO.findById(id).get();
	}

}
