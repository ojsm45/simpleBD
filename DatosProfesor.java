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
public class DatosProfesor extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField textCedula;
	private JTextField textCategoria;
	private JTextField textDedicacion;

	public DatosProfesor(Materia materias[]) {
		setTitle("Ingresar datos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDatosDeLa = new JLabel("  DATOS DEL NUEVO PROFESOR");
			lblDatosDeLa.setBounds(65, 24, 285, 22);
			lblDatosDeLa.setFont(new Font("Tahoma", Font.BOLD, 18));
			contentPanel.add(lblDatosDeLa);
		}
		{
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(52, 64, 87, 21);
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblCdigo = new JLabel("C\u00E9dula:");
			lblCdigo.setBounds(52, 101, 87, 21);
			lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 17));
			contentPanel.add(lblCdigo);
		}
		{
			JLabel lblCupos = new JLabel("Categoria:");
			lblCupos.setBounds(52, 138, 87, 21);
			lblCupos.setFont(new Font("Tahoma", Font.PLAIN, 17));
			contentPanel.add(lblCupos);
		}

		textNombre = new JTextField();
		textNombre.setBounds(154, 62, 146, 26);
		contentPanel.add(textNombre);
		textNombre.setColumns(10);

		textCedula = new JTextField();
		textCedula.setColumns(10);
		textCedula.setBounds(154, 99, 146, 26);
		contentPanel.add(textCedula);

		textCategoria = new JTextField();
		textCategoria.setColumns(10);
		textCategoria.setBounds(154, 136, 146, 26);
		contentPanel.add(textCategoria);
		{
			JLabel lblDedicacin = new JLabel("Dedicaci\u00F3n:");
			lblDedicacin.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblDedicacin.setBounds(52, 177, 87, 21);
			contentPanel.add(lblDedicacin);
		}
		{
			textDedicacion = new JTextField();
			textDedicacion.setColumns(10);
			textDedicacion.setBounds(154, 175, 146, 26);
			contentPanel.add(textDedicacion);
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
						Profesor nuevoProfesor = new Profesor(textNombre.getText(), textCedula.getText(),
								textCategoria.getText(), textDedicacion.getText());
						Main.ingresarProfesor(materias, nuevoProfesor);
						dispose();
					}
				});
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Profesor nuevoProfesor = new Profesor(textNombre.getText(), textCedula.getText(),
								textCategoria.getText(), textDedicacion.getText());
						Main.ingresarProfesor(materias, nuevoProfesor);
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