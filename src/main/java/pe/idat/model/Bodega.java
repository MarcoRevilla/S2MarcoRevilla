package pe.idat.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bodegas")
public class Bodega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdBodega;
	private String nombre;
	private String direccion;
	
	@ManyToOne
	@JoinColumn(name="id_producto",
				nullable = false,
				unique = true, 
				foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_producto) references productos(id_producto)"))
	private Producto producto;
	public int getIdBodega() {
		return IdBodega;
	}
	public void setIdBodega(int idBodega) {
		IdBodega = idBodega;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
