package salacine;


import clases.Reserva;


import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Toolkit;


public class InicioCine {
	
	
	public static void main(String[] args) {
		ListasCine listas = new ListasCine();
		System.out.println("Empezando hilos");
		Thread hilo1 = new InicioCineVentanas(listas);
		Thread hilo2 = new InicioCineVentanas(listas);
		
		System.out.println("Arrancando hilos");
		hilo1.start();
		hilo2.start();
		System.out.println("Hilos arrancados");
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListasCine window = new ListasCine();
					//window.frame.setVisible(true);
					System.out.println("Hacemos el join");
					hilo1.join();hilo2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		// TODO Auto-generated method stub
		
		
		
		System.out.println(listas);
	}

}


class ListasCine{
	//asi no se sincroniza
	//private List<Integer> listar = new ArrayList<Integer>();
	//asi si : 
	
	//para decir cuales estan reservados
	static List<Reserva>  listaReservaFinal  =  Collections.synchronizedList(new ArrayList<Reserva>());// Esta lista nos 
																			//mostrara los asientos 
																			//que hemos reservado
	
	
	
	JPanel panel_3AbajoDetalle = new JPanel();
	JPanel panel_2ArribaDetalle = new JPanel();
	JButton asiento[] = new JButton[41];
	JRadioButton hora[] = new JRadioButton[4];
	ButtonGroup grupoRadioBotones= new ButtonGroup();
	//
	
	
	List<JButton> listaAsientos1 = Collections.synchronizedList(new ArrayList<JButton>());
	List<Reserva> listaReservas = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	List<Reserva> listaReservas1 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	List<Reserva> listaReservas2 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	List<Reserva> listaReservas3 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	List<Reserva> listaReservas4 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	List<Reserva> listaReservas5 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	List<JRadioButton> listaHoras = Collections.synchronizedList(new ArrayList<JRadioButton>());
	//listas para las horas
	ArrayList<String> horas= new ArrayList<String>();
	public ListasCine() {
		
		crearSalaPrincipal(listaReservas1);
		crearSalaPrincipal(listaReservas2);
		crearSalaPrincipal(listaReservas3);
		crearSalaPrincipal(listaReservas4);
		crearSalaPrincipal(listaReservas5);
		
	}
	
	

	
	public void pintarAsiento(List <Reserva> listaAux, int i){
		
		System.out.println("pintando asiento");
		System.out.println("Tamaño lista principal "+listaReservas1.size());
		
		Reserva sillonAux = listaAux.get(i);
		
		if (sillonAux.isReserva()) {
			System.out.println("PINTA");
			sillonAux.getBoton().setIcon(
					new ImageIcon(InicioCine.class.getResource("/imagenesAsientos/ocupado16.png")));
			sillonAux.setReserva(false);
		} else {
			System.out.println("PINTA");
			sillonAux.getBoton().setIcon(
					new ImageIcon(InicioCine.class.getResource("/imagenesAsientos/libre16.png")));
			sillonAux.setReserva(true);
		}
		
		System.out.println("Valores de la lista"+listaAux);
	}
	
	//crear sillon
	public Reserva crearSillon (int i){
		Reserva sillon = new Reserva(1,i, "1", "1", "1", 0, 1, true);
		return sillon;
	}
	
	
			
			
			
			//PINTAR SALA
				public void crearSalaPrincipal(List<Reserva> listaAux) {
					for (int i = 0; i < 40; i++) {
						//Reserva sillon = new Reserva(1,i, "1", "1", "1", 0, 1, true);
						Reserva sillon = crearSillon(i);
						listaAux.add(sillon);
						int posicion=i;
						
						
						sillon.getBoton().addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent arg0) {
								System.out.println("Tamaño lista aux "+listaAux.size());
								//hay que llamar a una funcion con el objeto listas
								System.out.println("Posicion = "+posicion);
								pintarAsiento(listaAux,posicion);
								//listas.pintarAsiento(sillonAux);
								
								System.out.println(listaAux);
								
								
								
							}
						});
						
					}
					
					
				}
			
			
			
			//PINTAR LOS BOTONES DE LAS HORAS
			public  List<Reserva> crearHorasPrincipal(int numeroLista) {
		
				
			
							switch (numeroLista) {
							case 1:
								System.out.println("lista1");
								return listaReservas1;
								//pintarSala(listaReservas1);
								
								

							case 2:
								//pintarSala(listaReservas2);
								System.out.println("lista2");
								return listaReservas2;


							
							case 3:
								//pintarSala(listaReservas3);
								System.out.println("lista3");
								return listaReservas3;


							case 4:
								//pintarSala(listaReservas4);
								System.out.println("lista4");
								return listaReservas4;


							case 5:
								//pintarSala(listaReservas5);
								System.out.println("lista5");
								return listaReservas5;


							default:
								return null;
								
							}
							
						}
						
				
				
				
			}
	
	




