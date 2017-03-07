package Lectura; 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerLinea {

    File fich;
    Scanner sc;

    public void Ler(String nombreFich) {
        fich = new File(nombreFich);
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            sc.close();
        }
    }

}
