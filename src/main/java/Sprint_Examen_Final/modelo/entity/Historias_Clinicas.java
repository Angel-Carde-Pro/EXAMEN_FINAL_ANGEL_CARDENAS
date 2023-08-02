package Sprint_Examen_Final.modelo.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "Historias_Clinicas")
public class Historias_Clinicas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cedula_Nro_HistoriaClinica;
	@Column(length = 100)
	private String nombre_paciente;
	@Column(length = 100)
	private String apellido_paciente;
	private Date fecha_nacimiento_paciente;

	public Long getCedula_Nro_HistoriaClinica() {
		return cedula_Nro_HistoriaClinica;
	}

	public void setCedula_Nro_HistoriaClinica(Long cedula_Nro_HistoriaClinica) {
		this.cedula_Nro_HistoriaClinica = cedula_Nro_HistoriaClinica;
	}

	public String getNombre_paciente() {
		return nombre_paciente;
	}

	public void setNombre_paciente(String nombre_paciente) {
		this.nombre_paciente = nombre_paciente;
	}

	public String getApellido_paciente() {
		return apellido_paciente;
	}

	public void setApellido_paciente(String apellido_paciente) {
		this.apellido_paciente = apellido_paciente;
	}

	public Date getFecha_nacimiento_paciente() {
		return fecha_nacimiento_paciente;
	}

	public void setFecha_nacimiento_paciente(Date fecha_nacimiento_paciente) {
		this.fecha_nacimiento_paciente = fecha_nacimiento_paciente;
	}

}