class InicioCineVentanas extends Thread{

	static ListasCine listas;
	Timer timer;
	private JFrame frame = new JFrame();
	JPanel panel_3AbajoDetalle = new JPanel();
	JPanel panel_2ArribaDetalle = new JPanel();
	JButton asiento[] = new JButton[41];
	JRadioButton hora[] = new JRadioButton[4];
	ButtonGroup grupoRadioBotones= new ButtonGroup();
	ArrayList<JButton> listaAsientos1 = new ArrayList<JButton>();
	
	ArrayList<JRadioButton> listaHoras = new ArrayList<JRadioButton>();
	//listas para las horas
	ArrayList<String> horas= new ArrayList<String>();
	
	
	
	public InicioCineVentanas(ListasCine listas){
		this.listas = listas;
		System.out.println("Esto sale ahora");
	}
	
	

	/**
	 * Launch the application.
	 */
	@Override
	public void run() {
		try {
			InicioCineVentanas window = new InicioCineVentanas();
			window.frame.setVisible(true);
			/*listas.listaReservas1 = this.listaReservas1Aux;
			listas.listaReservas2 = this.listaReservas2Aux;
			listas.listaReservas3 = this.listaReservas3Aux;
			listas.listaReservas4 = this.listaReservas4Aux;
			listas.listaReservas5 = this.listaReservas5Aux;*/
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public InicioCineVentanas() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame.setBackground(Color.decode("#27364A"));
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.decode("#27364A"));
		frame.setBounds(300, 20, 869, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setBackground(Color.decode("#27364A"));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup()
						.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, 872, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup()
						.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, 656, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#27364A"));
		splitPane.setRightComponent(panel);

		panel_2ArribaDetalle.setBackground(Color.decode("#17202C"));

		panel_3AbajoDetalle.repaint();
		panel_3AbajoDetalle.setOpaque(true);
		panel_3AbajoDetalle.repaint();
		panel_3AbajoDetalle.setForeground(Color.WHITE);
		panel_3AbajoDetalle.setBackground(Color.decode("#17202C"));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(23, 32, 44));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(panel_2ArribaDetalle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_3AbajoDetalle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 544,
										Short.MAX_VALUE))
						.addContainerGap(39, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_panel.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 44,
												GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_2ArribaDetalle, GroupLayout.PREFERRED_SIZE, 44,
										GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_3AbajoDetalle, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)
				.addGap(21)));
		// fecha del sistema
		LocalDate hoy = LocalDate.now();

		JLabel etiquetaFecha = new JLabel(hoy.getDayOfMonth() + "-" + hoy.getMonthValue() + "-" + hoy.getYear());

		etiquetaFecha.setForeground(Color.WHITE);
		etiquetaFecha.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaFecha.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addComponent(etiquetaFecha, GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
						.addContainerGap()));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addComponent(etiquetaFecha, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);
		panel_2ArribaDetalle.setLayout(new GridLayout(1, 0, 0, 0));
		panel_3AbajoDetalle.setLayout(new GridLayout(0, 9, 0, 0));

		// LLAMAMOS AL METODO PARA PINTAR LA SALA
		/*listas.crearHoras();
		listas.crearSala(1);
		listas.crearSala(2);
		listas.crearSala(3);
		listas.crearSala(4);
		listas.crearSala(5);*/

		
		
		
		// LLAMAMOS AL METODO PARA PINTAR LA SALA
		
		
		
				crearHoras();
				
				/*if (listas.listaReservas1.size()==0){
				System.out.println("Tamaño de la lista antes de llamar a crear sala "+listas.listaReservas1.size());
				crearSala(listas.listaReservas1);
				crearSala(listas.listaReservas2);
				crearSala(listas.listaReservas3);
				crearSala(listas.listaReservas4);
				crearSala(listas.listaReservas5);
				}else System.out.println("Ya se han creado las listas");
				System.out.println("Tamaño de la lista despues de llamar a crear sala "+listas.listaReservas1.size());*/
		
		
			

				panel.setLayout(gl_panel);

				JPanel panel_1 = new JPanel();
				splitPane.setLeftComponent(panel_1);

				JLabel etiquetaImagen = new JLabel("");
				etiquetaImagen.setIcon(new ImageIcon(panelPelicula_NoSeUsa.class.getResource(Interfaz.pelicula.getImagenCartel())));

				JLabel etiquetaTitulo = new JLabel(Interfaz.pelicula.getTitulo());
				etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
				etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));

				JLabel etiquetaSpnosis = new JLabel(Interfaz.pelicula.getSinopsis());

				etiquetaSpnosis.setVerticalAlignment(SwingConstants.TOP);
				etiquetaSpnosis.setHorizontalAlignment(SwingConstants.LEFT);

				JButton btnNewButton_1 = new JButton("");

				btnNewButton_1.setOpaque(false);
				btnNewButton_1.setContentAreaFilled(false);
				btnNewButton_1.setBorderPainted(false);
				btnNewButton_1.setBorder(null);

				btnNewButton_1.setIcon(new ImageIcon(panelPelicula_NoSeUsa.class.getResource("/imagenesAsientos/libre16.png")));
				// volver a la ventana principal
				JButton btnVolver = new JButton("Volver");
				btnVolver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Interfaz.main(null);

						frame.dispose();
					}
				});

				JButton btnReservar = new JButton("Reservar");
				btnReservar.addActionListener(new ActionListener() {
					@SuppressWarnings("unused")
					public void actionPerformed(ActionEvent e) {

						Object[] options = { "Aceptar", "Cancelar" };
						JOptionPane.showOptionDialog(null, ListasCine.listaReservaFinal.toString(), "lista", JOptionPane.DEFAULT_OPTION,
								JOptionPane.WARNING_MESSAGE, null, options, options[0]);

						if (options != null) {
							System.out.println("aceptar");
							// Creamos el pdf

						} else
							System.out.println("cancelar");
						// Se cancela la reserva y vuelve al estado anterior

					}
				});
				GroupLayout gl_panel_1 = new GroupLayout(panel_1);
				gl_panel_1
						.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup().addGap(10)
														.addComponent(btnNewButton_1))
								.addComponent(etiquetaSpnosis, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup().addGap(34).addComponent(etiquetaImagen))
								.addComponent(etiquetaTitulo, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup().addGap(41).addComponent(btnVolver)
								.addGap(18).addComponent(btnReservar).addContainerGap(32, Short.MAX_VALUE)));
				gl_panel_1
						.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(etiquetaTitulo)
										.addGap(18).addComponent(etiquetaImagen).addGap(18)
										.addComponent(etiquetaSpnosis, GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnNewButton_1)
										.addPreferredGap(ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(btnVolver)
												.addComponent(btnReservar))
										.addGap(24)));
				panel_1.setLayout(gl_panel_1);
				frame.getContentPane().setLayout(groupLayout);
	}
	

	
	
	//PINTAR SALA
		private  void pintarSala(List<Reserva> listaSillonFinal) {
			panel_3AbajoDetalle.removeAll();
			System.out.println("Hola k pasa");
			System.out.println(listaSillonFinal.size());
			for (int i = 0; i < listaSillonFinal.size(); i++) {
				
			//Reserva sillonAux = listaSillonFinal.get(i);
			
				panel_3AbajoDetalle.add(listaSillonFinal.get(i).getBoton());
				if (i == 3 || i == 11 || i == 19 || i == 27 || i == 35) {
					JLabel label = new JLabel("");
					panel_3AbajoDetalle.add(label);
				}
			
			
			}
			panel_3AbajoDetalle.repaint();
			frame.repaint();
			frame.revalidate();
			
		}
	
	
	
	//PINTAR LOS BOTONES DE LAS HORAS
	private  void crearHoras() {
		System.out.println("dany");
		
		String[] horasArray={"16:00","18:00","20:00","22:00","24:00"};
		for (int i = 0; i < horasArray.length; i++) {
			
			JRadioButton RBoton = new JRadioButton(horasArray[i]);
			//arreglar esto
			/*Reserva hora=new Reserva(i,i, "1", horasArray[i], "1", 0, 1, true);
			grupoRadioBotones.add(hora.getRadioBoton());
			hora.getRadioBoton().setText(horasArray[i]);*/
			
			grupoRadioBotones.add(RBoton);
			panel_2ArribaDetalle.add(RBoton);
			
			RBoton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					
					
					System.out.println("ENTRA AL ESCUCHADOR");
					switch (RBoton.getText()) {
					case "16:00":
						
						pintarSala(listas.listaReservas1);
						
						break;

					case "18:00":
						pintarSala(listas.listaReservas2);
						

						break;
					case "20:00":
						pintarSala(listas.listaReservas3);
						

						break;
					case "22:00":
						pintarSala(listas.listaReservas4);
						

						break;
					case "24:00":
						pintarSala(listas.listaReservas5);
						

						break;
					default:
						break;
					}
					System.out.println("Termina el escuchador de crear horas horas");
				}
				
			});
			
		
			
			
			}	
		System.out.println("Termina crear horas");
		//repintar
		panel_3AbajoDetalle.repaint();
		frame.repaint();
		frame.revalidate();
		
		
	}

	
	
	
	
	
}
