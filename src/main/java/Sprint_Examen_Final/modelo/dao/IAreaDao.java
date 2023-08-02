package Sprint_Examen_Final.modelo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import Sprint_Examen_Final.modelo.entity.*;

public interface IAreaDao extends CrudRepository<Area, Long> {

	public List<Area> findAll();

	public Area Save(Area area);

	public Area findById(Long id_area);

	public void delete(Long id_area);

}
