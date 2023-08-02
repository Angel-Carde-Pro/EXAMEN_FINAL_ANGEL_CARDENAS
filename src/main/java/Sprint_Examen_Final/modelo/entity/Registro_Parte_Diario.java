package Sprint_Examen_Final.modelo.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Registro_Parte_Diario")
public class Registro_Parte_Diario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_parte_diario;
	@ManyToOne
	@JoinColumn(name = "cedula_Nro_HistoriaClinica_fk", referencedColumnName = "cedula_Nro_HistoriaClinica")
	private Historias_Clinicas historias_clinicas;
	private Date fecha_registro;

	@ManyToOne
	@JoinColumn(name = "codigo_fk", referencedColumnName = "codigo")
	private Unidad_Operativa unidad_cooperativa;
	private Integer n_visitas;
	private double peso;
	private double talla;

	public Long getId_parte_diario() {
		return id_parte_diario;
	}

	public void setId_parte_diario(Long id_parte_diario) {
		this.id_parte_diario = id_parte_diario;
	}

	public Historias_Clinicas getHistorias_clinicas() {
		return historias_clinicas;
	}

	public void setHistorias_clinicas(Historias_Clinicas historias_clinicas) {
		this.historias_clinicas = historias_clinicas;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Unidad_Operativa getUnidad_cooperativa() {
		return unidad_cooperativa;
	}

	public void setUnidad_cooperativa(Unidad_Operativa unidad_cooperativa) {
		this.unidad_cooperativa = unidad_cooperativa;
	}

	public Integer getN_visitas() {
		return n_visitas;
	}

	public void setN_visitas(Integer n_visitas) {
		this.n_visitas = n_visitas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

}
