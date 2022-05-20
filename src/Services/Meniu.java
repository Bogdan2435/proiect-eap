package Services;

import Locatii.*;
import Persoane.*;
import Produse.*;

import java.util.Scanner;
import java.util.Vector;

public class Meniu {

    public static void main(Vector<Locatie>loc, Vector<Persoana>pers, Vector<Angajat>ang, Vector<Categorie>cat, Vector<Produs>prod, Vector<Depozit>dep, Vector<Furnizor>furn, Vector<Magazin>mag) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Citire");
        System.out.println("\n2. Afisare");
        System.out.println("\n3. Modificare");
        System.out.println("\n4. Stergere");
        System.out.println("\n5. Afisare depozitele unui magazin");
        System.out.println("\n6. Afisare furnizori");
        System.out.println("\n7. Calculare stoc piesa dintr-un depozit");
        System.out.println("\n8. Calculare nr total de produse in stoc dintr-un depozit");
        System.out.println("\n9. Iesire");
        int opt=0;
        while(opt >= 0 && opt < 10){
            System.out.println("\nAlege ce optiune doresti sa testezi:\n");
            opt = scanner.nextInt();
            switch (opt):{
                case 1: {
                    String clasa;
                    System.out.println("Pe care dintre clase vrei sa lucrezi?");
                    System.out.println("Locatie | Furnizor | Depozit | Magazin | Persoane | Angajati | Categorii | Produse");
                    clasa = scanner.next();
                    switch (clasa) {
                        case "Locatie": {

                        }
                    }
                }
            }
        }

    }

}
