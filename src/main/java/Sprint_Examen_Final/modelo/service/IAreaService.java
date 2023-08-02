package Sprint_Examen_Final.modelo.service;

import java.util.List;
import Sprint_Examen_Final.modelo.entity.*;

public interface IAreaService {
	Area save(Area area);
	
    List<Area> listar();
    
    Area findById(Long idarea);
  
    void deleteById(Long idarea);
}
