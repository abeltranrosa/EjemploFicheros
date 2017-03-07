package Lectura; 

import ejemploficheros.Xogadores.Xogador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerObjetos {

    Scanner sc;
    ArrayList<Xogador> lista;

    public void leerObx(String nombreFichero) {

        try {
            sc = new Scanner(new File(nombreFichero));
            /**
             * ponemos e comunicacion el archivo con el fichero a traces de
             * Scanner
             */
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("******Error apertura******" + ex.getMessage());
        } finally {
            sc.close();
        }

    }

    /**
     * vamos a introducir todo lo que hay en el fichero xogador en un arrayList.
     * En la parte superior creamos el ArrayList. Aqui abajo creamos el metodo
     * lerObjetos y todo lo que quiera meterle al ArrayList lo puedo hacer este
     * metodo
     */
    public void lerObjetos(String nombreFichero) {
        lista = new ArrayList<Xogador>();
        /**
         * con la funcion de Split, crearia un salto de de linea que me permite
         * crear un objeto de tipo xogador y despues se le puede añadir a la
         * lista de xogadores con la funcion add.
         */
        String[] aux;
        try {
            sc = new Scanner(new File(nombreFichero));
            while (sc.hasNextLine()) {
                aux = sc.nextLine().split(",");
                Xogador o = new Xogador(aux[0], Integer.parseInt(aux[1]));
                lista.add(o);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        } finally {
            sc.close();
        }
 
    }
    /**
     * creamos metodo amosar arralist
     */
    public void amosar(ArrayList<Xogador> lista){
        for (int i=0;i<lista.size();i++)
            System.out.println(lista.get(i));
    }

}
