package Sprint_Examen_Final.modelo.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "Area")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_area;
	@Column(length = 1000)
	private String nombre_area;

	public Long getId_area() {
		return id_area;
	}

	public void setId_area(Long id_area) {
		this.id_area = id_area;
	}

	public String getNombre_area() {
		return nombre_area;
	}

	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}

}
