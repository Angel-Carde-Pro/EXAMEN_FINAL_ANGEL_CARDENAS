package Sprint_Examen_Final.modelo.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "Unidad_Cooperativa")
public class Unidad_Operativa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(length = 1000)
	private String nombre_unidad_cooperativa;
	@ManyToOne
	@JoinColumn(name = "id_area_fk", referencedColumnName = "id_area")
	private Area area;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre_unidad_cooperativa() {
		return nombre_unidad_cooperativa;
	}

	public void setNombre_unidad_cooperativa(String nombre_unidad_cooperativa) {
		this.nombre_unidad_cooperativa = nombre_unidad_cooperativa;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

}
