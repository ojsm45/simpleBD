package interfaz;

import proyecto1.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class DatosMateria extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField textCodigo;
	private JTextField textCupos;

	public DatosMateria(Materia materias[]) {
		setTitle("Ingresar datos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDatosDeLa = new JLabel("  DATOS DE LA NUEVA MATERIA");
			lblDatosDeLa.setBounds(65, 24, 285, 22);
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
			JLabel lblCdigo = new JLabel("C\u00F3digo:");
			lblCdigo.setBounds(75, 112, 64, 21);
			lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 17));
			contentPanel.add(lblCdigo);
		}
		{
			JLabel lblCupos = new JLabel("Cupos");
			lblCupos.setBounds(75, 149, 64, 21);
			lblCupos.setFont(new Font("Tahoma", Font.PLAIN, 17));
			contentPanel.add(lblCupos);
		}

		textNombre = new JTextField();
		textNombre.setBounds(154, 73, 146, 26);
		contentPanel.add(textNombre);
		textNombre.setColumns(10);

		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(154, 110, 146, 26);
		contentPanel.add(textCodigo);

		textCupos = new JTextField();
		textCupos.setColumns(10);
		textCupos.setBounds(154, 147, 146, 26);
		contentPanel.add(textCupos);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent arg0) {
						Materia nuevaMateria = new Materia(textNombre.getText(), textCodigo.getText(),
								textCupos.getText(), 0, new Profesor());
						Main.ingresarMateria(materias, nuevaMateria);
						dispose();
					}
				});
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Materia nuevaMateria = new Materia(textNombre.getText(), textCodigo.getText(),
								textCupos.getText(), 0, new Profesor());
						Main.ingresarMateria(materias, nuevaMateria);
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
