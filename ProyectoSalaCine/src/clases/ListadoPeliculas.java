package clases;

import java.util.List;

public class ListadoPeliculas {

	List<Pelicula> listadoPeliculas;
	int idPeli = 0;

	public ListadoPeliculas() {
		// TODO Auto-generated constructor stub
		listadoPeliculas.add(new Pelicula(idPeli++, "Star Wars. Episode VII: The Force Awakens aka",
				"TÃ­tulo original\n\t Wars. Episode VII: The Force Awakens aka\n" + "AÃ±o\n\t2015\n"
						+ "DuraciÃ³n\n\t136 min.\n" + "PaÃ­s\n\t[Estados Unidos] Estados Unidos\n"
						+ "Director\n\tJ.J. Abrams\n"
						+ "GuiÃ³n\n\tJ.J. Abrams, Lawrence Kasdan (Personajes: George Lucas)\n"
						+ "MÃºsica\n\tJohn Williams\n" + "FotografÃ­a\n\tDaniel Mindel\n"
						+ "Reparto\n\tJohn Boyega, Daisy Ridley, " + "Harrison Ford, Carrie Fisher, Mark Hamill, "
						+ "Oscar Isaac, Adam Driver, Gwendoline Christie, "
						+ "Lupita Nyong'o, Andy Serkis, Domhnall Gleeson, "
						+ "Max von Sydow, Anthony Daniels, Peter Mayhew,"
						+ " Maisie Richardson-Sellers, Kenny Baker, Katie Jarvis, "
						+ "Christina Chong, Simon Pegg, Miltos Yerolemou, Warwick Davis\n"
						+ "Productora\n\tLucasfilm / Bad Robot / The Walt Disney Company\n"
						+ "GÃ©nero\n\tCiencia ficciÃ³n. Aventuras | Aventura espacial. Star Wars. Secuela. 3-D\n"
						+ "Sinopsis\n\tLa sÃ©ptima entrega de la saga Star Wars continuarÃ¡ 30 aÃ±os despuÃ©s de \"El retorno del Jedi\", con Luke Skywalker intentando restablecer el orden en la galaxia mientras Leia y Han Solo trabajan con la Nueva RepÃºblica contra los restos del Imperio... El episodio VII fue confirmado en octubre de 2012, cuando Walt Disney Company comprÃ³ LucasFilms por 4.000 millones de dÃ³lares. (FILMAFFINITY)\n"
						+ "\n\tPremiere mundial: 14 de diciembre en Los Angeles.\tEstreno en EEUU y EspaÃ±a: 18 de diciembre de 2015.\t"
						+ "Estreno en Reino Unido, Alemania, Chile, Argentina y MÃ©xico: 17 de diciembre\tEstreno en Francia, Italia, BÃ©lgica, Suecia, Dinamarca y Noruega: 16 de diciembre",
				"imagenes/StarWars.PNG"));

		listadoPeliculas.add(new Pelicula(idPeli++, "TÃ­tulo original\n\tThe Hunger Games: Mockingjay - Part 2\n",
				"TÃ­tulo original\n\tThe Hunger Games: Mockingjay - Part 2\n" + "AÃ±o\n\t2015\n"
						+ "DuraciÃ³n\n\t137 min.\n" + "PaÃ­s\n\t[Estados Unidos]  Estados Unidos\n"
						+ "Director\n\tFrancis Lawrence\n" + "GuiÃ³n\n\tDanny Strong (Novela: Suzanne Collins)\n"
						+ "MÃºsica\n\tJames Newton Howard\n" + "FotografÃ­a\n\tJo Willems\n"
						+ "Reparto\n\tJennifer Lawrence, Josh Hutcherson, Sam Claflin, Liam Hemsworth, Donald Sutherland, Julianne Moore, Natalie Dormer, Gwendoline Christie, Philip Seymour Hoffman, Robert Knepper, Stef Dawson, Elden Henson, Evan Ross, Mahershala Ali, Wes Chatham, Omid Abtahi\n"
						+ "Productora\n\tColor Force / Lionsgate\n"
						+ "GÃ©nero\n\tCiencia ficciÃ³n. Aventuras | Thriller futurista. Supervivencia. DistopÃ­a. Secuela\n"
						+ "Sinopsis\n\tLa Ãºltima entrega de 'Los juegos del hambre' nos muestra a una naciÃ³n en guerra, en la que Katniss se enfrenta con uÃ±as y dientes al presidente Snow (Donald Sutherland). Con la ayuda de algunos amigos, entre ellos Gale (Liam Hemsworth), Finnick (Sam Claflin) y Peeta (Josh Hutcherson), arriesgarÃ¡ la vida para salir del Distrito 13 y eliminar al presidente Snow. (FILMAFFINITY)\n",
				"/imagenes/Sinsajo.PNG"));

		listadoPeliculas.add(new Pelicula(idPeli++, "Ocho apellidos catalanes",
				"TÃ­tulo original\n\tOcho apellidos catalanes aka\n" + "AÃ±o\n\t2015\n" + "DuraciÃ³n\n\t99 min.\n"
						+ "PaÃ­s\n\t[EspaÃ±a]  EspaÃ±a\n" + "Director\n\tEmilio MartÃ­nez-LÃ¡zaro\n"
						+ "GuiÃ³n\n\tBorja Cobeaga, Diego San JosÃ©\n" + "MÃºsica\n\tRoque BaÃ±os\n"
						+ "Reparto\n\tDani Rovira, Clara Lago, Karra Elejalde, Carmen Machi, Berto Romero, BelÃ©n Cuesta, Rosa MarÃ­a SardÃ , Alfonso SÃ¡nchez, Alberto LÃ³pez, AgustÃ­n JimÃ©nez\n"
						+ "Productora\n\tTelecinco Cinema\n"
						+ "GÃ©nero\n\tComedia. Romance | Comedia romÃ¡ntica. Secuela\n"
						+ "Sinopsis\n\tLas alarmas de Koldo (Karra Elejalde) se encienden cuando se entera de que su hija Amaia (Clara Lago), tras romper con Rafa (Dani Rovira), se ha enamorado de un catalÃ¡n (Berto Romero). Decide entonces poner rumbo a Sevilla para convencer a Rafa de que lo acompaÃ±e a CataluÃ±a para rescatar a Amaia de los brazos del joven y de su ambiente. Secuela de 'Ocho apellidos vascos'. (FILMAFFINITY)\n",
				"/imagenes/ApellidosCatalanes.PNG"));

		listadoPeliculas.add(new Pelicula(idPeli++, "The Good Dinosaur aka",
				"TÃ­tulo original\n\tThe Good Dinosaur aka \n" + "AÃ±o\n\t2015\n" + "DuraciÃ³n\n\t100 min.\n"
						+ "PaÃ­s\n\t[Estados Unidos]  Estados Unidos\n" + "Director\n\tPeter Sohn \n"
						+ "GuiÃ³n\n\tMeg LeFauve (Historia: Peter Sohn, Erik Benson, Meg LeFauve, Kelsey Mann, Bob Peterson)\n"
						+ "MÃºsica\n\tJeff Danna, Mychael Danna\n" + "FotografÃ­a\n\tAnimation\n"
						+ "Reparto\n\tAnimation\n" + "Productora\n\tPixar Animation Studios / Walt Disney Pictures\n"
						+ "GÃ©nero\n\tAnimaciÃ³n. Comedia. Ciencia ficciÃ³n | Dinosaurios. Prehistoria. Pixar. 3-D \n"
						+ "Sinopsis\n\tÂ¿QuÃ© hubiera pasado si el asteroide que cambiÃ³ para siempre la vida en la Tierra hubiera esquivado el planeta y los dinosaurios no se hubieran extinguido nunca? Un viaje al mundo de los dinosaurios donde un Apatosaurus llamado Arlo se hace amigo de un humano, aunque resulte asombroso. Mientras viaja por un paisaje desolado y misterioso, Arlo aprende a enfrentarse a sus temores y descubre de lo que es capaz. (FILMAFFINITY) \n",
				"/imagenes/arlo.PNG"));

		listadoPeliculas.add(new Pelicula(idPeli++, "Bridge of Spies",
				"TÃ­tulo original\n\tBridge of Spies \n" + "AÃ±o\n\t2015\n" + "DuraciÃ³n\n\t135 min.\n"
						+ "PaÃ­s\n\t[Estados Unidos]  Estados Unidos\n" + "Director\n\tSteven Spielberg \n"
						+ "GuiÃ³n\n\tMatt Charman, Ethan Coen, Joel Coen \n" + "MÃºsica\n\tThomas Newman\n"
						+ "FotografÃ­a\n\tJanusz Kaminski\n"
						+ "Reparto\n\tTom Hanks, Mark Rylance, Amy Ryan, Alan Alda, Scott Shepherd, Sebastian Koch, Billy Magnussen, Eve Hewson, Peter McRobbie, Austin Stowell, Domenick Lombardozzi, Michael Gaston\n"
						+ "Productora\n\tDreamWorks SKG / Fox 2000 Pictures\n"
						+ "GÃ©nero\n\tThriller. Drama | Guerra FrÃ­a. Espionaje. Basado en hechos reales. AÃ±os 50\n"
						+ "Web oficial\n\thttp://bridgeofspies.com/\n"
						+ "Sinopsis\n\tJames Donovan (Tom Hanks), un abogado de Brooklyn, NY, se ve inesperadamente involucrado en plena Guerra FrÃ­a entre su paÃ­s y la URSS cuando la mismÃ­sima CIA le encarga una difÃ­cil misiÃ³n: negociar la liberaciÃ³n de un piloto (Austin Stowell) estadounidense capturado por la UniÃ³n SoviÃ©tica. (FILMAFFINITY)\n"
						+ "\n\tEstreno en USA: octubre 2015.\n\tEstreno en EspaÃ±a: diciembre 2015.\n\tPreestreno: Festival de Nueva York 2015. ",
				"/imagenes/puente.PNG"));

		listadoPeliculas.add(new Pelicula(idPeli++, "Krampus",
				"TÃ­tulo original\n\tKrampus \n" + "AÃ±o\n\t2015\n" + "DuraciÃ³n\n\t98 min.\n"
						+ "PaÃ­s\n\t[Estados Unidos]  Estados Unidos\n" + "Director\n\tMichael Dougherty\n"
						+ "GuiÃ³n\n\tTodd Casey, Michael Dougherty, Zach Shields\n" + "MÃºsica\n\tDouglas Pipes\n"
						+ "FotografÃ­a\n\tJules O'Loughlin\n"
						+ "Reparto\n\tAllison Tolman, Emjay Anthony, Adam Scott, David Koechner, Toni Collette, Conchata Ferrell, Stefania Owen, Gareth Ruck, Leith Towers, Krista Stadler, Mark Atkin, Maverick Flack, Sophie Gannon, Queenie Samuel, Lolo Owen\n"
						+ "Productora\n\tLegendary Pictures\n"
						+ "GÃ©nero\n\tTerror. Comedia. FantÃ¡stico | Sobrenatural. Navidad. Comedia de terror\n"
						+ "Sinopsis\n\tSiniestra versiÃ³n del mito de Santa Claus. SegÃºn una leyenda, un viejo demonio pagano castiga en Navidad a los niÃ±os que no se han portado bien durante el aÃ±o. (FILMAFFINITY)\n",
				"/imagenes/krampus.PNG"));

		listadoPeliculas.add(new Pelicula(idPeli++, "Hotel Transylvania",
				"TÃ­tulo original\n\tHotel Transylvania 2\n" + "AÃ±o\n\t2015\n" + "DuraciÃ³n\n\t89 min.\n"
						+ "PaÃ­s\n\t[Estados Unidos]  Estados Unidos\n" + "Director\n\tGenndy Tartakovsky\n"
						+ "GuiÃ³n\n\tAdam Sandler, Robert Smigel\n" + "MÃºsica\n\tMark Mothersbaugh\n"
						+ "FotografÃ­a\n\tAnimation\n" + "Reparto\n\tAnimation\n"
						+ "Productora\n\tColumbia Pictures / Sony Pictures Animation / Sony Pictures Digital\n"
						+ "GÃ©nero\n\tAnimaciÃ³n. Comedia. FantÃ¡stico | Monstruos. Secuela. 3-D\n"
						+ "Sinopsis\n\tTodo parece mejorar en el Hotel Transilvania. La rÃ­gida norma establecida por DrÃ¡cula de â€œsÃ³lo para monstruosâ€� se ha suprimido y se aceptan tambiÃ©n huÃ©spedes humanos. Lo que preocupa al conde es que que su adorable nieto Dennis, medio humano y medio vampiro, no dÃ© seÃ±al alguna de vampirismo. Aprovechando que Mavis ha ido a visitar a sus suegros humanos, DrÃ¡cula recluta a sus amigos Frank, Murray, Wayne y Griffin para hacer que Dennis pase por un campamento de â€œentrenamiento de monstruosâ€�. Lo que ignoran es que Vlad, el gruÃ±Ã³n padre de DrÃ¡cula, estÃ¡ a punto de llegar al hotel. Y cuando descubra que su bisnieto no es de sangre pura y que los humanos pueden frecuentar el establecimiento las cosas se complicarÃ¡n. Secuela de Hotel Transilvania (2012). (FILMAFFINITY)\n",
				"/imagenes/hotel.PNG"));

		listadoPeliculas.add(new Pelicula(idPeli++, "Sicario",
				"TÃ­tulo original\n\tSicario\n" + "AÃ±o\n\t2015\n" + "DuraciÃ³n\n\t121 min.\n"
						+ "PaÃ­s\n\t[Estados Unidos]  Estados Unidos\n" + "Director\n\tDenis Villeneuve\n"
						+ "GuiÃ³n\n\tTaylor Sheridan\n" + "MÃºsica\n\tJÃ³hann JÃ³hannsson\n"
						+ "FotografÃ­a\n\tRoger Deakins\n"
						+ "Reparto\n\tEmily Blunt, Benicio Del Toro, Josh Brolin, Victor Garber, Jon Bernthal, Jeffrey Donovan, Daniel Kaluuya, Maximiliano HernÃ¡ndez, Dylan Kenin, Frank Powers, Bernardo P. Saracino, Edgar Arreola, Marty Lindsey, Julio Cedillo\n"
						+ "Productora\n\tLionsgate / Black Label Media\n"
						+ "GÃ©nero\n\tThriller. AcciÃ³n. Drama | Crimen. Drogas. PolicÃ­aco\n"
						+ "Sinopsis\n\tEn la zona fronteriza que se extiende entre Estados Unidos y MÃ©xico la joven Kate Macer, una idealista agente del FBI, es reclutada por una fuerza de Ã©lite del Gobierno para luchar contra el narcotrÃ¡fico. Bajo el mando de un Matt Graver, un frÃ­o miembro de las fuerzas gubernamentales, y de Alejandro, un enigmÃ¡tico asesor, el equipo emprende una misiÃ³n que lleva a la mujer a cuestionarse sus convicciones sobre la guerra contra los narcos y los lÃ­mites de la ley. (FILMAFFINITY)\n",
				"/imagenes/sicario.PNG"));

	}

	public List<Pelicula> getListadoPeliculas() {
		return listadoPeliculas;
	}

	public void setListadoPeliculas(List<Pelicula> listadoPeliculas) {
		this.listadoPeliculas = listadoPeliculas;
	}

	public int getIdPeli() {
		return idPeli;
	}

	public void setIdPeli(int idPeli) {
		this.idPeli = idPeli;
	}
	
}
