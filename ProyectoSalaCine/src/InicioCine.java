package salacine;


import clases.Reserva;


import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		// TODO Auto-generated method stub
		ListasCine listas = new ListasCine();
		System.out.println("Empezando hilos");
		
		Thread hilo1 = new Interfaz(listas);
		Thread hilo2 = new Interfaz(listas);
		
		/*Thread hilo1 = new InicioCineVentanas(listas);
		Thread hilo2 = new InicioCineVentanas(listas);*/
		
		System.out.println("Arrancando hilos");
		hilo1.start();
		hilo2.start();
		System.out.println("Hilos arrancados");
		
		try {
			
			System.out.println("Hacemos el join");
			hilo1.join();hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(listas);
	}

}


class ListasCine{
	//asi no se sincroniza
	//private List<Integer> listar = new ArrayList<Integer>();
	//asi si : 
	
	JPanel panel_3AbajoDetalle = new JPanel();
	JPanel panel_2ArribaDetalle = new JPanel();
	JButton asiento[] = new JButton[41];
	JRadioButton hora[] = new JRadioButton[4];
	ButtonGroup grupoRadioBotones= new ButtonGroup();
	List<JButton> listaAsientos1 = Collections.synchronizedList(new ArrayList<JButton>());
	List<Reserva> listaReservas = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	
		//listas de la pelicula 1
		List<Reserva> listaReservas1 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas2 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas3 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas4 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas5 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	
	//listas de la pelicula 1
		List<Reserva> listaReservas6 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas7 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas8 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas9 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas10 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado	
	
		//listas de la pelicula 1
		List<Reserva> listaReservas11 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas12 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas13 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas14 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas15 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		
		//listas de la pelicula 1
		List<Reserva> listaReservas16 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas17 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas18 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas19 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas20 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		
		//listas de la pelicula 1
		List<Reserva> listaReservas21 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas22 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas23 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas24 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas25 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		
		//listas de la pelicula 1
		List<Reserva> listaReservas26 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas27 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas28 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas29 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas30 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		
		//listas de la pelicula 1
		List<Reserva> listaReservas31 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas32 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas33 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas34 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas35 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		
		//listas de la pelicula 1
		List<Reserva> listaReservas36 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas37 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas38 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas39 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
		List<Reserva> listaReservas40 = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	List<JRadioButton> listaHoras = Collections.synchronizedList(new ArrayList<JRadioButton>());
	//listas para las horas
	ArrayList<String> horas= new ArrayList<String>();
	public ListasCine() {
		
		crearSalaPrincipal(listaReservas1);
		crearSalaPrincipal(listaReservas2);
		crearSalaPrincipal(listaReservas3);
		crearSalaPrincipal(listaReservas4);
		crearSalaPrincipal(listaReservas5);
		crearSalaPrincipal(listaReservas6);
		crearSalaPrincipal(listaReservas7);
		crearSalaPrincipal(listaReservas8);
		crearSalaPrincipal(listaReservas9);
		crearSalaPrincipal(listaReservas10);
		crearSalaPrincipal(listaReservas11);
		crearSalaPrincipal(listaReservas12);
		crearSalaPrincipal(listaReservas13);
		crearSalaPrincipal(listaReservas14);
		crearSalaPrincipal(listaReservas15);
		crearSalaPrincipal(listaReservas16);
		crearSalaPrincipal(listaReservas17);
		crearSalaPrincipal(listaReservas18);
		crearSalaPrincipal(listaReservas19);
		crearSalaPrincipal(listaReservas20);
		crearSalaPrincipal(listaReservas21);
		crearSalaPrincipal(listaReservas22);
		crearSalaPrincipal(listaReservas23);
		crearSalaPrincipal(listaReservas24);
		crearSalaPrincipal(listaReservas25);
		crearSalaPrincipal(listaReservas26);
		crearSalaPrincipal(listaReservas27);
		crearSalaPrincipal(listaReservas28);
		crearSalaPrincipal(listaReservas29);
		crearSalaPrincipal(listaReservas30);
		crearSalaPrincipal(listaReservas31);
		crearSalaPrincipal(listaReservas32);
		crearSalaPrincipal(listaReservas33);
		crearSalaPrincipal(listaReservas34);
		crearSalaPrincipal(listaReservas35);
		crearSalaPrincipal(listaReservas36);
		crearSalaPrincipal(listaReservas37);
		crearSalaPrincipal(listaReservas38);
		crearSalaPrincipal(listaReservas39);
		crearSalaPrincipal(listaReservas40);
		
		
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
	






