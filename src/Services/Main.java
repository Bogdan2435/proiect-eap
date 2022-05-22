package Services;

import Locatii.*;
import Persoane.*;
import Produse.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // ------------------------------------------------------
        // --------------------ADAUGARE DATE MANUAL -------------
        // ------------------------------------------------------

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

        Persoana p1 = new Persoana("Bogdan", "Dura", "501050440019", 21);
        Persoana p2 = new Persoana("Alexandru", "Popescu", "501050440319", 34);
        Persoana p3 = new Persoana("Florin", "Mihai", "501050445555", 42);
        Persoana p4 = new Persoana("Andrei", "Stefanescu", "501050443319", 23);
        Persoana p5 = new Persoana("Stefan", "Vlad", "502250220019", 50);
        Persoana p6 = new Persoana("Vlad", "Voda", "5033050440019", 25);

        Angajat a1 = new Angajat(p3.getNumeFamilie(), p3.getPrenume(), p3.getCnp(), p3.getVarsta(), 3400, 2, 2);
        Angajat a2 = new Angajat(p4.getNumeFamilie(), p4.getPrenume(), p4.getCnp(), p4.getVarsta(), 2400, 3, 1);

        Categorie c1 = new Categorie("Cosmetice", "Produse cosmetice");
        Categorie c2 = new Categorie("Lactate", "Lapte, Branza, etc");
        Categorie c3 = new Categorie("Materiale bricolaj", "Materiale Bricolaj");
        Categorie c4 = new Categorie("Haine", "Haine");
        Categorie c5 = new Categorie("Fructe si legume", "Fructe si Legume");

        Produs pr1 = new Produs(c1.getDenumireCategorie(), c1.getDescriere(), "Parfum", 130);
        Produs pr2 = new Produs(c1.getDenumireCategorie(), c1.getDescriere(), "Sampon", 13);
        Produs pr3 = new Produs(c1.getDenumireCategorie(), c1.getDescriere(), "Gel de dus", 10);
        Produs pr4 = new Produs(c2.getDenumireCategorie(), c2.getDescriere(), "Branza", 12);
        Produs pr5 = new Produs(c2.getDenumireCategorie(), c2.getDescriere(), "Kefir", 4);
        Produs pr6 = new Produs(c2.getDenumireCategorie(), c2.getDescriere(), "Branza Brie", 13);
        Produs pr7 = new Produs(c4.getDenumireCategorie(), c4.getDescriere(), "Tricou", 40);
        Produs pr8 = new Produs(c4.getDenumireCategorie(), c4.getDescriere(), "Blugi", 99);
        Produs pr9 = new Produs(c4.getDenumireCategorie(), c5.getDescriere(), "Mere", 3);
        Produs pr10 = new Produs(c4.getDenumireCategorie(), c5.getDescriere(), "Pere", 4);

        HashMap<Produs, Integer> listaProd1 = new HashMap<Produs, Integer>();
        listaProd1.put(pr1, 90);
        listaProd1.put(pr2, 8);
        listaProd1.put(pr3, 5);

        HashMap<Produs, Integer> listaProd2 = new HashMap<Produs, Integer>();
        listaProd2.put(pr1, 85);
        listaProd2.put(pr2, 7);
        listaProd2.put(pr3, 5);

        Furnizor f1 = new Furnizor(l1.getTara(), l1.getJudet(), l1.getLocalitate(), l1.getStrada(), l1.getNumar(), "B&N", p1, listaProd1);
        Furnizor f2 = new Furnizor(l2.getTara(), l2.getJudet(), l2.getLocalitate(), l2.getStrada(), l1.getNumar(), "CosmeticsNN", p5, listaProd2);

        HashMap<String, Categorie> listaCat1 = new HashMap<String, Categorie>();
        listaCat1.put(c1.getDenumireCategorie(), c1);
        listaCat1.put(c4.getDenumireCategorie(), c4);

        HashMap<String, Categorie> listaCat2 = new HashMap<String, Categorie>();
        listaCat2.put(c2.getDenumireCategorie(), c2);

        HashMap<String, Integer> listaCantitati1 = new HashMap<String, Integer>();
        listaCantitati1.put(pr1.getDenumireProdus(), 34);
        listaCantitati1.put(pr2.getDenumireProdus(), 98);
        listaCantitati1.put(pr3.getDenumireProdus(), 230);
        listaCantitati1.put(pr7.getDenumireProdus(), 53);
        listaCantitati1.put(pr8.getDenumireProdus(), 2);

        HashMap<String, Integer> listaCantitati2 = new HashMap<String, Integer>();
        listaCantitati2.put(pr4.getDenumireProdus(), 273);
        listaCantitati2.put(pr5.getDenumireProdus(), 340);
        listaCantitati2.put(pr6.getDenumireProdus(), 120);

        Depozit d1 = new Depozit(l1.getTara(), l1.getJudet(), l1.getLocalitate(), l1.getStrada(), l1.getNumar(), "Depozit 1", 2100, a1, listaCat1, listaCantitati1, "depozit distributie");
        Depozit d2 = new Depozit(l2.getTara(), l2.getJudet(), l2.getLocalitate(), l2.getStrada(), l2.getNumar(), "Depozit 2", 2700, a2, listaCat2, listaCantitati2, "depozit");

        HashMap<String, Depozit> listaDepozite1 = new HashMap<String, Depozit>();
        listaDepozite1.put(d1.getNumeDepozit(), d1);

        HashMap<String, Depozit> listaDepozite2 = new HashMap<String, Depozit>();
        listaDepozite2.put(d1.getNumeDepozit(), d1);
        listaDepozite2.put(d2.getNumeDepozit(), d2);

        Magazin m1 = new Magazin(l1.getTara(), l1.getJudet(), l1.getLocalitate(), l1.getStrada(), l1.getNumar(), "m1",listaDepozite1, a2);
        Magazin m2 = new Magazin(l2.getTara(), l2.getJudet(), l2.getLocalitate(), l2.getStrada(), l2.getNumar(), "m2",listaDepozite2, a1);

        locatii.add(l1);
        locatii.add(l2);
        locatii.add(l3);

        persoane.add(p1);
        persoane.add(p2);
        persoane.add(p3);
        persoane.add(p4);
        persoane.add(p5);
        persoane.add(p6);

        angajati.add(a1);
        angajati.add(a2);

        categorii.add(c1);
        categorii.add(c2);
        categorii.add(c3);
        categorii.add(c4);
        categorii.add(c5);

        produse.add(pr1);
        produse.add(pr2);
        produse.add(pr3);
        produse.add(pr4);
        produse.add(pr5);
        produse.add(pr6);
        produse.add(pr7);
        produse.add(pr8);
        produse.add(pr9);
        produse.add(pr10);

        furnizori.add(f1);
        furnizori.add(f2);

        depozite.add(d1);
        depozite.add(d2);

        magazine.add(m1);
        magazine.add(m2);
        // ------------------------------------------------------
        // --------------FINAL ADAUGARE DATE MANUAL--------------
        // ------------------------------------------------------

        Servicii serv = new Servicii();
        Meniu meniu = new Meniu();
        meniu.main(locatii, persoane, angajati, categorii, produse, depozite, furnizori, magazine);
    }
}
