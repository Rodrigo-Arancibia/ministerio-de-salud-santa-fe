package ar.com.hospitales.vista;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import ar.com.hospitales.accesoDatos.MySqlTransaccionHospital;
import ar.com.hospitales.modelo.MinisterioSalud;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import java.awt.Color;

public class InformeHospital extends JFrame{

	private JFrame frame;
	private JPanel contentPane;
	private MySqlTransaccionHospital transaccionHospital = new MySqlTransaccionHospital();
	
	private MinisterioSalud ministerio = new MinisterioSalud();
	
	public InformeHospital() {
		
		setSize(527,591);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Atencion Primaria", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuPrincipal mp = new MenuPrincipal();
				mp.setVisible(true);
				dispose();
			}
		});
		
		// ***************************************************************************************************************************
		
		/* PANEL HOSPITAL ALTA COMPLEJIDAD:
		 * 
		 * 
		 * 
		 */
		JPanel panelHospAltaComp = new JPanel();
		panelHospAltaComp.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del Hospital Alta Complejidad:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblNombre_H_AC = new JLabel("Nombre:");

		JLabel lblDomicilio_H_AC = new JLabel("Domicilio:");
		
		JLabel lblDirector_H_AC = new JLabel("Director:");
		
		JLabel lblCapacidad_H_AC = new JLabel("Capacidad:");
		
		JLabel lblEspecialidad_H_AC = new JLabel("Especialidad:");
		
		JLabel lblCantCamas_H_AC = new JLabel("<html>Cantidad de camas:</html>");
		
		
		JLabel lblMuestraNombre_H_AC = new JLabel("");
		
		JLabel lblMuestraDomicilio_H_AC = new JLabel("");
		
		JLabel lblMuestraDirector_H_AC = new JLabel("");
		
		JLabel lblMuestraCapacidad_H_AC = new JLabel("");
		
		JLabel lblMuestraEspecialidad_H_AC = new JLabel("");
		
		JLabel lblMuestraCantCamas_H_AC = new JLabel("");
		
		
		try {
			
			lblMuestraNombre_H_AC.setText(transaccionHospital.devolver_un_H_AC().getNombre());
			
			lblMuestraDomicilio_H_AC.setText(transaccionHospital.devolver_un_H_AC().getDomicilio());
				
			lblMuestraDirector_H_AC.setText(transaccionHospital.devolver_un_H_AC().getDirector());		
				
			String capacidad = String.valueOf(transaccionHospital.devolver_un_H_AC().getCapacidad());
			lblMuestraCapacidad_H_AC.setText(capacidad);
		
			lblMuestraEspecialidad_H_AC.setText(transaccionHospital.devolver_un_H_AC().getEspecialidad());
			
			String cantCamas = String.valueOf(transaccionHospital.devolver_un_H_AC().getCant_camas());
			lblMuestraCantCamas_H_AC.setText(cantCamas);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
		// ***************************************************************************************************************************
		
		/* PANEL HOSPITAL ATENCION PRIMARIA:
		 * 
		 * 
		 * 
		 */
		JPanel panelHospAtencionPrimaria = new JPanel();
		panelHospAtencionPrimaria.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del Hospital Atencion Primaria:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		
		JLabel lblNombre_H_AP = new JLabel("Nombre:");
		
		JLabel lblDomicilio_H_AP = new JLabel("Domicilio:");
		
		JLabel lblDirector_H_AP = new JLabel("Director:");
		
		JLabel lblCapacidad_H_AP = new JLabel("Capacidad:");
		
		JLabel lblTieneLaboratorio_H_AP = new JLabel("Tiene laboratorio?");
		
		JLabel lblTieneRadiologia_H_AP = new JLabel("Tiene radiologia?");
		
		JLabel lblTieneVacunatorio_H_AP = new JLabel("Tiene vacunatorio?");
		
		
		JLabel lblMuestraNombre_H_AP = new JLabel("");
		
		JLabel lblMuestraDomicilio_H_AP = new JLabel("");
		
		JLabel lblMuestraDirector_H_AP = new JLabel("");
		
		JLabel lblMuestraCapacidad_H_AP = new JLabel("");
		
		JLabel lblMuestraSiTieneLaboratorio_H_AP = new JLabel("");
		
		JLabel lblMuestraSiTieneRadiologia_H_AP = new JLabel("");
		
		JLabel lblMuestraSiTieneVacunatorio_H_AP = new JLabel("");
		
		
		try {
			
			lblMuestraNombre_H_AP.setText(transaccionHospital.devolver_un_H_AP().getNombre());
			
			lblMuestraDomicilio_H_AP.setText(transaccionHospital.devolver_un_H_AP().getDomicilio());
			
			lblMuestraDirector_H_AP.setText(transaccionHospital.devolver_un_H_AP().getDirector());
			
			String capacidad = String.valueOf(transaccionHospital.devolver_un_H_AP().getCapacidad());
			lblMuestraCapacidad_H_AP.setText(capacidad);
			
			String tieneLaboratorio = String.valueOf(transaccionHospital.devolver_un_H_AP().getTieneLaboratorio());
			lblMuestraSiTieneLaboratorio_H_AP.setText(tieneLaboratorio);
			
			String tieneRadiologia = String.valueOf(transaccionHospital.devolver_un_H_AP().getTieneRadiologia());
			lblMuestraSiTieneRadiologia_H_AP.setText(tieneRadiologia);
			
			String tieneVacunatorio = String.valueOf(transaccionHospital.devolver_un_H_AP().getTieneVacunatorio());
			lblMuestraSiTieneVacunatorio_H_AP.setText(tieneVacunatorio);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ***************************************************************************************************************************
		
		
		
		GroupLayout gl_panelHospAltaComp = new GroupLayout(panelHospAltaComp);
		gl_panelHospAltaComp.setHorizontalGroup(
			gl_panelHospAltaComp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHospAltaComp.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelHospAltaComp.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCantCamas_H_AC, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelHospAltaComp.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNombre_H_AC)
							.addComponent(lblDomicilio_H_AC)
							.addComponent(lblDirector_H_AC, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblCapacidad_H_AC, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblEspecialidad_H_AC, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelHospAltaComp.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelHospAltaComp.createSequentialGroup()
							.addGap(2)
							.addComponent(lblMuestraCapacidad_H_AC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelHospAltaComp.createSequentialGroup()
							.addGap(1)
							.addComponent(lblMuestraNombre_H_AC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMuestraDomicilio_H_AC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelHospAltaComp.createSequentialGroup()
							.addGap(2)
							.addComponent(lblMuestraDirector_H_AC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelHospAltaComp.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 83, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panelHospAltaComp.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMuestraCantCamas_H_AC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMuestraEspecialidad_H_AC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))))
					.addGap(10))
		);
		gl_panelHospAltaComp.setVerticalGroup(
			gl_panelHospAltaComp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHospAltaComp.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelHospAltaComp.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelHospAltaComp.createSequentialGroup()
							.addComponent(lblNombre_H_AC)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDomicilio_H_AC)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDirector_H_AC)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblCapacidad_H_AC)
							.addGap(11)
							.addComponent(lblEspecialidad_H_AC))
						.addGroup(gl_panelHospAltaComp.createSequentialGroup()
							.addComponent(lblMuestraNombre_H_AC)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblMuestraDomicilio_H_AC)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblMuestraDirector_H_AC)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblMuestraCapacidad_H_AC)
							.addGap(11)
							.addComponent(lblMuestraEspecialidad_H_AC, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelHospAltaComp.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCantCamas_H_AC)
						.addComponent(lblMuestraCantCamas_H_AC))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panelHospAltaComp.setLayout(gl_panelHospAltaComp);
		
		
		GroupLayout gl_panelHospAtencionPrimaria = new GroupLayout(panelHospAtencionPrimaria);
		gl_panelHospAtencionPrimaria.setHorizontalGroup(
			gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNombre_H_AP)
							.addComponent(lblDomicilio_H_AP)
							.addComponent(lblDirector_H_AP, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblTieneRadiologia_H_AP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblTieneLaboratorio_H_AP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblCapacidad_H_AP, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
						.addComponent(lblTieneVacunatorio_H_AP, Alignment.LEADING))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
								.addGap(1)
								.addComponent(lblMuestraNombre_H_AP, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
							.addComponent(lblMuestraDomicilio_H_AP, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
								.addGap(2)
								.addComponent(lblMuestraDirector_H_AP, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblMuestraCapacidad_H_AP, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblMuestraSiTieneRadiologia_H_AP, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblMuestraSiTieneLaboratorio_H_AP, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
							.addGap(2)
							.addComponent(lblMuestraSiTieneVacunatorio_H_AP, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(128, Short.MAX_VALUE))
		);
		gl_panelHospAtencionPrimaria.setVerticalGroup(
			gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
							.addComponent(lblNombre_H_AP)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDomicilio_H_AP)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDirector_H_AP)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblCapacidad_H_AP)
							.addGap(11)
							.addComponent(lblTieneLaboratorio_H_AP)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblTieneRadiologia_H_AP)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblTieneVacunatorio_H_AP))
						.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
							.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
								.addComponent(lblMuestraNombre_H_AP)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblMuestraDomicilio_H_AP)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblMuestraDirector_H_AP))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panelHospAtencionPrimaria.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelHospAtencionPrimaria.createSequentialGroup()
									.addGap(25)
									.addComponent(lblMuestraSiTieneLaboratorio_H_AP))
								.addComponent(lblMuestraCapacidad_H_AP))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblMuestraSiTieneRadiologia_H_AP)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblMuestraSiTieneVacunatorio_H_AP)))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panelHospAtencionPrimaria.setLayout(gl_panelHospAtencionPrimaria);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(88)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panelHospAltaComp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panelHospAtencionPrimaria, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))))
					.addContainerGap(99, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelHospAtencionPrimaria, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelHospAltaComp, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(btnVolver)
					.addGap(20))
		);
		getContentPane().setLayout(groupLayout);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
