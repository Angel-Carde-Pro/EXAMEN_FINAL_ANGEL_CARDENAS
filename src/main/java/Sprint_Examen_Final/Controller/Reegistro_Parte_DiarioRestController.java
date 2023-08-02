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

import com.ista.springboot.web.app.models.entity.Registro_Parte_Diario;
import com.ista.springboot.web.app.models.services.Iregistro_Parte_DiarioService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/registro-parte-diario")
public class Reegistro_Parte_DiarioRestController {
	 @Autowired
	    private Iregistro_Parte_DiarioService registroParteDiarioService;

	    @GetMapping("/registro-parte-diario")
	    public List<Registro_Parte_Diario> index() {
	        return registroParteDiarioService.findAll();
	    }

	    @GetMapping("/registro-parte-diario/{id}")
	    public Registro_Parte_Diario findRegistroParteDiarioById(@PathVariable("id") Long id_parte_diario) {
	        return registroParteDiarioService.findById(id_parte_diario);
	    }

	    @PostMapping("/registro-parte-diario")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Registro_Parte_Diario createRegistroParteDiario(@RequestBody Registro_Parte_Diario registro_parte_diario) {
	        return registroParteDiarioService.Save(registro_parte_diario);
	    }

	    @PutMapping("/registro-parte-diario/{id}")
	    public Registro_Parte_Diario updateRegistroParteDiario(@RequestBody Registro_Parte_Diario registro_parte_diario, @PathVariable("id") Long id_parte_diario) {
	    	Registro_Parte_Diario registroParteDiarioActual = registroParteDiarioService.findById(id_parte_diario);
	        registroParteDiarioActual.setFecha_registro(registro_parte_diario.getFecha_registro());
	        registroParteDiarioActual.setUnidad_cooperativa(registro_parte_diario.getUnidad_cooperativa());
	        registroParteDiarioActual.setN_visitas(registro_parte_diario.getN_visitas());
	        registroParteDiarioActual.setPeso(registro_parte_diario.getPeso());
	        registroParteDiarioActual.setTalla(registro_parte_diario.getTalla());
	        return registroParteDiarioService.Save(registroParteDiarioActual);
	    }

	    @DeleteMapping("/registro-parte-diario/{id}")
	    public void deleteRegistroParteDiario(@PathVariable("id") Long id_parte_diario) {
	        registroParteDiarioService.delete(id_parte_diario);
	    }
}
