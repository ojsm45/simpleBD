package proyecto1;

public class Estudiante {

	private String nombre;
	private String cedula;
	private String matCur;

	public Estudiante(String nombreE, String cedulaE, String matCursadas) {

		this.nombre = nombreE;
		this.cedula = cedulaE;
		this.matCur = matCursadas;
	}

	Estudiante() {
		this.nombre = "Vacio";
		this.cedula = "Vacio";
		this.matCur = "Vacio";
	}

	public String toString() {
		return "\r\n" + "Nombre del estudiante: " + nombre + "\r\n" + "Cédula: " + cedula + "\r\n"
				+ "Materias cursadas: " + matCur + "\r\n";
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

	public String getMatCur() {
		return matCur;
	}

	public void setMatCur(String matCur) {
		this.matCur = matCur;
	}
}
