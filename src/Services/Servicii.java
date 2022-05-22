package Services;

import Locatii.*;
import Persoane.*;
import Produse.*;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.*;

import java.util.Map.Entry;

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

    public static Categorie modificareCategorie(Categorie categorie){
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

    public static void cautareDepozit(Vector<Depozit> dep){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alege tara dupa care vrei sa filtrezi:");
        String tara = scanner.nextLine();
        System.out.println("Vrei sa mai adaugi si alte filtre cautarii? (Da | Nu)");
        String s = scanner.nextLine();
        if (s.equals("Da")){
            System.out.println("Alege ce filtre vrei sa mai adaugi cautarii? ( Judet | Localitate)");
            String filtru = scanner.nextLine();
            switch (filtru) {
                case "Judet": {
                    System.out.println("Alege judetul dupa care vrei sa filtrezi:");
                    String judet = scanner.nextLine();
                    System.out.println("Vrei sa filtrezi cautarea si dupa localitate?)");
                    s = scanner.nextLine();
                    if (s.equals("Da")) {
                        System.out.println("Alege localitatea dupa care vrei sa filtrezi:");
                        String localitate = scanner.nextLine();
                        for (Depozit dp : dep) { // parcurg toate depozitele existente
                            if (tara.equals(dp.getTara()) & judet.equals(dp.getJudet()) & localitate.equals(dp.getLocalitate()))
                                afisareDepozit(dp);
                        }
                    } else {
                        for (Depozit dp : dep) { // parcurg toate depozitele existente
                            if (tara.equals(dp.getTara()) & judet.equals(dp.getJudet()))
                                afisareDepozit(dp);
                        }
                    }
                    break;
                }
                case "Localitate":{
                    System.out.println("Alege localitatea dupa care vrei sa filtrezi:");
                    String localitate = scanner.nextLine();
                    for (Depozit dp : dep) { // parcurg toate depozitele existente
                        if (tara.equals(dp.getTara()) & localitate.equals(dp.getLocalitate()))
                            afisareDepozit(dp);
                    }
                    break;
                }
            }
        } else {
            for (Depozit dp : dep) { // parcurg toate depozitele existente
                if (tara.equals(dp.getTara()))
                    afisareDepozit(dp);
            }
        }
    }

    public static void cautareDepoziteMagazin(Vector<Magazin> mag){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Depozitele carui magazin doresti sa le vezi?");
        int nr_mag = scanner.nextInt();
        int i = 1;
        for(Magazin m : mag) {
            if(nr_mag == i)
                System.out.println(m.getListaDepozite());
            i = i + 1;
        }
    }

    public static void stocPiesaMagazin(Vector<Magazin> mag){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stocul carui produs vrei sa il calculezi? (numele produsului");
        String p = scanner.nextLine();

        System.out.println("Stocul pentru care magazin doresti sa il vezi?");
        int nr_mag = scanner.nextInt();

        int stoc = 0;

        int i = 1;
        for(Magazin m : mag) {
            if(nr_mag == i){
                for(Depozit d : m.getListaDepozite().values()){
                    for(String piesa : d.getListaCantitati().keySet()) {
                        if(piesa.equals(p)) {
                            stoc = stoc + d.getListaCantitati().get(p);
                        }
                    }
                }
            }
            i = i + 1;
        }
        System.out.println(stoc);
    }

    public static void stocTotalDepozit(Vector<Depozit> dep){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stocul total al carui depozit vrei sa il vezi?");
        int nr_dep = scanner.nextInt();
        int cant = 0;
        int i = 1;
        for(Depozit d : dep){
            if(nr_dep == i){
                for(Integer c : d.getListaCantitati().values()){
                    cant = cant + c;
                }
            }
            i = i + 1;
        }
        System.out.println(cant);
    }

    public static List<Integer> afisareStocuriDepozit(Depozit depozit){
        Collection stoc;
        stoc = depozit.getListaCantitati().values();
        List <Integer> stocSortat = new ArrayList<Integer>(stoc);
        Collections.sort(stocSortat);
        return stocSortat;
    }

    public static void citireCsv(Vector<Persoana> persoane, Vector<Categorie> categorii, Vector<Locatie> locatii, Vector<Produs> produse) {
        try {
            File fisierPersoana = new File("src/Services/DateCSV/ListaPersoane.csv");
            Scanner scanner = new Scanner(fisierPersoana);
            if(scanner.hasNextLine())
                scanner.nextLine();
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] arg_of_Data = data.split(",");
                Persoana pers = new Persoana();
                pers.setNumeFamilie(arg_of_Data[0]);
                pers.setPrenume(arg_of_Data[1]);
                pers.setCnp(arg_of_Data[2]);
                pers.setVarsta(Integer.parseInt(arg_of_Data[3]));
                persoane.add(pers);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul Csv nu exista");
            e.printStackTrace();
        }

        try {
            File fisierCategorii = new File("src/Services/DateCSV/ListaCategorii.csv");
            Scanner scanner = new Scanner(fisierCategorii);
            if(scanner.hasNextLine())
                scanner.nextLine();
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] arg_of_Data = data.split(",");
                Categorie cat = new Categorie(arg_of_Data[0], arg_of_Data[1]);
                categorii.add(cat);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul Csv nu exista");
            e.printStackTrace();
        }

        try {
            File fisierLocatii = new File("src/Services/DateCSV/ListaLocatii.csv");
            Scanner scanner = new Scanner(fisierLocatii);
            if(scanner.hasNextLine())
                scanner.nextLine();
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] arg_of_Data = data.split(",");
                Locatie loc = new Locatie(arg_of_Data[0], arg_of_Data[1], arg_of_Data[2], arg_of_Data[3], arg_of_Data[4]);
                locatii.add(loc);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul Csv nu exista");
            e.printStackTrace();
        }

        try {
            File fisierProduse = new File("src/Services/DateCSV/ListaProduse.csv");
            Scanner scanner = new Scanner(fisierProduse);
            if(scanner.hasNextLine())
                scanner.nextLine();
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] arg_of_Data = data.split(",");
                Produs produs = new Produs(arg_of_Data[0], arg_of_Data[1], arg_of_Data[2], Integer.parseInt(arg_of_Data[3]));
                produse.add(produs);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul Csv nu exista");
            e.printStackTrace();
        }
    }

    public static void creareAudit(String actiune, String timestamp) throws IOException {
        FileWriter writer = new FileWriter("src/Services/DateCSV/Audit.csv", true);
        writer.write( "\n"+actiune+" realizata la data de: " + timestamp);
        writer.close();
    }

    public static void scriereCSV(Vector<Persoana> persoane, Vector<Categorie> categorii, Vector<Locatie> locatii, Vector<Produs> produse) throws IOException {

        // Adaugare date pt Persoane
        FileWriter writePersoana = new FileWriter("src/Services/DateCSV/AfisajPersoane.csv");
        writePersoana.write("NumeFamilie,Prenume,CNP,Varsta\n");
        for(Persoana pers : persoane){
            writePersoana.write(pers.getNumeFamilie() + "," + pers.getPrenume() + "," + pers.getCnp() + "," + pers.getVarsta() + "\n");
        }
        writePersoana.close();

        // Adaugare date pt Categorii
        FileWriter writeCategorie = new FileWriter("src/Services/DateCSV/AfisajCategorii.csv");
        writeCategorie.write("DenumireCategorie,Descriere\n");
        for(Categorie cat: categorii){
            writeCategorie.write(cat.getDenumireCategorie() + "," + cat.getDescriere() + "\n");
        }
        writeCategorie.close();

        // Adaugare date pt Locatii
        FileWriter writeLocatie = new FileWriter("src/Services/DateCSV/AfisajLocatii.csv");
        writeLocatie.write("Tara,Judet,Localitate,Strada,Numar\n");
        for(Locatie loc : locatii){
            writeLocatie.write(loc.getTara() + "," + loc.getJudet() + "," + loc.getLocalitate() + "," + loc.getStrada() + "," + loc.getNumar() + "\n");
        }
        writeLocatie.close();

        // Adaugare date pt Produse
        FileWriter writeProdus = new FileWriter("src/Services/DateCSV/AfisajProduse.csv");
        writeProdus.write("DenumireCategorie,DescriereCategorie,DenumireProdus,Pret");
        for(Produs prod : produse) {
            writeProdus.write(prod.getDenumireCategorie() + "," + prod.getDescriere() + "," + prod.getDenumireProdus() + "," + prod.getPret() + "\n");
        }
        writeProdus.close();
    }

    public static void citireBd(Connection conexiune, Vector<Persoana> persoane, Vector<Categorie> categorii, Vector<Locatie> locatii, Vector<Produs> produse) throws SQLException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String clasa;
        System.out.println("Din care tabel vrei sa citesti date?\n");
        System.out.println("Persoane | Categorii | Locatii | Produse");
        clasa = scanner.nextLine();
        switch(clasa) {
            case "Persoane": {
                String comanda = "SELECT * FROM persoana";
                Statement statement = conexiune.createStatement();
                ResultSet result = statement.executeQuery(comanda);
                while(result.next()){
                    Persoana p = new Persoana();
                    p.setNumeFamilie(result.getString("nume_familie"));
                    p.setPrenume(result.getString("prenume"));
                    p.setCnp(result.getString("cnp"));
                    p.setVarsta(result.getInt("varsta"));
                    persoane.add(p);
                }
                break;
            }
            case "Categorii": {
                String comanda = "SELECT * FROM categorie";
                Statement statement = conexiune.createStatement();
                ResultSet result = statement.executeQuery(comanda);
                while(result.next()){
                    Categorie c = new Categorie();
                    c.setDenumireCategorie(result.getString("denumire_categorie"));
                    c.setDescriere(result.getString("descriere"));
                    categorii.add(c);
                }
                break;
            }
            case "Locatii": {
                String comanda = "SELECT * FROM locatie";
                Statement statement = conexiune.createStatement();
                ResultSet result = statement.executeQuery(comanda);
                while(result.next()){
                    Locatie l = new Locatie();
                    l.setTara(result.getString("tara"));
                    l.setJudet(result.getString("judet"));
                    l.setLocalitate(result.getString("localitate"));
                    l.setStrada(result.getString("strada"));
                    l.setNumar(result.getString("numar"));
                    locatii.add(l);
                }
            }
            case "Produse": {
                String comanda = "SELECT * FROM produs";
                Statement statement = conexiune.createStatement();
                ResultSet result = statement.executeQuery(comanda);
                while(result.next()) {
                    Produs pr = new Produs();
                    pr.setDenumireCategorie(result.getString("denumire_categorie"));
                    pr.setDescriere(result.getString("descriere"));
                    pr.setDenumireProdus(result.getString("denumire_produs"));
                    pr.setPret(result.getInt("pret"));
                    produse.add(pr);
                }
            }
            default: {
                System.out.println("Tabelul ales nu este disponibil\n!");
                Thread.sleep(2000);
                citireBd(conexiune, persoane, categorii, locatii, produse);
            }
        }
    }

    public static void inserareBd(Connection conexiune, Vector<Persoana> persoane, Vector<Categorie> categorii, Vector<Locatie> locatii, Vector<Produs> produse) throws SQLException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String clasa;
        System.out.println("In care tabel vrei sa adaugi date?\n");
        System.out.println("Persoane | Categorii | Locatii | Produse");
        clasa = scanner.nextLine();
        switch (clasa){
            case "Persoane": {
                System.out.println("Care persoana vrei sa o adaugi? (pozitia ei)");
                Integer indPers = scanner.nextInt();
                String comanda = "INSERT INTO persoana (nume_familie, prenume, cnp, varsta) VALUES (?, ?, ?, ?)";
                PreparedStatement stat = conexiune.prepareStatement(comanda);
                stat.setString(1, persoane.get(indPers).getNumeFamilie());
                stat.setString(2, persoane.get(indPers).getPrenume());
                stat.setString(3, persoane.get(indPers).getCnp());
                stat.setInt(4, persoane.get(indPers).getVarsta());
                stat.executeUpdate();
                break;
            }
            case "Categorii": {
                System.out.println("Care categorie vrei sa o adaugi? (pozitia ei)");
                Integer indCat = scanner.nextInt();
                String comanda = "INSERT INTO `categorie` (`denumire_categorie`, `descirere`) VALUES (?, ?)";
                PreparedStatement stat = conexiune.prepareStatement(comanda);
                stat.setString(1, categorii.get(indCat).getDenumireCategorie());
                stat.setString(2, categorii.get(indCat).getDescriere());
                stat.executeUpdate();
                break;
            }
            case "Locatii": {
                System.out.println("Care locatie vrei sa o adaugi? (pozitia ei)");
                Integer indLoc = scanner.nextInt();
                String comanda = "INSERT INTO `locatie` (`tara`, `judet`, `localitate`, `strada`, `numar`) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement stat = conexiune.prepareStatement(comanda);
                stat.setString(1, locatii.get(indLoc).getTara());
                stat.setString(2, locatii.get(indLoc).getJudet());
                stat.setString(3, locatii.get(indLoc).getLocalitate());
                stat.setString(4, locatii.get(indLoc).getStrada());
                stat.setString(5, locatii.get(indLoc).getNumar());
                stat.executeUpdate();
                break;
            }
            case "Produse": {
                System.out.println("Care produs vrei sa il adaugi? (pozitia lui)");
                Integer indPr = scanner.nextInt();
                String comanda = "INSERT INTO `produs` (`denumire_categorie`, `descriere`, `denumire_produs`, `pret`) VALUES (?, ?, ?, ?)";
                PreparedStatement stat = conexiune.prepareStatement(comanda);
                stat.setString(1, produse.get(indPr).getDenumireCategorie());
                stat.setString(2, produse.get(indPr).getDescriere());
                stat.setString(3, produse.get(indPr).getDenumireProdus());
                stat.setInt(4, produse.get(indPr).getPret());
                break;
            }

        }
    }

}
