package proyecto1;

public class Materia {

	private String nombre;
	private String codigo;
	private int cupos;
	private int cantEstudiantes;
	Profesor profesor;
	Estudiante listado[];

	public Materia(String nombreMat, String codigoMat, String cupos, int cantE, Profesor profeMat) {

		this.nombre = nombreMat;
		this.codigo = codigoMat;

		int cuposMat = Integer.valueOf(cupos);
		this.cupos = cuposMat;

		this.cantEstudiantes = cantE;
		profesor = profeMat;

		listado = new Estudiante[cuposMat];

		for (int i = 0; i < listado.length; i++) {
			listado[i] = new Estudiante();
		}
	}

	Materia() {
		this.nombre = "Vacio";
		this.codigo = "Vacio";
		this.cupos = 0;
		this.cantEstudiantes = 0;
		profesor = new Profesor();
		listado = null;

	}

	public String toString() {
		return "\r\n" + "Nombre de materia: " + nombre + "\r\n" + "Código de la materia: " + codigo + "\r\n"
				+ "Cupos totales: " + cupos + "\r\n" + "Cantidad de Estudiantes: " + cantEstudiantes + "\r\n";
	}

	public String putString() {
		String cadena1 = "Materia" + "\t" + nombre + "\t" + codigo + "\t" + cupos + "\t" + cantEstudiantes + "\r\n"
				+ "Profesor" + "\t" + profesor.getNombre() + "\t" + profesor.getCedula() + "\t"
				+ profesor.getCategoria() + "\t" + profesor.getDedicacion() + "\r\n" + "Estudiantes";
		String cadena2 = "";

		for (int j = 0; j < listado.length; j++) {

			if (listado[j].getNombre() != "Vacio") {
				cadena2 = cadena2 + "\r\n" + listado[j].getNombre() + "\t" + listado[j].getCedula() + "\t"
						+ listado[j].getMatCur();
			}
		}
		return cadena1 + cadena2 + "\r\n" + "---------------------";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCupos() {
		return cupos;
	}

	public void setCupos(int cupos) {
		this.cupos = cupos;
	}

	public int getCantEstudiantes() {
		return cantEstudiantes;
	}

	public void setCantEstudiantes(int cantEstudiantes) {
		this.cantEstudiantes = cantEstudiantes;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Estudiante[] getListado() {
		return listado;
	}

	public void setListado(Estudiante[] listado) {
		this.listado = listado;
	}

}
