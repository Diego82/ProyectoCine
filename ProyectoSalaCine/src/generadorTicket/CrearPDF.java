package generadorTicket;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CrearPDF {
	static Image foto;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Se crea el documento
		Document documento = new Document();

		// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
		FileOutputStream ficheroPdf = null;
		try {
			ficheroPdf = new FileOutputStream("fichero.pdf");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * Se asocia el documento al OutputStream y se indica que el espaciado
		 * entre lineas sera de 20. Esto debe hacerse antes de abrir el
		 * documento
		 */

		try {
			PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(20);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Se abre el documento.
		documento.open();

		try {
			documento.add(new Paragraph("Ticket nº: 1"));
			documento.add(new Paragraph("PELICULA: OCHO APELLIDOS CATALANES \n" + "HORA: 16:00 H \n" + "BUTACA: 2",
					FontFactory.getFont("arial", // fuente
							22, // tamaño
							Font.ITALIC, // estilo
							BaseColor.CYAN))); // color
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Se inserta una imagen

		try {
			foto = Image.getInstance(System.getProperty("user.home") + "/qrZxing.png");
			foto.scaleToFit(80, 80);
			foto.setAlignment(Chunk.ALIGN_MIDDLE);
			documento.add(foto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * //Se inserta una tabla de 4 columnas PdfPTable tabla = new
		 * PdfPTable(4); for (int i = 0; i < 15; i++) { tabla.addCell("celda " +
		 * i); }
		 */

		// creamos una tabla con 4 columnas
		PdfPTable mitablacompleja = new PdfPTable(4);

		// añadimos texto con formato a la primera celda
		PdfPCell celda = new PdfPCell(foto);

		// combinamos la columna con 5 filas

		celda.setRowspan(6);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		// alineamos el contenido al centro

		// añadimos un espaciado
		celda.setPadding(12.0f);
		// colocamos un color de fondo
		// celda.setBackgroundColor(BaseColor.WHITE);
		// se añade a la tabla
		mitablacompleja.addCell(celda);

		// fila 2
		celda = new PdfPCell(new Paragraph("Pelicula: OCHO APELLIDOS CATALANES",
				FontFactory.getFont("arial", 
						10, 
						Font.BOLD))); // 
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		celda.setColspan(3);

		mitablacompleja.addCell(celda);
		// FILA 3
		celda = new PdfPCell(new Paragraph("Lugar: MULTICINES JAEN",
				FontFactory.getFont("arial",
						10, 
						Font.BOLD, 
						BaseColor.BLACK))); 
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		// fila 4
		celda = new PdfPCell(new Paragraph("Fecha: 19/12/2015",
				FontFactory.getFont("arial", 
						10, 
						Font.BOLD, 
						BaseColor.BLACK)));
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		// fila 5
		celda = new PdfPCell(new Paragraph("Hora: 16:00 H",
				FontFactory.getFont("arial",
						10, 
						Font.BOLD, 
						BaseColor.BLACK))); 
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		// fila 6
		celda = new PdfPCell(new Paragraph("Butaca: 2",
				FontFactory.getFont("arial", 
						10, 
						Font.BOLD, 
						BaseColor.BLACK))); 
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		/*
		 * celda = new PdfPCell(new Paragraph("Eximido"));
		 * celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
		 * mitablacompleja.addCell(celda);
		 */

		// fila 7
		celda = new PdfPCell(new Paragraph("Comprador: ",
				FontFactory.getFont("arial", 
						10, 
						Font.BOLD, 
						BaseColor.BLACK)));
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		try {
			// documento.add(tabla);
			documento.add(mitablacompleja);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		documento.close();

	}

}
