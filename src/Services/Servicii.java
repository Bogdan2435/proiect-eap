package Services;

import Locatii.*;
import Persoane.*;
import Produse.*;

import java.util.Scanner;
import java.util.Vector;

public class Servicii {

    public static Locatie Adaugare_locatie(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce tara: ");
        String tara;
        tara = scanner.nextLine();
        System.out.println("Introduce judetul: ");
        String judet;
        judet = scanner.nextLine();
        System.out.println("Introduce localitatea: ");
        String localitate;
        localitate = scanner.nextLine();
        System.out.println("Introduce strada: ");
        String strada;
        strada = scanner.nextLine();
        System.out.println("Introduce numarul strazi: ");
        String nr;
        nr = scanner.next();
        Locatie locatie = new Locatie(tara, judet, localitate, strada, nr);
        return locatie;
    }

    public static void Afisare_locatie(Locatie locatie){
        System.out.println(locatie.toString());
    }

    public static void Stergere_locatie(Vector<Locatie> locatii,int pozitie){
        locatii.remove(pozitie);
    }

    public static Locatie Modificare_locatie(Locatie locatie){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica tara: ");
        String tara;
        tara = scanner.nextLine();
        locatie.setTara(tara);
        System.out.println("Modifica judetul: ");
        String judet;
        judet = scanner.nextLine();
        locatie.setJudet(judet);
        System.out.println("Modifica localitatea: ");
        String localitate;
        localitate = scanner.nextLine();
        locatie.setLocalitate(localitate);
        System.out.println("Modifica strada: ");
        String strada;
        strada = scanner.nextLine();
        locatie.setStrada(strada);
        System.out.println("Modifica numarul strazii: ");
        String nr;
        nr = scanner.nextLine();
        locatie.setNumar(nr);
        return locatie;
    }

}
