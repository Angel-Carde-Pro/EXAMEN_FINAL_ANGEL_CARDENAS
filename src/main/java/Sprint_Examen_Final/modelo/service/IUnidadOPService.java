package Sprint_Examen_Final.modelo.service;

import java.util.List;
import Sprint_Examen_Final.modelo.entity.*;

public interface IUnidadOPService {
	Unidad_Operativa saveUnidad_Operativa(Unidad_Operativa unidad);
	
	List<Unidad_Operativa> listarUnidad_Operativa();
	
	Unidad_Operativa findUnidad_OperativaById(Long id);
	
	Unidad_Operativa updateUnidad_Operativa(Unidad_Operativa unidad, Long id);
	
	void deleteUnidad_OperativaById(Long id);
}
