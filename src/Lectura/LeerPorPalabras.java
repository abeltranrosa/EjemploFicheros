package Lectura; 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerPorPalabras {

    Scanner sc;

    public void LeerPalabras(String nombreFich) {

        try {
            sc = new Scanner(new File(nombreFich));
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error 2" + ex.getMessage());
        } finally {
            sc.close();
        }
    }

}

