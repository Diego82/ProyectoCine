package generadorQR;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class Generador {
	
	//Definimos las variables estáticas
	
	private static final String FORMATO_IMAGEN = "png";
	private static final String RUTA_IMAGEN = System.getProperty("user.home") + "/qrZxing.png";
	private static final int ancho = 500;
	private static final int alto = 500;
	private static String datos = "PELICULA: OCHO APELLIDOS CATALANES \n"
			+ "HORA: 16:00 H \n"
			+ "BUTACA: 2"; 
	
	
	
	public static void main(String[] args) throws IOException {
		
		/*Creamos el objeto que tiene los datos a dibujar así como 
		el Writer para darle formato a los datos*/
		
		BitMatrix bm = null;
		Writer writer = new QRCodeWriter();
		 
		/*Posteriormente generaremos la matríz usando los datos 
		que establecimos previamente dándoles el formato que necesitamos, 
		en este caso, el formato del código QR */
		
		
		 try {
			bm = writer.encode(datos, BarcodeFormat.QR_CODE, ancho, alto);
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //Creamos un buffer para guardar la imagen en el disco duro
		 
		 BufferedImage image = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB); 
		 
		 /*Escribimos los datos con dos bucles anidados, 
		 iterando a través de lo ancho y alto de la imagen...*/
		 
		    for (int i = 0; i < ancho; i++) {
		        for (int x = 0; x < alto; x++) {
		            int grayValue = (bm.get(x, i) ? 1 : 0) & 0xff;
		            image.setRGB(x, i, (grayValue == 0 ? 0 : 0xFFFFFF));
		        }
		     }
		    /*Debido a un bug, las imágenes se crean con los colores invertidos 
		    (el negro por el blanco y viceversa) necesitamos invertir estos colores, 
		    para ello, llamamos al metodo invertirColores y le pasamos el BufferedImage*/
		    
		    image = invertirColores(image); 
		    
		    //escribimos la imagen en el disco duro
		    
		    FileOutputStream qrCode = null;
			
		    try {
				qrCode = new FileOutputStream(RUTA_IMAGEN);
				ImageIO.write(image, FORMATO_IMAGEN, qrCode);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    //Cerramos el flujo de datos
		    
		    qrCode.close();
		    
		    
		    //Utilizamos la clase Desktop para ver la imagen con el visor de imágenes predeterminado del sistema operativo
		    
		    Desktop d = Desktop.getDesktop();
		    d.open(new File(RUTA_IMAGEN)); 
		    
		    
		 
	}
	  private static  BufferedImage invertirColores(BufferedImage imagen) {
	        for (int x = 0; x < ancho; x++) {
	            for (int i = 0; i < alto; i++) {
	                int rgb = imagen.getRGB(x, i);
	                if (rgb == -16777216) {
	                    imagen.setRGB(x, i, -1);
	                } else {
	                    imagen.setRGB(x, i, -16777216);
	                }
	            }
	        }
	        return imagen;
	    } 
}
