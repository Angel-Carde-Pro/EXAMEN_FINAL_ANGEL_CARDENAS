package Sprint_Examen_Final.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import Sprint_Examen_Final.modelo.entity.*;

public interface IRegistroDiarioDao extends CrudRepository<Registro_Parte_Diario, Long> {
	
}
