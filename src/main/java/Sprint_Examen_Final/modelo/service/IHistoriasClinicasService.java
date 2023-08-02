package Sprint_Examen_Final.modelo.service;

import java.util.List;
import Sprint_Examen_Final.modelo.entity.*;

public interface IHistoriasClinicasService {
	Historias_Clinicas saveHistorias_Clinicas(Historias_Clinicas historias);
	
	List<Historias_Clinicas> listarHistorias_Clinicas();
	
	Historias_Clinicas findHistorias_ClinicasById(Long id);
	
	Historias_Clinicas updateHistorias_Clinicas(Historias_Clinicas detalle, Long id_detalle);
	
	void deleteHistorias_ClinicasById(Long idHistoria);
}
