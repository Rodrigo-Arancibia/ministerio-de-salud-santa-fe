package ar.com.hospitales.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import ar.com.hospitales.modelo.MinisterioSalud;

public class AcercaDe extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private MinisterioSalud ministerio;

	public AcercaDe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Acerca de",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal mp = new MenuPrincipal();
				mp.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(310, 200, 89, 23);
		contentPane.add(btnVolver);

		JLabel lblInfoFecha = new JLabel("fecha");
		lblInfoFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoFecha.setBounds(90, 60, 230, 50);
		contentPane.add(lblInfoFecha);
		lblInfoFecha.setText(getFecha());
		
		JLabel lblNombreAlumno = new JLabel("Nombre y Apellido del alumno");
		lblNombreAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreAlumno.setBounds(90, 127, 230, 50);
		contentPane.add(lblNombreAlumno);
		lblNombreAlumno.setText(getNombreAlumno());
	}
	
	private String getNombreAlumno() {
		return "Dario Schmetz";
	}
	
	private String getFecha() {

		Calendar fecha = Calendar.getInstance();
		String dia = Integer.toString(fecha.get(Calendar.DATE));
		String mes = Integer.toString(fecha.get(Calendar.MONTH) + 1); // Se le suma 1 ya que en Java los meses empiezan
																		// desde cero para Enero, uno para Febrero, etc.
		String anio = Integer.toString(fecha.get(Calendar.YEAR));

		String retornoFecha = dia + "/" + mes + "/" + anio;

		return retornoFecha;
	}
}
