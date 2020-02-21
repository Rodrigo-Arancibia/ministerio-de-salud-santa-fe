package ar.com.hospitales.vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	public MenuPrincipal() {
		setTitle("SISTEMA DE SALUD DE SANTA FE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu_Gestion_Hospitalaria = new JMenu("Gestion Hospitalaria");
		menuBar.add(mnMenu_Gestion_Hospitalaria);
		
		JMenuItem mntmAtencionPrimara = new JMenuItem("Atencion Primaria");
		mnMenu_Gestion_Hospitalaria.add(mntmAtencionPrimara);
		mntmAtencionPrimara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AtencionPrimaria ap = new AtencionPrimaria();
				ap.setVisible(true);
				dispose();
			}
		});
		
		JMenuItem mntmAltaComplejidad = new JMenuItem("Alta Complejidad");
		mnMenu_Gestion_Hospitalaria.add(mntmAltaComplejidad);
		mntmAltaComplejidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AtencionCompleja ac = new AtencionCompleja();
				ac.setVisible(true);
				dispose();
			}
		});
		
		JMenu mnMenu_Informacion = new JMenu("Informacion");
		menuBar.add(mnMenu_Informacion);
		
		JMenuItem mntmInformeHospitalario = new JMenuItem("Informe Hospitalario");
		mnMenu_Informacion.add(mntmInformeHospitalario);
		mntmInformeHospitalario.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				InformeHospital ih = new InformeHospital();
				ih.setVisible(true);
				dispose();
			}
		});
		
		JMenu mnAcercaDe = new JMenu("Acerca de");
		menuBar.add(mnAcercaDe);
		
		// "mouseCliked()":
		mnAcercaDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AcercaDe ad = new AcercaDe();
				ad.setVisible(true);
				dispose();
			}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		btnSalir.setBounds(289, 171, 89, 23);
		contentPane.add(btnSalir);
	}
}
