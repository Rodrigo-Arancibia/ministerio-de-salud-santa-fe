package ar.com.hospitales.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import ar.com.hospitales.accesoDatos.Controller;

public class AtencionCompleja extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDomicilio;
	private JLabel lblDomicilio;
	private JTextField txtDirector;
	private JTextField txtCapacidad;
	private JButton btnVolver;
	private JButton btnAlta;
	private JTextField txtCantCamas;
	private JLabel lblEspecialidad;
	private JTextField txtEspecialidad;

	public AtencionCompleja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(495, 361);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Alta Complejidad",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(38, 30, 62, 14);
		contentPane.add(lblNombre);

		lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(38, 60, 62, 14);
		contentPane.add(lblDomicilio);

		txtNombre = new JTextField();
		txtNombre.setBounds(160, 27, 150, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtDomicilio = new JTextField();
		txtDomicilio.setBounds(160, 57, 150, 20);
		contentPane.add(txtDomicilio);
		txtDomicilio.setColumns(10);

		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setBounds(38, 90, 62, 14);
		contentPane.add(lblDirector);

		txtDirector = new JTextField();
		txtDirector.setBounds(160, 87, 150, 20);
		contentPane.add(txtDirector);
		txtDirector.setColumns(10);
		JLabel lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setBounds(38, 120, 70, 14);
		contentPane.add(lblCapacidad);

		txtCapacidad = new JTextField();
		txtCapacidad.setBounds(160, 117, 150, 20);
		contentPane.add(txtCapacidad);
		txtCapacidad.setColumns(10);

		lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setBounds(38, 148, 95, 14);
		contentPane.add(lblEspecialidad);

		txtEspecialidad = new JTextField();
		txtEspecialidad.setColumns(10);
		txtEspecialidad.setBounds(160, 145, 150, 20);
		contentPane.add(txtEspecialidad);

		JLabel labelCantCamas = new JLabel("Cantidad de camas:");
		labelCantCamas.setBounds(38, 176, 115, 14);
		contentPane.add(labelCantCamas);

		txtCantCamas = new JTextField();
		txtCantCamas.setColumns(10);
		txtCantCamas.setBounds(160, 173, 150, 20);
		contentPane.add(txtCantCamas);

		btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nombre = txtNombre.getText();
				String domicilio = txtDomicilio.getText();
				String director = txtDirector.getText();
				int capacidad = Integer.valueOf(txtCapacidad.getText());
				String especialidad = txtEspecialidad.getText();
				int cantCamas = Integer.valueOf(txtCantCamas.getText());

				
				
				boolean devolucion = Controller.ministerio.crearHospitalAltaComplejidad(nombre, domicilio, director,
						capacidad, especialidad, cantCamas);
				
				if (devolucion) {
					JOptionPane.showMessageDialog(null, "Hospital guardado correctamente!");
				}
					else {
						JOptionPane.showMessageDialog(null, "Error");
					}
			}
		});

		btnAlta.setBounds(70, 289, 89, 23);
		contentPane.add(btnAlta);

		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal mp = new MenuPrincipal();
				mp.setVisible(true);
				dispose();
			}
		});

		btnVolver.setBounds(317, 289, 89, 23);
		contentPane.add(btnVolver);

	}
}