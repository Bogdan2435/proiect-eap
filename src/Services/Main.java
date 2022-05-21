package Services;

import Locatii.*;
import Persoane.*;
import Produse.*;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<Locatie> locatii= new Vector<Locatie>();
        Vector<Persoana> persoane = new Vector<Persoana>();
        Vector<Angajat> angajati = new Vector<Angajat>();
        Vector<Categorie> categorii = new Vector<Categorie>();
        Vector<Produs> produse = new Vector<Produs>();
        Vector<Depozit> depozite = new Vector<Depozit>();
        Vector<Furnizor> furnizori = new Vector<Furnizor>();
        Vector<Magazin> magazine = new Vector<Magazin>();

        Locatie l1 = new Locatie("Ro", "Bucuresti", "S4", "Viorele", "51");
        Locatie l2 = new Locatie("Ro", "Bucuresti", "S3", "Sarii", "65");
        Locatie l3 = new Locatie("Bg", "Ruse", "Ruse", "Mdasi", "53");

        locatii.add(l1);
        locatii.add(l2);
        locatii.add(l3);

        Servicii serv = new Servicii();
        Meniu meniu = new Meniu();
        meniu.main(locatii, persoane, angajati, categorii, produse, depozite, furnizori, magazine);
    }
}
