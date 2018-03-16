package proyecto1;

import interfaz.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Main {

	static Materia materias[] = new Materia[20]; // Declaramos el arreglo de
													// objetos materia con el
													// max de 20.

	public static void main(String[] args) { // Inicio del main

		File archivo = new File("BaseDeDatos.txt");
		inicializarArreglo(materias);
		Ventana1 v1 = new Ventana1(archivo, materias);
		v1.setVisible(true);
	} // Fin del main

	public static void inicializarArreglo(Materia materias[]) {
		for (int i = 0; i < materias.length; i++) {
			materias[i] = new Materia();
		}
	}

	public static void ingresarMateria(Materia materias[], Materia nuevaMateria) {
		boolean estado = false;
		for (int i = 0; i < materias.length; i++) {
			if (materias[i].getNombre() == "Vacio") {
				materias[i] = nuevaMateria;
				JOptionPane.showMessageDialog(null, "La Materia ha sido agregada.", "Exito",
						JOptionPane.INFORMATION_MESSAGE);
				estado = true;
				break;
			}
		}
		if (estado == false)
			JOptionPane.showMessageDialog(null, "Ha alcanzado el límite máximo de Materias(20).", "Error",
					JOptionPane.ERROR_MESSAGE);
	}

	public static void ingresarProfesor(Materia materias[], Profesor nuevoProfesor) {
		String elementoABuscar = JOptionPane.showInputDialog(null,
				"Ingrese el nombre o código de la Materia a buscar: ", "Materia a buscar",
				JOptionPane.QUESTION_MESSAGE);

		boolean estado = false;

		for (int i = 0; i < materias.length; i++) {

			if (materias[i].getNombre().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())
					|| materias[i].getCodigo().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())) {
				materias[i].profesor = nuevoProfesor;
				JOptionPane.showMessageDialog(null, "El Profesor ha sido agregado a la Materia.", "Exito",
						JOptionPane.INFORMATION_MESSAGE);
				estado = true;
				break;
			}

		}
		if (estado == false)
			JOptionPane.showMessageDialog(null, "No se ha encontrado la Materia a buscar.", "Error",
					JOptionPane.ERROR_MESSAGE);
	}

	public static void ingresarEstudiante(Materia materias[], Estudiante nuevoEstudiante) {
		String elementoABuscar = JOptionPane.showInputDialog(null,
				"Ingrese el nombre o código de la Materia a buscar: ", "Materia a buscar",
				JOptionPane.QUESTION_MESSAGE);

		boolean estado = false;
		boolean estadoE = false;

		for (int i = 0; i < materias.length; i++) {

			if (materias[i].getNombre().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())
					|| materias[i].getCodigo().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())) {

				if (materias[i].getCantEstudiantes() < materias[i].getCupos()) {
					for (int j = 0; j < materias[i].listado.length; j++) {

						if (materias[i].listado[j].getNombre() == "Vacio") {
							materias[i].listado[j] = nuevoEstudiante;
							materias[i].setCantEstudiantes(materias[i].getCantEstudiantes() + 1);
							JOptionPane.showMessageDialog(null, "El Estudiante ha sido agregado a la Materia.", "Exito",
									JOptionPane.INFORMATION_MESSAGE);
							estadoE = true;
							break;
						}
					}
				}
				estado = true;
			}
		}
		if (estado == false)
			JOptionPane.showMessageDialog(null, "No se ha encontrado la Materia a buscar.", "Error",
					JOptionPane.ERROR_MESSAGE);
		else if (estadoE == false)
			JOptionPane.showMessageDialog(null, "No hay cupos disponibles para esta Materia.", "Error",
					JOptionPane.ERROR_MESSAGE);
	}

	public static void borrarMateria(Materia materias[]) {
		boolean estado = false;
		String elementoABuscar = JOptionPane.showInputDialog(null,
				"Ingrese el nombre o código de la Materia a buscar: ", "Materia a buscar",
				JOptionPane.QUESTION_MESSAGE);

		for (int i = 0; i < materias.length; i++) {

			if (materias[i].getNombre().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())
					|| materias[i].getCodigo().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())) {
				materias[i] = new Materia();
				JOptionPane.showMessageDialog(null, "La Materia se ha borrado.", "Exito",
						JOptionPane.INFORMATION_MESSAGE);
				estado = true;
				break;
			}

		}
		if (estado == false)
			JOptionPane.showMessageDialog(null, "No se ha encontrado la Materia a buscar.", "Error",
					JOptionPane.ERROR_MESSAGE);
	}

	public static void borrarProfesor(Materia materias[]) {
		boolean estado = false;
		String elementoABuscar = JOptionPane.showInputDialog(null,
				"Ingrese el nombre o código de la Materia a buscar: ", "Materia a buscar",
				JOptionPane.QUESTION_MESSAGE);

		for (int i = 0; i < materias.length; i++) {

			if (materias[i].getNombre().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())
					|| materias[i].getCodigo().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())) {
				materias[i].profesor = new Profesor();
				JOptionPane.showMessageDialog(null, "El Profesor se ha borrado de la Materia.", "Exito",
						JOptionPane.INFORMATION_MESSAGE);
				estado = true;
				break;
			}

		}
		if (estado == false)
			JOptionPane.showMessageDialog(null, "No se ha encontrado la Materia a buscar.", "Error",
					JOptionPane.ERROR_MESSAGE);
	}

	public static void borrarEstudiante(Materia materias[]) {
		boolean estado = false;
		String elementoABuscar = JOptionPane.showInputDialog(null,
				"Ingrese el nombre o código de la Materia a buscar: ", "Materia a buscar",
				JOptionPane.QUESTION_MESSAGE);

		for (int i = 0; i < materias.length; i++) {

			if (materias[i].getNombre().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())
					|| materias[i].getCodigo().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())) {

				String estudianteABorrar = JOptionPane.showInputDialog(null,
						"Ingrese el nombre o cédula del Estudiante a borrar: ", "Estudiante a borrar",
						JOptionPane.QUESTION_MESSAGE);

				for (int j = 0; j < materias[i].listado.length; j++) {

					if (materias[i].listado[j].getNombre().toUpperCase().trim()
							.equals(estudianteABorrar.toUpperCase().trim())
							|| materias[i].listado[j].getCedula().toUpperCase().trim()
									.equals(estudianteABorrar.toUpperCase().trim())) {
						materias[i].listado[j] = new Estudiante();
						materias[i].setCantEstudiantes(materias[i].getCantEstudiantes() - 1);
						JOptionPane.showMessageDialog(null, "El Estudiante se ha borrado de la Materia.", "Exito",
								JOptionPane.INFORMATION_MESSAGE);
						estado = true;
						break;
					}
				}
			}
		}
		if (estado == false)
			JOptionPane.showMessageDialog(null, "No se ha encontrado la Materia a buscar.", "Error",
					JOptionPane.ERROR_MESSAGE);
	}

	public static void consultarMateria(Materia materias[]) {
		String elementoABuscar = JOptionPane.showInputDialog(null,
				"Ingrese el nombre o código de la Materia a buscar: ", "Materia a buscar",
				JOptionPane.QUESTION_MESSAGE);
		boolean estado = false;

		for (int i = 0; i < materias.length; i++) {

			if (materias[i].getNombre().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())
					|| materias[i].getCodigo().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())) {
				JOptionPane.showMessageDialog(null, materias[i], "Consulta de Materia",
						JOptionPane.INFORMATION_MESSAGE);
				estado = true;
				break;
			}
		}
		if (estado == false)
			JOptionPane.showMessageDialog(null, "No se ha encontrado la Materia a buscar.", "Error",
					JOptionPane.ERROR_MESSAGE);
	}

	public static void consultarProfesor(Materia materias[]) {
		String elementoABuscar = JOptionPane.showInputDialog(null,
				"Ingrese el nombre o código de la Materia a buscar: ", "Materia a buscar",
				JOptionPane.QUESTION_MESSAGE);
		boolean estado = false;

		for (int i = 0; i < materias.length; i++) {

			if (materias[i].getNombre().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())
					|| materias[i].getCodigo().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())) {
				if (!materias[i].profesor.getNombre().equals("Sin profesor")) {
					JOptionPane.showMessageDialog(null, materias[i].profesor, "Consulta de Profesor",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "La Materia no tiene profesor asignado.", "Información",
							JOptionPane.INFORMATION_MESSAGE);
				}
				estado = true;
				break;
			}
		}
		if (estado == false)
			JOptionPane.showMessageDialog(null, "No se ha encontrado la Materia a buscar.", "Error",
					JOptionPane.ERROR_MESSAGE);
	}

	public static void consultarProfesores(Materia materias[]) {
		boolean estado = false;
		String profesores = "";
		for (int i = 0; i < materias.length; i++) {
			if (!materias[i].profesor.getNombre().equals("Sin profesor")) {
				profesores = profesores + materias[i].profesor;
				estado = true;
			}
		}
		if (estado == false) {
			JOptionPane.showMessageDialog(null, "No hay Profesores para mostrar.", "Información",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, profesores, "Consulta de Profesores", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	public static void consultarListaEstudiantes(Materia materias[]) {
		String elementoABuscar = JOptionPane.showInputDialog(null,
				"Ingrese el nombre o código de la Materia a buscar: ", "Materia a buscar",
				JOptionPane.QUESTION_MESSAGE);
		String estudiantes = "";
		boolean estado = false;
		boolean estadoE = false;

		for (int i = 0; i < materias.length; i++) {

			if (materias[i].getNombre().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())
					|| materias[i].getCodigo().toUpperCase().trim().equals(elementoABuscar.toUpperCase().trim())) {
				for (int j = 0; j < materias[i].listado.length; j++) {

					if (!materias[i].listado[j].getNombre().equals("Vacio")) {
						estudiantes = estudiantes + materias[i].listado[j];
						estadoE = true;
					}
				}
				estado = true;
			}
		}
		if (estado == false)
			JOptionPane.showMessageDialog(null, "No se ha encontrado la Materia a buscar.", "Error",
					JOptionPane.ERROR_MESSAGE);
		else if (estadoE == false)
			JOptionPane.showMessageDialog(null, "No hay estudiantes inscritos en esta Materia.", "Información",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Listado de Estudiantes:" + "\r\n" + estudiantes,
					"Consulta de Estudiantes", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void guardarCambios(File archivo, Materia materias[]) {
		try { // MIENTRAS NO HAYA ERRORES

			if (!archivo.exists()) { // VERIFICAMOS SI EL NO ARCHIVO EXISTE
				archivo.createNewFile(); // LO CREAMOS DE NO EXISTIR
			}
			// CREAMOS UN OBJETO ESCRIBIR DE TIPO BUFFEREDWRITER PARA PODER
			// ESCRIBIR EN EL ARCHIVO
			Writer escribir = new BufferedWriter(new FileWriter(archivo));

			for (int i = 0; i < materias.length; i++) {

				if (materias[i].getNombre() != "Vacio") {
					escribir.write(materias[i].putString() + "\r\n");
				}

			}

			escribir.close(); // CERRAMOS EL BUFFEREDWRITER
			JOptionPane.showMessageDialog(null, "Los datos han sido guardados en la Base de Datos.", "Exito",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) { // CUALQUIER ERROR CAE AQUI
			System.out.println(ex.getMessage());
		}
	}

	public static void cargarEnMemoria(File archivo, Materia materias[]) {
		try {
			if (archivo.exists()) {
				BufferedReader leer = new BufferedReader(new FileReader(archivo));
				String linea;
				int i = 0;

				while ((linea = leer.readLine()) != null) { // INICIO DEL WHILE
															// / LEER ARCHIVO

					StringTokenizer misTokens = new StringTokenizer(linea, "\t");
					String identificador = misTokens.nextToken().trim();

					if ("Materia".equals(identificador)) {
						String nombreMateria = misTokens.nextToken().trim();
						String codigoMateria = misTokens.nextToken().trim();
						String cuposMateria = misTokens.nextToken().trim();
						String cantE = misTokens.nextToken().trim();

						int cantEstudiantes = Integer.parseInt(cantE);

						Materia nuevaMateria = new Materia(nombreMateria, codigoMateria, cuposMateria, cantEstudiantes,
								new Profesor());
						materias[i] = nuevaMateria;
					} else if ("Profesor".equals(identificador)) {
						String nombreProfesor = misTokens.nextToken().trim();
						String cedulaProfesor = misTokens.nextToken().trim();
						String categoriaProfesor = misTokens.nextToken().trim();
						String dedicacionProfesor = misTokens.nextToken().trim();

						Profesor nuevoProfesor = new Profesor(nombreProfesor, cedulaProfesor, categoriaProfesor,
								dedicacionProfesor);
						materias[i].profesor = nuevoProfesor;
					}

					else if ("---------------------".equals(identificador)) {
						i++;
					} else if ("Estudiantes".equals(identificador)) {

					} else {
						String nombreEstudiante = identificador;
						String cedulaEstudiante = misTokens.nextToken().trim();
						String materiasCursadas = misTokens.nextToken().trim();

						Estudiante nuevoEstudiante = new Estudiante(nombreEstudiante, cedulaEstudiante,
								materiasCursadas);

						for (int j = 0; j < materias[i].listado.length; j++) {

							if (materias[i].listado[j].getNombre() == "Vacio") {
								materias[i].listado[j] = nuevoEstudiante;
								break;
							}

						}
					}
				} // FIN DEL WHILE / LEER ARCHIVO
				leer.close();
				JOptionPane.showMessageDialog(null, "Se han cargado los datos desde el archivo.", "Base de Datos leída",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Imposible cargar datos desde el archivo",
						"Base de Datos no encontrada", JOptionPane.ERROR_MESSAGE);

			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
