package interfaz;

import proyecto1.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class DatosEstudiante extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField textCedula;
	private JTextField textMatCur;

	public DatosEstudiante(Materia materias[]) {
		setTitle("Ingresar datos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDatosDeLa = new JLabel("  DATOS DEL NUEVO ESTUDIANTE");
			lblDatosDeLa.setBounds(55, 24, 303, 22);
			lblDatosDeLa.setFont(new Font("Tahoma", Font.BOLD, 18));
			contentPanel.add(lblDatosDeLa);
		}
		{
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(75, 75, 64, 21);
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblCdigo = new JLabel("C\u00E9dula:");
			lblCdigo.setBounds(75, 112, 64, 21);
			lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 17));
			contentPanel.add(lblCdigo);
		}
		{
			JLabel lblCupos = new JLabel("Materias");
			lblCupos.setBounds(55, 139, 78, 26);
			lblCupos.setFont(new Font("Tahoma", Font.PLAIN, 17));
			contentPanel.add(lblCupos);
		}

		textNombre = new JTextField();
		textNombre.setBounds(154, 73, 146, 26);
		contentPanel.add(textNombre);
		textNombre.setColumns(10);

		textCedula = new JTextField();
		textCedula.setColumns(10);
		textCedula.setBounds(154, 110, 146, 26);
		contentPanel.add(textCedula);

		textMatCur = new JTextField();
		textMatCur.setColumns(10);
		textMatCur.setBounds(154, 152, 146, 37);
		contentPanel.add(textMatCur);
		{
			JLabel lblCursadas = new JLabel("cursadas:");
			lblCursadas.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblCursadas.setBounds(55, 163, 78, 26);
			contentPanel.add(lblCursadas);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent arg0) {
						Estudiante nuevoEstudiante = new Estudiante(textNombre.getText(), textCedula.getText(),
								textMatCur.getText());
						Main.ingresarEstudiante(materias, nuevoEstudiante);
						dispose();
					}
				});
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Estudiante nuevoEstudiante = new Estudiante(textNombre.getText(), textCedula.getText(),
								textMatCur.getText());
						Main.ingresarEstudiante(materias, nuevoEstudiante);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
