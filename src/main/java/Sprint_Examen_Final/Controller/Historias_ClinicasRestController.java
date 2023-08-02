package Sprint_Examen_Final.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.springboot.web.app.models.entity.Historias_Clinicas;
import com.ista.springboot.web.app.models.services.IHistorias_ClinicasService;

import org.springframework.http.HttpStatus;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/historias-clinicas")

public class Historias_ClinicasRestController {
	 @Autowired
	    private IHistorias_ClinicasService historiaClinicaService;

	    @GetMapping
	    public List<Historias_Clinicas> index() {
	        return historiaClinicaService.findAll();
	    }

	    @GetMapping("/{id}")
	    public Historias_Clinicas findHistoriaClinicaById(@PathVariable("id") Long cedula_Nro_HistoriaClinica) {
	        return historiaClinicaService.findById(cedula_Nro_HistoriaClinica);
	    }

	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Historias_Clinicas createHistoriaClinica(@RequestBody Historias_Clinicas historias_clinicas) {
	        return historiaClinicaService.Save(historias_clinicas);
	    }

	    @PutMapping("/{id}")
	    public Historias_Clinicas updateHistoriaClinica(@RequestBody Historias_Clinicas historias_clinicas, @PathVariable("id") Long cedula_Nro_HistoriaClinica) {
	    	Historias_Clinicas historiaClinicaActual = historiaClinicaService.findById(cedula_Nro_HistoriaClinica);
	        historiaClinicaActual.setNombre_paciente(historias_clinicas.getNombre_paciente());
	        historiaClinicaActual.setApellido_paciente(historias_clinicas.getApellido_paciente());
	        historiaClinicaActual.setFecha_nacimiento_paciente(historias_clinicas.getFecha_nacimiento_paciente());
	        return historiaClinicaService.Save(historiaClinicaActual);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteHistoriaClinica(@PathVariable("id") Long cedula_Nro_HistoriaClinica) {
	        historiaClinicaService.delete(cedula_Nro_HistoriaClinica);
	    }

}

