package ar.com.hospitales.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import ar.com.hospitales.accesoDatos.Controller;

public class AtencionPrimaria extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDomicilio;
	private JTextField txtDirector;
	private JTextField txtCapacidad;
	
	
	public AtencionPrimaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Atencion Primaria", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(24, 28, 61, 14);
		contentPane.add(lblNombre);

		JLabel lblDomicilio = new JLabel("Domicilo:");
		lblDomicilio.setBounds(24, 53, 61, 14);
		contentPane.add(lblDomicilio);
		
		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setBounds(24, 77, 61, 14);
		contentPane.add(lblDirector);
		
		JLabel lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setBounds(24, 102, 72, 14);
		contentPane.add(lblCapacidad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(111, 25, 150, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtDomicilio = new JTextField();
		txtDomicilio.setBounds(111, 50, 150, 20);
		contentPane.add(txtDomicilio);
		txtDomicilio.setColumns(10);

		txtDirector = new JTextField();
		txtDirector.setBounds(111, 74, 150, 20);
		contentPane.add(txtDirector);
		txtDirector.setColumns(10);

		txtCapacidad = new JTextField();
		txtCapacidad.setBounds(111, 99, 150, 20);
		contentPane.add(txtCapacidad);
		txtCapacidad.setColumns(10);

		JCheckBox ckLaboratorio = new JCheckBox("Tiene laboratorio");
		ckLaboratorio.setBounds(300, 25, 123, 23);
		contentPane.add(ckLaboratorio);
		
		JCheckBox ckRadiologia = new JCheckBox("Tiene radiologia");
		ckRadiologia.setBounds(300, 50, 123, 23);
		contentPane.add(ckRadiologia);
		
		JCheckBox ckVacunatorio = new JCheckBox("Tiene vacunatorio");
		ckVacunatorio.setBounds(300, 74, 140, 23);
		contentPane.add(ckVacunatorio);
		
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre = txtNombre.getText();
				String domicilio = txtDomicilio.getText();
				String director = txtDirector.getText();
				int capacidad = Integer.parseInt(txtCapacidad.getText());
				
				boolean laboratorioSelected = ckLaboratorio.isSelected();
				boolean radiologiaSelected = ckRadiologia.isSelected();
				boolean vacunatorioSelected = ckVacunatorio.isSelected();
				
				boolean devolucion = Controller.ministerio.crearHospitalAtencionPrimaria(nombre, domicilio, director,
						capacidad, laboratorioSelected, radiologiaSelected, vacunatorioSelected);
			
				if (devolucion) {
					JOptionPane.showMessageDialog(null, "Hospital guardado correctamente!");
				}
					else {
						JOptionPane.showMessageDialog(null, "Error");
					}
				
			}
		});
		
		btnAlta.setBounds(73, 152, 89, 23);
		contentPane.add(btnAlta);

		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal mp = new MenuPrincipal();
				mp.setVisible(true);
				dispose();

			}
		});
		
		btnVolver.setBounds(286, 152, 89, 23);
		contentPane.add(btnVolver);
	}
}
