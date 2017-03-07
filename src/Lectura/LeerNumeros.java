package Lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNumeros {

    File fich;
    Scanner sc;

    public void LeerNumeros(String nombreFich) {
        fich = new File(nombreFich);
        int par = 0;

        try {
            sc = new Scanner(fich);
            //sc.useDelimiter("\\s*,\\s*");
            /**
             * esta funcion permite mostrar solo la primera linea que hay
             * grabada en el fiche de texto
             */
            sc.useDelimiter(",\\s*");
            while (sc.hasNextInt()) {
               // System.out.println(sc.nextInt());

                par = sc.nextInt();
                if (par % 2 == 0) {
                    System.out.println("" + par);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 3 " + ex.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public void LeerNumerosComas(String nombreFich) {
        fich = new File(nombreFich);

        try {
            sc = new Scanner(fich).useDelimiter(",");
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 3" + ex.toString());

        }
    }
}
