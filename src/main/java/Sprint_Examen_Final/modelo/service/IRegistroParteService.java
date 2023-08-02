package Sprint_Examen_Final.modelo.service;

import java.util.List;
import Sprint_Examen_Final.modelo.entity.*;

public interface IRegistroParteService {
	Registro_Parte_Diario saveRegistro_Parte_Diario(Registro_Parte_Diario registro);
	
	List<Registro_Parte_Diario> listarRegistro_Parte_Diario();
	
	Registro_Parte_Diario findRegistro_Parte_DiarioById(Long id);
	
	//Registro_Parte_Diario updateProducto(Registro_Parte_Diario registro, Long idregistro);
	
	void deleteRegistro_Parte_DiarioById(Long idregistro);
}
