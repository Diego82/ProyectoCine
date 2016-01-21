package salacine;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import clases.Reserva;

class InicioCineVentanas4 extends Thread{

	static ListasCine listas;
	Timer timer;
	JFrame pantalla = new JFrame();
	JPanel panel_3AbajoDetalle = new JPanel();
	JPanel panel_2ArribaDetalle = new JPanel();
	JButton asiento[] = new JButton[41];
	JRadioButton hora[] = new JRadioButton[4];
	ButtonGroup grupoRadioBotones= new ButtonGroup();
	ArrayList<JButton> listaAsientos1 = new ArrayList<JButton>();
	
	ArrayList<JRadioButton> listaHoras = new ArrayList<JRadioButton>();
	//listas para las horas
	ArrayList<String> horas= new ArrayList<String>();
	
	
	
	public InicioCineVentanas4(ListasCine listas){
		this.listas = listas;
		System.out.println("Esto sale ahora");
	}
	
	

	/**
	 * Launch the application.
	 */
	@Override
	public void run() {
		try {
			InicioCineVentanas4 window = new InicioCineVentanas4();
			window.pantalla.setVisible(true);
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
	public InicioCineVentanas4() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pantalla = new JFrame();
		pantalla.setBackground(Color.decode("#27364A"));
		pantalla.setResizable(false);
		pantalla.getContentPane().setBackground(Color.decode("#27364A"));
		pantalla.setBounds(300, 20, 869, 675);
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JSplitPane splitPane = new JSplitPane();
		splitPane.setBackground(Color.decode("#27364A"));
		GroupLayout groupLayout = new GroupLayout(pantalla.getContentPane());
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
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_2ArribaDetalle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_3AbajoDetalle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2ArribaDetalle, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_3AbajoDetalle, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
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
		etiquetaImagen.setIcon(new ImageIcon(InicioCine.class.getResource("/imagenes/ApellidosCatalanes.PNG")));

		JLabel etiquetaTitulo = new JLabel("OCHO APELLIDOS CATALANES");
		etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel etiquetaSpnosis = new JLabel("Spnosis");

		etiquetaSpnosis.setVerticalAlignment(SwingConstants.TOP);
		etiquetaSpnosis.setHorizontalAlignment(SwingConstants.LEFT);

		JButton btnNewButton_1 = new JButton("");

		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);

		btnNewButton_1.setIcon(new ImageIcon(InicioCine.class.getResource("/imagenesAsientos/libre16.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup().addGap(10)
												.addComponent(btnNewButton_1))
						.addComponent(etiquetaSpnosis, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup().addGap(34).addComponent(etiquetaImagen))
						.addComponent(etiquetaTitulo, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		gl_panel_1
				.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(etiquetaTitulo)
								.addGap(18).addComponent(etiquetaImagen).addGap(18)
								.addComponent(etiquetaSpnosis, GroupLayout.PREFERRED_SIZE, 48,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnNewButton_1)
								.addContainerGap(233, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);
		pantalla.getContentPane().setLayout(groupLayout);
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
			pantalla.repaint();
			pantalla.revalidate();
			
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
						
						pintarSala(listas.listaReservas16);
						
						break;

					case "18:00":
						pintarSala(listas.listaReservas17);
						

						break;
					case "20:00":
						pintarSala(listas.listaReservas18);
						

						break;
					case "22:00":
						pintarSala(listas.listaReservas19);
						

						break;
					case "24:00":
						pintarSala(listas.listaReservas20);
						

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
		pantalla.repaint();
		pantalla.revalidate();
		
		
	}

	
}
