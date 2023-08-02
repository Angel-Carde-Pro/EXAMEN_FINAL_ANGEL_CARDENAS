package Sprint_Examen_Final.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Sprint_Examen_Final.modelo.service.*;
import Sprint_Examen_Final.modelo.entity.*;
import Sprint_Examen_Final.modelo.dao.*;



@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/area")
public class AreaRestController {
	@Autowired
	private IAreaService areaservice;
	@GetMapping ("/area")
	public List<Area> index() {
		return areaservice.findAll();
	}
	
	@GetMapping ("/area/{id}")
	public Area findAreaById(@PathVariable("id") Long id_area) {
		return areaservice.findById(id_area);
	}
	
	@PostMapping ("/area")
	@ResponseStatus (HttpStatus.CREATED)
	public Area createArea(@RequestBody Area area) {
		return areaservice.Save(area);
	}
	
	@PutMapping ("/area/{id}")
	public Area updateArea(@RequestBody Area area, @PathVariable("id") Long id_area) {
		Area area_Actual = areaservice.findById(id_area);
		//area_Actual.setCat_descripcion(categoria.getCat_descripcion());
		area_Actual.setNombre_area(area.getNombre_area());
		
		return  areaservice.Save(area_Actual);
	}
	 @DeleteMapping("/area/{id}")
	    public void deleteArea(@PathVariable("id") Long id_area) {
	        areaservice.delete(id_area);
	    }

}


