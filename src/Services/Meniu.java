package Services;

import Locatii.*;
import Persoane.*;
import Produse.*;
import Services.*;

import java.util.Scanner;
import java.util.Vector;

public class Meniu {

    public void main(Vector<Locatie> loc, Vector<Persoana> pers, Vector<Angajat> ang, Vector<Categorie> cat, Vector<Produs> prod, Vector<Depozit> dep, Vector<Furnizor> furn, Vector<Magazin> mag) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Adaugare date");
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
            switch (opt) {
                case 1: { // Cazul 1 adica cand vreau sa adaug date.
                    String clasa;
                    System.out.println("Pe care dintre clase vrei sa lucrezi?");
                    System.out.println("Locatie | Furnizor | Depozit | Magazin | Persoane | Angajati | Categorii | Produse");
                    clasa = scanner.next();
                    switch (clasa) {
                        case "Locatie": {
                            int nr_locatii;
                            System.out.println("Cate locatii doriti sa introduceti?");
                            nr_locatii = scanner.nextInt();
                            for(int i = 1; i <= nr_locatii; i++){
                                loc.add(Servicii.adaugareLocatie());
                            }
                            break;
                        }
                        case "Furnizor": {
                            int nr_furnizori;
                            System.out.println("Cati furnizori doriti sa introduceti?");
                            nr_furnizori = scanner.nextInt();
                            for(int i = 1; i <= nr_furnizori; i++){
                                furn.add(Servicii.adaugareFurnizor());
                            }
                            break;
                        }
                        case "Depozit": {
                            int nr_depozite;
                            System.out.println("Cate depozite doriti sa introduceti?");
                            nr_depozite = scanner.nextInt();
                            for(int i = 1; i <= nr_depozite; i++){
                                dep.add(Servicii.adaugareDepozit());
                            }
                            break;
                        }
                        case "Magazin": {
                            int nr_magazine;
                            System.out.println("Cate magazine doriti sa introduceti?");
                            nr_magazine = scanner.nextInt();
                            for(int i = 1; i <= nr_magazine; i++){
                                mag.add(Servicii.adaugareMagazin());
                            }
                            break;
                        }
                        case "Persoane": {
                            int nr_persoane;
                            System.out.println("Cate persoane doriti sa introduceti?");
                            nr_persoane = scanner.nextInt();
                            for(int i = 1; i <= nr_persoane; i++){
                                pers.add(Servicii.adaugarePersoana());
                            }
                            break;
                        }
                        case "Angajati": {
                            int nr_angajati;
                            System.out.println("Cati angajati doriti sa introduceti?");
                            nr_angajati = scanner.nextInt();
                            for(int i = 1; i <= nr_angajati; i++){
                                ang.add(Servicii.adaugareAngajat());
                            }
                            break;
                        }
                        case "Categorii": {
                            int nr_categorii;
                            System.out.println("Cate categorii de produse doriti sa introduceti?");
                            nr_categorii = scanner.nextInt();
                            for(int i = 1; i <= nr_categorii; i++){
                                cat.add(Servicii.adaugareCategorie());
                            }
                            break;
                        }
                        case "Produse": {
                            int nr_produse;
                            System.out.println("Cate produse doriti sa introduceti?");
                            nr_produse = scanner.nextInt();
                            for (int i = 1; i <= nr_produse; i++) {
                                prod.add(Servicii.adaugareProdus());
                            }
                            break;
                        }
                    }
                    break;
                }
                case 2: { // Cazul 2 adica atunci cand vreau sa afisez datele
                    String clasa;
                    System.out.println("Pe care dintre clase vrei sa lucrezi?");
                    System.out.println("Locatie | Furnizor | Depozit | Magazin | Persoane | Angajati | Categorii | Produse");
                    clasa = scanner.next();
                    switch (clasa) {
                        case "Locatie": {
                            for (Locatie l : loc) {
                                Servicii.afisareLocatie(l);
                            }
                            break;
                        }
                        case "Furnizor": {
                            for(Furnizor f : furn){
                                Servicii.afisareFurnizor(f);
                            }
                            break;
                        }
                        case "Depozit": {
                            for(Depozit d : dep){
                                Servicii.afisareDepozit(d);
                            }
                            break;
                        }
                        case "Magazin": {
                            for(Magazin m : mag){
                                Servicii.afisareMagazin(m);
                            }
                            break;
                        }
                        case "Persoane": {
                            for(Persoana p : pers){
                                Servicii.afisarePersoana(p);
                            }
                            break;
                        }
                        case "Angajati": {
                            for(Angajat a : ang){
                                Servicii.afisareAngajat(a);
                            }
                            break;
                        }
                        case "Categorii": {
                            for(Categorie c : cat){
                                Servicii.afisareCategorie(c);
                            }
                            break;
                        }
                        case "Produse": {
                            for(Produs pr : prod){
                                Servicii.afisareProdus(pr);
                            }
                            break;
                        }
                    }
                    break;
                }
                case 3: { // Cazul 3 in care doresc sa modific informatiile.
                    String clasa;
                    System.out.println("Pe care dintre clase vrei sa lucrezi?");
                    System.out.println("Locatie | Furnizor | Depozit | Magazin | Persoane | Angajati | Categorii | Produse");
                    clasa = scanner.next();
                    switch (clasa) {
                        case "Locatie": {
                            System.out.println("A cata locatie vrei sa o modifici?");
                            int pozitie = scanner.nextInt();
                            Servicii.modificarelocatie(loc.get(pozitie));
                            break;
                        }
                        case "Furnizor": {
                            System.out.println("A catalea furnizor vrei sa il modifici?");
                            int pozitie = scanner.nextInt();
                            Servicii.modificareFurnizor(furn.get(pozitie));
                            break;
                        }
                        case "Depozit": {
                            System.out.println("A catalea depozit vrei sa il modifici?");
                            int pozitie = scanner.nextInt();
                            Servicii.modificareDepozit(dep.get(pozitie));
                            break;
                        }
                        case "Magazin": {
                            System.out.println("A catalea magazin vrei sa il modifici?");
                            int pozitie = scanner.nextInt();
                            Servicii.modificareMagazin(mag.get(pozitie));
                            break;
                        }
                        case "Persoane": {
                            System.out.println("A cata persoana vrei sa o modifici?");
                            int pozitie = scanner.nextInt();
                            Servicii.modificarePersoana(pers.get(pozitie));
                            break;
                        }
                        case "Angajati": {
                            System.out.println("A catalea angajat vrei sa il modifici?");
                            int pozitie = scanner.nextInt();
                            Servicii.modificareAngajat(ang.get(pozitie));
                            break;
                        }
                        case "Categorii": {
                            System.out.println("A cata categorie vrei sa o modifici?");
                            int pozitie = scanner.nextInt();
                            Servicii.modificareCategorie(cat.get(pozitie));
                            break;
                        }
                        case "Produse": {
                            System.out.println("A catalea produs vrei sa il modifici?");
                            int pozitie = scanner.nextInt();
                            Servicii.modificareProdus(prod.get(pozitie));
                            break;
                        }
                    }
                    break;
                }
                case 4: { // Cazul 4 adica atunci cand doresc stergerea datelor
                    String clasa;
                    System.out.println("Pe care dintre clase vrei sa lucrezi?");
                    System.out.println("Locatie | Furnizor | Depozit | Magazin | Persoane | Angajati | Categorii | Produse");
                    clasa = scanner.next();
                    switch (clasa) {
                        case "Locatie": {
                            System.out.println("A cata locatie vrei sa o stergi?");
                            int pozitie = scanner.nextInt();
                            Servicii.stergereLocatie(loc, pozitie);
                            break;
                        }
                        case "Furnizor": {
                            System.out.println("A catalea furnizor vrei sa il stergi?");
                            int pozitie = scanner.nextInt();
                            Servicii.stergereFurnizor(furn, pozitie);
                            break;
                        }
                        case "Depozit": {
                            System.out.println("A catalea depozit vrei sa il stergi?");
                            int pozitie = scanner.nextInt();
                            Servicii.stergereDepozit(dep, pozitie);
                            break;
                        }
                        case "Magazin": {
                            System.out.println("A catalea magazin vrei sa il stergi?");
                            int pozitie = scanner.nextInt();
                            Servicii.stergereMagazin(mag, pozitie);
                            break;
                        }
                        case "Persoane": {
                            System.out.println("A cata persoana vrei sa o stergi?");
                            int pozitie = scanner.nextInt();
                            Servicii.stergerePersoana(pers, pozitie);
                            break;
                        }
                        case "Angajati": {
                            System.out.println("A catalea angajat vrei sa il stergi?");
                            int pozitie = scanner.nextInt();
                            Servicii.stergereAngajat(ang, pozitie);
                            break;
                        }
                        case "Categorii": {
                            System.out.println("A cata categorie vrei sa o stergi?");
                            int pozitie = scanner.nextInt();
                            Servicii.stergereCategorie(cat, pozitie);
                            break;
                        }
                        case "Produse": {
                            System.out.println("A catalea produs vrei sa il stergi?");
                            int pozitie = scanner.nextInt();
                            Servicii.stergereProdus(prod, pozitie);
                            break;
                        }
                    }
                    break;
                }

            }
        }

    }

}
