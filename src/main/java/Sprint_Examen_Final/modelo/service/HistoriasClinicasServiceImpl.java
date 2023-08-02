package Sprint_Examen_Final.modelo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Sprint_Examen_Final.modelo.dao.*;
import Sprint_Examen_Final.modelo.entity.*;

@Service
public class HistoriasClinicasServiceImpl implements IHistoriasClinicasService{
	
	@Autowired
	private IHistoriasClinicDao histoDAO;
	
	@Override
	@Transactional
	public Historias_Clinicas saveHistorias_Clinicas(Historias_Clinicas historias) {
		return histoDAO.save(historias);
	}

	@Override
	@Transactional (readOnly=true)
	public List<Historias_Clinicas> listarHistorias_Clinicas() {
		return (List<Historias_Clinicas>) histoDAO.findAll();
	}

	@Override
	public Historias_Clinicas updateHistorias_Clinicas(Historias_Clinicas historias, Long idhistoria) {
		Historias_Clinicas dtDB = histoDAO.findById(idhistoria).get();
		

		return histoDAO.save(dtDB);
	}

	@Override
	@Transactional
	public void deleteHistorias_ClinicasById(Long idhisto) {
		histoDAO.deleteById(idhisto);
	}

	@Override
	@Transactional(readOnly=true)
	public Historias_Clinicas findHistorias_ClinicasById(Long id) {
		return histoDAO.findById(id).get();
	}

}
