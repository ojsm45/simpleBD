package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import proyecto1.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.Color;

@SuppressWarnings("serial")
public class VentanaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VentanaMenu(File archivo, Materia materias[]) {
		setResizable(false);
		setTitle("Proyecto 1 - Base de Datos Simple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenPrincipal = new JLabel("Men\u00FA Principal");
		lblMenPrincipal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblMenPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenPrincipal.setBounds(59, 16, 355, 65);
		contentPane.add(lblMenPrincipal);

		JLabel lblIngresarMateria = new JLabel("1.- Ingresar Materia.");
		lblIngresarMateria.setForeground(Color.BLACK);

		lblIngresarMateria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatosMateria datos = new DatosMateria(materias);
				datos.setVisible(true);
				datos.setLocationRelativeTo(null);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblIngresarMateria.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblIngresarMateria.setForeground(Color.BLACK);
			}
		});
		lblIngresarMateria.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIngresarMateria.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngresarMateria.setBounds(125, 105, 202, 22);
		contentPane.add(lblIngresarMateria);

		JLabel lblIngresarProfesor = new JLabel("2.- Ingresar Profesor.");
		lblIngresarProfesor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatosProfesor datos = new DatosProfesor(materias);
				datos.setVisible(true);
				datos.setLocationRelativeTo(null);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblIngresarProfesor.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblIngresarProfesor.setForeground(Color.BLACK);
			}
		});
		lblIngresarProfesor.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngresarProfesor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIngresarProfesor.setBounds(125, 130, 202, 22);
		contentPane.add(lblIngresarProfesor);

		JLabel lblIngresarEstudiante = new JLabel("3.- Ingresar Estudiante.");
		lblIngresarEstudiante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatosEstudiante datos = new DatosEstudiante(materias);
				datos.setVisible(true);
				datos.setLocationRelativeTo(null);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblIngresarEstudiante.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblIngresarEstudiante.setForeground(Color.BLACK);
			}
		});
		lblIngresarEstudiante.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngresarEstudiante.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIngresarEstudiante.setBounds(125, 155, 229, 22);
		contentPane.add(lblIngresarEstudiante);

		JLabel lblBorrarMateria = new JLabel("4.- Borrar Materia.");
		lblBorrarMateria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.borrarMateria(materias);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblBorrarMateria.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblBorrarMateria.setForeground(Color.BLACK);
			}
		});
		lblBorrarMateria.setHorizontalAlignment(SwingConstants.LEFT);
		lblBorrarMateria.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBorrarMateria.setBounds(125, 179, 202, 22);
		contentPane.add(lblBorrarMateria);

		JLabel lblBorrarProfesor = new JLabel("5.- Borrar Profesor.");
		lblBorrarProfesor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.borrarProfesor(materias);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblBorrarProfesor.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblBorrarProfesor.setForeground(Color.BLACK);
			}
		});
		lblBorrarProfesor.setHorizontalAlignment(SwingConstants.LEFT);
		lblBorrarProfesor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBorrarProfesor.setBounds(125, 203, 202, 22);
		contentPane.add(lblBorrarProfesor);

		JLabel lblBorrarEstudiante = new JLabel("6.- Borrar Estudiante.");
		lblBorrarEstudiante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.borrarEstudiante(materias);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblBorrarEstudiante.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblBorrarEstudiante.setForeground(Color.BLACK);
			}
		});
		lblBorrarEstudiante.setHorizontalAlignment(SwingConstants.LEFT);
		lblBorrarEstudiante.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBorrarEstudiante.setBounds(125, 228, 213, 22);
		contentPane.add(lblBorrarEstudiante);

		JLabel lblConsultarMateria = new JLabel("7.- Consultar Materia.");
		lblConsultarMateria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.consultarMateria(materias);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblConsultarMateria.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblConsultarMateria.setForeground(Color.BLACK);
			}
		});
		lblConsultarMateria.setHorizontalAlignment(SwingConstants.LEFT);
		lblConsultarMateria.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConsultarMateria.setBounds(125, 253, 202, 22);
		contentPane.add(lblConsultarMateria);

		JLabel lblConsultarProfesor = new JLabel("8.- Consultar un Profesor");
		lblConsultarProfesor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.consultarProfesor(materias);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblConsultarProfesor.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblConsultarProfesor.setForeground(Color.BLACK);
			}
		});
		lblConsultarProfesor.setHorizontalAlignment(SwingConstants.LEFT);
		lblConsultarProfesor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConsultarProfesor.setBounds(125, 277, 239, 22);
		contentPane.add(lblConsultarProfesor);

		JLabel lblConsultarProfesores = new JLabel("9.- Consultar todos los Profesores.");
		lblConsultarProfesores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.consultarProfesores(materias);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblConsultarProfesores.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblConsultarProfesores.setForeground(Color.BLACK);
			}
		});
		lblConsultarProfesores.setHorizontalAlignment(SwingConstants.LEFT);
		lblConsultarProfesores.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConsultarProfesores.setBounds(125, 301, 317, 22);
		contentPane.add(lblConsultarProfesores);

		JLabel lblConsultarEstudiantes = new JLabel("10.- Consultar lista de Estudiantes.");
		lblConsultarEstudiantes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.consultarListaEstudiantes(materias);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblConsultarEstudiantes.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblConsultarEstudiantes.setForeground(Color.BLACK);
			}
		});
		lblConsultarEstudiantes.setHorizontalAlignment(SwingConstants.LEFT);
		lblConsultarEstudiantes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConsultarEstudiantes.setBounds(125, 326, 317, 22);
		contentPane.add(lblConsultarEstudiantes);

		JButton btnGuardarCambios = new JButton("Guardar Cambios.");
		btnGuardarCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.guardarCambios(archivo, materias);
			}
		});
		
		btnGuardarCambios.setIcon(new ImageIcon(getClass().getResource("/icons/guardarIcon (Custom).png")));
		btnGuardarCambios.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnGuardarCambios.setBounds(135, 363, 219, 50);
		contentPane.add(btnGuardarCambios);
	}
}
