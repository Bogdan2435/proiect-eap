package Services;

import Locatii.*;
import Persoane.*;
import Produse.*;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Servicii {

    // ---------- SERVICII LOCATIE --------------
    // -------------------------------------------
    public static Locatie adaugareLocatie(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tara: ");
        String tara;
        tara = scanner.nextLine();
        System.out.println("Judetul: ");
        String judet;
        judet = scanner.nextLine();
        System.out.println("Localitatea: ");
        String localitate;
        localitate = scanner.nextLine();
        System.out.println("Strada: ");
        String strada;
        strada = scanner.nextLine();
        System.out.println("Numarul strazi: ");
        String nr;
        nr = scanner.next();
        Locatie locatie = new Locatie(tara, judet, localitate, strada, nr);
        return locatie;
    }

    public static void afisareLocatie(Locatie locatie){
        System.out.println(locatie.toString());
    }

    public static void stergereLocatie(Vector<Locatie> locatii,int pozitie){
        locatii.remove(pozitie);
    }

    public static Locatie modificarelocatie(Locatie locatie){
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

    // ---------- SERVICII PERSOANA --------------
    // -------------------------------------------
    public static Persoana adaugarePersoana(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nume Familie:");
        String nume;
        nume = scanner.nextLine();
        System.out.println("Prenume:");
        String p;
        p = scanner.nextLine();
        System.out.println("CNP:");
        String c;
        c = scanner.nextLine();
        System.out.println("Varsta:");
        int v;
        v = scanner.nextInt();
        Persoana persoana = new Persoana(nume, p, c, v);
        return persoana;
    }

    public static void afisarePersoana(Persoana persoana){
        System.out.println(persoana.toString());
    }

    public static void stergerePersoana(Vector<Persoana> persoane,int pozitie){
        persoane.remove(pozitie);
    }

    public static Persoana modificarePersoana(Persoana persoana){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica numele de familie: ");
        String n;
        n = scanner.nextLine();
        persoana.setNumeFamilie(n);
        System.out.println("Modifica prenumele: ");
        String p;
        p = scanner.nextLine();
        persoana.setPrenume(p);
        System.out.println("Modifica CNP-ul: ");
        String c;
        c = scanner.nextLine();
        persoana.setCnp(c);
        System.out.println("Modifica varsta: ");
        int v;
        v = scanner.nextInt();
        persoana.setVarsta(v);
        return persoana;
    }

    // ---------- SERVICII ANGAJATI --------------
    // -------------------------------------------
    public static Angajat adaugareAngajat(){
        Scanner scanner = new Scanner(System.in);
        Persoana persoana = adaugarePersoana();
        System.out.println("Salariu:");
        int s;
        s = scanner.nextInt();
        System.out.println("Departament:");
        int d;
        d = scanner.nextInt();
        System.out.println("Vechime:");
        int vech;
        vech = scanner.nextInt();
        Angajat angajat = new Angajat(persoana.getNumeFamilie(), persoana.getPrenume(), persoana.getCnp(), persoana.getVarsta(), s, d, vech);
        return angajat;
    }

    public static void afisareAngajat(Angajat angajat){
        System.out.println(angajat.toString());
    }

    public static void stergereAngajat(Vector<Angajat> angajati,int pozitie){
        angajati.remove(pozitie);
    }

    public static Angajat modificareAngajat(Angajat angajat){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica numele de familie: ");
        String n;
        n = scanner.nextLine();
        angajat.setNumeFamilie(n);
        System.out.println("Modifica prenumele: ");
        String p;
        p = scanner.nextLine();
        angajat.setPrenume(p);
        System.out.println("Modifica CNP-ul: ");
        String c;
        c = scanner.nextLine();
        angajat.setCnp(c);
        System.out.println("Modifica varsta: ");
        int v;
        v = scanner.nextInt();
        angajat.setVarsta(v);
        System.out.println("Modifica Salariul: ");
        int s;
        s = scanner.nextInt();
        angajat.setSalariu(s);
        System.out.println("Modifica Departamentul: ");
        int d;
        d = scanner.nextInt();
        angajat.setDepartament(d);
        System.out.println("Modifica Vechimea Angajatului: ");
        int vech;
        vech = scanner.nextInt();
        angajat.setVechime(vech);
        return angajat;
    }

    // ---------- SERVICII CATEGORII --------------
    // -------------------------------------------
    public static Categorie adaugareCategorie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Denumire Categorie:");
        String cat;
        cat = scanner.nextLine();
        System.out.println("Descrierea Categoriei:");
        String d;
        d = scanner.nextLine();
        Categorie categorie = new Categorie(cat, d);
        return categorie;
    }

    public static void afisareCategorie(Categorie categorie){
        System.out.println(categorie.toString());
    }

    public static void stergereCategorie(Vector<Categorie> categorii,int pozitie){
        categorii.remove(pozitie);
    }

    public static Categorie modificarePersoana(Categorie categorie){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica denumire Categoriei: ");
        String c;
        c = scanner.nextLine();
        categorie.setDenumireCategorie(c);
        System.out.println("Modifica descrierea Categoriei: ");
        String d;
        d = scanner.nextLine();
        categorie.setDescriere(d);
        return categorie;
    }

    // ---------- SERVICII PRODUSE --------------
    // -------------------------------------------
    public static Produs adaugareProdus(){
        Scanner scanner = new Scanner(System.in);
        Categorie categorie = adaugareCategorie();
        System.out.println("Denumire Produs:");
        String prod;
        prod = scanner.nextLine();
        System.out.println("Pret:");
        int pret;
        pret = scanner.nextInt();
        Produs produs = new Produs(categorie.getDenumireCategorie(), categorie.getDescriere(), prod, pret);
        return produs;
    }

    public static void afisareProdus(Produs produs){
        System.out.println(produs.toString());
    }

    public static void stergereProdus(Vector<Produs> produse,int pozitie){
        produse.remove(pozitie);
    }

    public static Produs modificareProdus(Produs produs){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica denumirea Categoriei: ");
        String categorie;
        categorie = scanner.nextLine();
        produs.setDenumireCategorie(categorie);
        System.out.println("Modifica descrierea Categoriei: ");
        String descriere;
        descriere = scanner.nextLine();
        produs.setDescriere(descriere);
        System.out.println("Modifica descrierea Produsului: ");
        String dprodus;
        dprodus = scanner.nextLine();
        produs.setDenumireProdus(dprodus);
        System.out.println("Modifica pretul produsului: ");
        int pr;
        pr = scanner.nextInt();
        produs.setPret(pr);
        return produs;
    }

    // ---------- SERVICII FURNIZORI --------------
    // -------------------------------------------
    public static Furnizor adaugareFurnizor(){
        Scanner scanner=new Scanner(System.in);
        Locatie locatie = adaugareLocatie();
        System.out.println("Denumire Furnizor: ");
        String df;
        df = scanner.nextLine();
        Persoana rep = adaugarePersoana();
        System.out.println("Cate produse distribuie furnizorul?");
        int nr_prod;
        nr_prod = scanner.nextInt();
        HashMap<Produs, Integer> lp = new HashMap<Produs, Integer>();
        for(int i = 1; i <= nr_prod; i++){
            System.out.println("Adauga cantitatea produsului pe care urmeaza sa il introduci");
            Integer n;
            n = scanner.nextInt();
            lp.put(adaugareProdus(), n);
        }
        Furnizor furnizor = new Furnizor(locatie.getTara(), locatie.getJudet(), locatie.getLocalitate(), locatie.getStrada(), locatie.getNumar(), df, rep, lp);
        return furnizor;
    }

    public static void afisareFurnizor(Furnizor furnizor){
        System.out.println(furnizor.toString());
    }

    public static void stergereFurnizor(Vector<Furnizor> furnizori,int pozitie){
        furnizori.remove(pozitie);
    }

    public static Furnizor modificareFurnizor(Furnizor furnizor){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Modifica tara: ");
        String tara;
        tara = scanner.nextLine();
        furnizor.setTara(tara);
        System.out.println("Modifica judetul: ");
        String judet;
        judet = scanner.nextLine();
        furnizor.setJudet(judet);
        System.out.println("Modifica localitatea: ");
        String localitate;
        localitate = scanner.nextLine();
        furnizor.setLocalitate(localitate);
        System.out.println("Modifica strada: ");
        String strada;
        strada = scanner.nextLine();
        furnizor.setStrada(strada);
        System.out.println("Modifica numarul strazii: ");
        String nr;
        nr = scanner.nextLine();
        furnizor.setNumar(nr);
        System.out.println("Modifica denumire Furnizorului: ");
        String df;
        df = scanner.nextLine();
        furnizor.setDenumireFurnizor(df);
        System.out.println("Modifica reprezentantul Furnizorului: ");
        Persoana rf;
        rf = modificarePersoana(furnizor.getReprezentantFurnizor());
        furnizor.setReprezentantFurnizor(rf);
        System.out.println("Cate produse distribuie furnizorul?");
        int nr_prod;
        nr_prod = scanner.nextInt();
        HashMap<Produs, Integer> lproduse = new HashMap<Produs, Integer>();
        for(int i = 1; i <= nr_prod; i++){
            System.out.println("Adauga cantitatea produsului pe care urmeaza sa il introduci");
            Integer n;
            n = scanner.nextInt();
            lproduse.put(adaugareProdus(), n);
        }
        furnizor.setListaProduse(lproduse);
        return furnizor;
    }

    // ---------- SERVICII DEPOZITE --------------
    // -------------------------------------------
    public static Depozit adaugareDepozit(){
        Scanner scanner=new Scanner(System.in);
        Locatie locatie = adaugareLocatie();
        System.out.println("Denumire Depozit: ");
        String dd;
        dd = scanner.nextLine();
        System.out.println("Suprafata Depozitului: ");
        Integer sup;
        sup = scanner.nextInt();
        System.out.println("Adauga Managerul de Magazin");
        Angajat man = adaugareAngajat();
        System.out.println("Cate categorii de produse pot fi stocate in depozit?");
        int nr_cat;
        nr_cat = scanner.nextInt();
        HashMap<String, Categorie> lcat = new HashMap<String, Categorie>();
        for(int i = 1; i <= nr_cat; i++){
            System.out.println("Adauga o categorie: ");
            Categorie cat;
            cat = adaugareCategorie();
            lcat.put(cat.getDenumireCategorie(), cat);
        }
        System.out.println("Cate produse diferite sunt stocate in depozit?");
        int nr_prod;
        nr_prod = scanner.nextInt();
        HashMap<String, Integer> lcantitati = new HashMap<String, Integer>();
        for(int i = 1; i <= nr_prod; i++){
            System.out.println("Adauga produsul: ");
            Produs prod;
            prod = adaugareProdus();
            System.out.println("Adauga Cantitatea din depozit");
            Integer cant = scanner.nextInt();
            lcantitati.put(prod.getDenumireProdus(), cant);
        }
        System.out.println("Tipul Depozitului: ");
        String td;
        td = scanner.nextLine();
        Depozit depozit = new Depozit(locatie.getTara(), locatie.getJudet(), locatie.getLocalitate(), locatie.getStrada(), locatie.getNumar(), dd, sup, man, lcat, lcantitati, td);

        return depozit;
    }

    public static void afisareDepozit(Depozit depozit){
        System.out.println(depozit.toString());
    }

    public static void stergereDepozit(Vector<Depozit> depozite,int pozitie){
        depozite.remove(pozitie);
    }

    public static Depozit modificareDepozit(Depozit depozit) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modifica tara: ");
        String tara;
        tara = scanner.nextLine();
        depozit.setTara(tara);
        System.out.println("Modifica judetul: ");
        String judet;
        judet = scanner.nextLine();
        depozit.setJudet(judet);
        System.out.println("Modifica localitatea: ");
        String localitate;
        localitate = scanner.nextLine();
        depozit.setLocalitate(localitate);
        System.out.println("Modifica strada: ");
        String strada;
        strada = scanner.nextLine();
        depozit.setStrada(strada);
        System.out.println("Modifica numarul strazii: ");
        String nr;
        nr = scanner.nextLine();
        depozit.setNumar(nr);
        System.out.println("Modifica numele Depozitului: ");
        String nd;
        nd = scanner.nextLine();
        depozit.setNumeDepozit(nd);
        System.out.println("Modifica suprafata Depozitului: ");
        Integer sd;
        sd = scanner.nextInt();
        depozit.setSuprafata(sd);
        System.out.println("Modifica managerul Depozitului");
        Angajat manag;
        manag = modificareAngajat(depozit.getManagerDepozit());
        depozit.setManagerDepozit(manag);
        System.out.println("Cate categorii de produse pot fi stocate in depozit?");
        int nr_cat;
        nr_cat = scanner.nextInt();
        HashMap<String, Categorie> lcat = new HashMap<String, Categorie>();
        for (int i = 1; i <= nr_cat; i++) {
            System.out.println("Adauga o categorie: ");
            Categorie cat;
            cat = adaugareCategorie();
            lcat.put(cat.getDenumireCategorie(), cat);
        }
        depozit.setListaCategoriiDepozitate(lcat);
        System.out.println("Cate produse diferite sunt stocate in depozit?");
        int nr_prod;
        nr_prod = scanner.nextInt();
        HashMap<String, Integer> lcantitati = new HashMap<String, Integer>();
        for (int i = 1; i <= nr_prod; i++) {
            System.out.println("Adauga produsul: ");
            Produs prod;
            prod = adaugareProdus();
            System.out.println("Adauga Cantitatea din depozit");
            Integer cant = scanner.nextInt();
            lcantitati.put(prod.getDenumireProdus(), cant);
        }
        depozit.setListaCantitati(lcantitati);
        return depozit;
    }

    // ---------- SERVICII MAGAZINE --------------
    // -------------------------------------------
    public static Magazin adaugareMagazin(){
        Scanner scanner = new Scanner(System.in);
        Locatie locatie = adaugareLocatie();
        System.out.println("Nume Magazin: ");
        String nume;
        nume = scanner.nextLine();

        System.out.println("Cate depozite sunt asociate acestui magazin?");
        int nr_depozite;
        nr_depozite = scanner.nextInt();
        HashMap<String, Depozit> ldepozite = new HashMap<String, Depozit>();
        for(int i = 1; i <= nr_depozite; i++){
            System.out.println("Adauga un depozit: ");
            Depozit d;
            d = adaugareDepozit();
            ldepozite.put(d.getNumeDepozit(), d);
        }
        System.out.println("Adauga Managerul de Magazin");
        Angajat manmag = adaugareAngajat();
        Magazin magazin = new Magazin(locatie.getTara(), locatie.getJudet(), locatie.getLocalitate(), locatie.getStrada(), locatie.getNumar(), nume, ldepozite, manmag);
        return magazin;
    }

    public static void afisareMagazin(Magazin magazin){
        System.out.println(magazin.toString());
    }

    public static void stergereMagazin(Vector<Magazin> magazine,int pozitie){
        magazine.remove(pozitie);
    }

    public static Magazin modificareMagazin(Magazin magazin){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Modifica tara: ");
        String tara;
        tara = scanner.nextLine();
        magazin.setTara(tara);
        System.out.println("Modifica judetul: ");
        String judet;
        judet = scanner.nextLine();
        magazin.setJudet(judet);
        System.out.println("Modifica localitatea: ");
        String localitate;
        localitate = scanner.nextLine();
        magazin.setLocalitate(localitate);
        System.out.println("Modifica strada: ");
        String strada;
        strada = scanner.nextLine();
        magazin.setStrada(strada);
        System.out.println("Modifica numarul strazii: ");
        String nr;
        nr = scanner.nextLine();
        magazin.setNumar(nr);

        System.out.println("Modifica numele Magazinului: ");
        String nume;
        nume = scanner.nextLine();
        magazin.setNumeMagazin(nume);

        System.out.println("Cate depozite sunt asociate acestui magazin?");
        int nr_depozite;
        nr_depozite = scanner.nextInt();
        HashMap<String, Depozit> ldepozite = new HashMap<String, Depozit>();
        for(int i = 1; i <= nr_depozite; i++){
            System.out.println("Adauga un depozit: ");
            Depozit dep;
            dep = adaugareDepozit();
            ldepozite.put(dep.getNumeDepozit(), dep);
        }
        magazin.setListaDepozite(ldepozite);

        System.out.println("Modifica managerul Magazinului");
        Angajat manag;
        manag = modificareAngajat(magazin.getManagerMagazin());
        magazin.setManagerMagazin(manag);

        return magazin;
    }
}
