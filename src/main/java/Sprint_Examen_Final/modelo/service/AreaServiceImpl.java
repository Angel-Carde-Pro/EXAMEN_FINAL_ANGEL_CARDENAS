package Sprint_Examen_Final.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Sprint_Examen_Final.modelo.dao.*;
import Sprint_Examen_Final.modelo.entity.*;


@Service
public class AreaServiceImpl implements IAreaService{
	
	@Autowired
	private IAreaDao areaDAO;
	
	@Override
	public Area saveArea(Area area) {
		// TODO Auto-generated method stub
		return areaDAO.save(area);
	}

	@Override
	@Transactional (readOnly=true)
	public List<Area> listarAreas() {
		// TODO Auto-generated method stub
		return (List<Area>) areaDAO.findAll();
	}

	@Override
	public Area findAreaById(Long idarea) {
		// TODO Auto-generated method stub
		return areaDAO.findById(idarea).get();
	}

	@Override
	public void deleteAreaById(Long idarea) {
		areaDAO.deleteById(idarea);
		
	}
}
