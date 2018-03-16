package interfaz;

import proyecto1.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;

	public Ventana1(File archivo, Materia[] materias) {

		setTitle("Estructura de Datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblProyecto = new JLabel("Proyecto 1 - Base de Datos Simple");
		lblProyecto.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		lblProyecto.setBounds(15, 16, 398, 42);
		contentPane.add(lblProyecto);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		btnSalir.setBounds(151, 143, 115, 29);
		contentPane.add(btnSalir);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Main.cargarEnMemoria(archivo, materias);
				dispose();
				VentanaMenu ventanaMenu = new VentanaMenu(archivo, materias);
				ventanaMenu.setVisible(true);
			}
		});
		btnIniciar.setBounds(151, 98, 115, 29);
		contentPane.add(btnIniciar);
	}

}
