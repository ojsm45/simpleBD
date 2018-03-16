package proyecto1;

public class Profesor {

	private String nombre;
	private String cedula;
	private String categoria;
	private String dedicacion;

	public Profesor(String nombreP, String cedulaP, String categoriaP, String dedicacionP) {

		this.nombre = nombreP;
		this.cedula = cedulaP;
		this.categoria = categoriaP;
		this.dedicacion = dedicacionP;

	}

	public Profesor() {

		this.nombre = "Sin profesor";
		this.cedula = "N/A";
		this.categoria = "N/A";
		this.dedicacion = "N/A";
	}

	public String toString() {
		return "\r\n" + "Nombre del profesor: " + nombre + "\r\n" + "Cédula: " + cedula + "\r\n" + "Categoria: "
				+ categoria + "\r\n" + "Dedicación: " + dedicacion + "\r\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDedicacion() {
		return dedicacion;
	}

	public void setDedicacion(String dedicacion) {
		this.dedicacion = dedicacion;
	}

}
