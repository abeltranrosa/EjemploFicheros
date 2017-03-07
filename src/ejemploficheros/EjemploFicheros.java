package ejemploficheros;

import Escribir.EngadirDatos; 
import Escribir.Escribir;
import Lectura.LeerLinea;
import Lectura.LeerNumeros;
import Lectura.LeerObjetos;
import Lectura.LeerPorPalabras;

public class EjemploFicheros {

    public static void main(String[] args) {
        LeerLinea obxFich = new LeerLinea();

        //  obxFich.Ler("EjemploNotaFicheros.txt");
        //  obxFich.Ler("");

        //LeerPorPalabras obxFichPalabra = new LeerPorPalabras();
        //obxFichPalabra.LeerPalabras("EjemploNotaFicheros.txt");

        //LeerNumeros obxFichNumeros = new LeerNumeros();
        //obxFichNumeros.LeerNumeros("EjemploNotaNumeros.txt");
        
        //LeerObjetos obxLeerObjetos = new LeerObjetos();
        //obxLeerObjetos.leerObx("Xogadores.txt");
        
       //Escribir obxEscribir = new Escribir();
       //obxEscribir.escribirTexto("Escribir.txt");
        
        EngadirDatos obxEngadir = new EngadirDatos();
        obxEngadir.engadir("Engadir.txt","ola");
    }

}
