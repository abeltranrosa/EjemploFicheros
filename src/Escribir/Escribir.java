package Escribir;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Escribir {
    File fich;
    PrintWriter f = null;
    public void escribirTexto(String nombreFichero){
        try{
            fich = new File (nombreFichero);
            f= new PrintWriter(fich);
            f.println("escribir en una linea");
            f.println("con varias lineas");
            f.println("de texto");
        }catch (FileNotFoundException ex){
            System.out.println("Error 4 " + ex.getMessage()); 
        }
        finally{
            f.close();
        }
        
    }
    
    
    
}
