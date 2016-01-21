package salacine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import clases.ListadoPeliculas;
import clases.Pelicula;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

public class Interfaz extends Thread{

	private JFrame frame;
	static Pelicula pelicula;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.decode("#27364A"));
		
		JPanel panel = new JPanel();
	////////boton
		JButton botonApellidosCatalanes = new JButton("");
		botonApellidosCatalanes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//panelPelicula.main(null);
				  new InicioCine().main(null);
				pelicula= new Pelicula(1, "OCHO APELLIDOS CATALANES", 
						"Las alarmas de Koldo (Karra Elejalde) se encienden cuando se entera de que su hija Amaia ", 
						"/imagenes/ApellidosCatalanes.PNG");
				
				/*System.out.println("Empezando hilos");
				Thread hilo1 = new InicioCineVentanas(listas);
				 */
				frame.dispose();

			}
			
		});
		
		botonApellidosCatalanes.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/ApellidosCatalanes.PNG")));
		
		JButton botonSinsajo = new JButton("");
		botonSinsajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPelicula_NoSeUsa.main(null);
				pelicula= new Pelicula(2, "SINSAJO PARTE 2", "222", "/imagenes/Sinsajo.PNG");
			
				
				frame.dispose();
			}
		});
		botonSinsajo.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/Sinsajo.PNG")));
		
		JButton botonStarWars = new JButton("");
		botonStarWars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPelicula_NoSeUsa.main(null);
				pelicula= new Pelicula(3, "STAR WARS EPIDOSIO VII", "3333", "/imagenes/StarWars.PNG");
			
				
				frame.dispose();
			}
		});
		botonStarWars.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/StarWars.PNG")));
		
		JButton botonHotel = new JButton("");
		botonHotel.setBackground(Color.decode("#27364A"));
		botonHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPelicula_NoSeUsa.main(null);
				pelicula= new Pelicula(5, "HOTEL TRANSILVANIA", "4444", "/imagenes/hotel.PNG");
			
				
				frame.dispose();
			}
		});
		botonHotel.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/hotel.PNG")));
		
		JButton botonArlo = new JButton("");
		botonArlo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPelicula_NoSeUsa.main(null);
				pelicula= new Pelicula(4, "EL VIAJE DE ARLO", "5555", "/imagenes/arlo.PNG");
			
				
				frame.dispose();
			}
		});
		botonArlo.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/arlo.PNG")));
		
		JButton botonKrampus = new JButton("");
		botonKrampus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPelicula_NoSeUsa.main(null);
				pelicula= new Pelicula(6, "KRAMPUS MALDITA NAVIDAD", "5555", "/imagenes/krampus.PNG");
			
				
				frame.dispose();
				
			}
		});
		botonKrampus.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/krampus.PNG")));
		
		JButton botonPuente = new JButton("");
		botonPuente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPelicula_NoSeUsa.main(null);
				pelicula= new Pelicula(7, "EL PUENTE DE LOS ESPIAS", "5555", "/imagenes/puente.PNG");
			
				
				frame.dispose();
			}
		});
		botonPuente.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/puente.PNG")));
		
		JButton botonSicario = new JButton("");
		botonSicario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPelicula_NoSeUsa.main(null);
				pelicula= new Pelicula(8, "SICARIO", "5555", "/imagenes/sicario.PNG");
			
				
				frame.dispose();
			}
		});
		botonSicario.setIcon(new ImageIcon(Interfaz.class.getResource("/imagenes/sicario.PNG")));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(botonHotel, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(botonApellidosCatalanes, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(botonKrampus, 0, 0, Short.MAX_VALUE)
						.addComponent(botonSinsajo, GroupLayout.PREFERRED_SIZE, 193, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(botonStarWars, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(botonArlo, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(botonPuente, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(botonSicario, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
					.addGap(47))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(botonApellidosCatalanes, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonSinsajo, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonStarWars, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonArlo, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(botonSicario, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonPuente, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonKrampus, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonHotel, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(124, Short.MAX_VALUE))
		);
		
		JLabel textoCabecera = new JLabel("RESERVEA-T");
		textoCabecera.setVerticalAlignment(SwingConstants.BOTTOM);
		textoCabecera.setFont(new Font("Godzilla", Font.PLAIN, 26));
		textoCabecera.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textoCabecera, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textoCabecera)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(300, 20, 869, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
