package Escribir;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EngadirDatos {

    PrintWriter engado;
    FileWriter fich;

    public void engadir(String nombreFichero, String dato) {
        try {
            engado = new PrintWriter(new FileWriter(nombreFichero, true));
            System.out.println(dato);
        } catch (IOException ex) {
            System.out.println("Error al añadir texto " + ex.getMessage());
        } finally {
            engado.close();
        }
    }
}
