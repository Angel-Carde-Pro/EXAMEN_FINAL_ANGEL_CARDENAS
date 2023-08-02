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

import com.ista.springboot.web.app.models.entity.Unidad_Operativa;
import com.ista.springboot.web.app.models.services.IUnidad_OperativaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/Unidad-Operativa")
public class Unidad_OperativaRestController {
	  @Autowired
	    private IUnidad_OperativaService unidadOperativaService;

	    @GetMapping()
	    public List<Unidad_Operativa> index() {
	        return unidadOperativaService.findAll();
	    }

	    @GetMapping("/Unidad-Operativa/{codigo}")
	    public Unidad_Operativa findUnidadCooperativaById(@PathVariable("codigo") Long codigo) {
	        return unidadOperativaService.findById(codigo);
	    }

	    @PostMapping("/Unidad-Operativa")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Unidad_Operativa createUnidadCooperativa(@RequestBody Unidad_Operativa unidad_cooperativa) {
	        return unidadOperativaService.Save(unidad_cooperativa);
	    }

	    @PutMapping("/Unidad-Operativa/{codigo}")
	    public Unidad_Operativa updateUnidadCooperativa(@RequestBody Unidad_Operativa unidad_cooperativa, @PathVariable("codigo") Long codigo) {
	    	Unidad_Operativa unidadCooperativaActual = unidadOperativaService.findById(codigo);
	        unidadCooperativaActual.setNombre_unidad_Operativa(unidad_cooperativa.getNombre_unidad_Operativa());
	        unidadCooperativaActual.setArea(unidad_cooperativa.getArea());
	        return unidadOperativaService.Save(unidadCooperativaActual);
	    }

	    @DeleteMapping("/Unidad-Operativa/{codigo}")
	    public void deleteUnidadCooperativa(@PathVariable("codigo") Long codigo) {
	        unidadOperativaService.delete(codigo);
	    }

}

