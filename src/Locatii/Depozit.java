package Locatii;

import Persoane.Angajat;
import Produse.Categorie;
import Produse.Produs;

import java.util.HashMap;
import java.util.Vector;

public class Depozit extends Locatie{
    private String numeDepozit;
    private Integer suprafata; // marimea depozitului in metri patrati
    private Angajat managerDepozit;
    private HashMap<String, Categorie> listaCategoriiDepozitate; // categoriile de produse pe care pot fii stocate in depozit
    private HashMap<String, Integer> listaCantitati; // produsele si cantitatea disponibila
    private String tipDepozit; // FALSE daca este depozit pentru stocarea produselor sau TRUE daca este depozit de distributie

    public Depozit(String tara, String judet, String localitate, String strada, String numar, String numeDepozit, Integer suprafata, Angajat managerDepozit, HashMap<String, Categorie> listaCategoriiDepozitate, HashMap<String, Integer> listaCantitati, String tipDepozit) {
        super(tara, judet, localitate, strada, numar);
        this.numeDepozit = numeDepozit;
        this.suprafata = suprafata;
        this.managerDepozit = managerDepozit;
        this.listaCategoriiDepozitate = listaCategoriiDepozitate;
        this.listaCantitati = listaCantitati;
        this.tipDepozit = tipDepozit;
    }

    public Depozit() {
    }

    public String getNumeDepozit() {
        return numeDepozit;
    }

    public void setNumeDepozit(String numeDepozit) {
        this.numeDepozit = numeDepozit;
    }

    public Integer getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(Integer suprafata) {
        this.suprafata = suprafata;
    }

    public Angajat getManagerDepozit() {
        return managerDepozit;
    }

    public void setManagerDepozit(Angajat managerDepozit) {
        this.managerDepozit = managerDepozit;
    }

    public HashMap<String, Categorie> getListaCategoriiDepozitate() {
        return listaCategoriiDepozitate;
    }

    public void setListaCategoriiDepozitate(HashMap<String, Categorie> listaCategoriiDepozitate) {
        this.listaCategoriiDepozitate = listaCategoriiDepozitate;
    }

    public HashMap<String, Integer> getListaCantitati() {
        return listaCantitati;
    }

    public void setListaCantitati(HashMap<String, Integer> listaCantitati) {
        this.listaCantitati = listaCantitati;
    }

    public String getTipDepozit() {
        return tipDepozit;
    }

    public void setTipDepozit(String tipDepozit) {
        this.tipDepozit = tipDepozit;
    }

    @Override
    public String toString() {
        return "Depozit{" +
                "numeDepozit='" + numeDepozit + '\'' +
                ", suprafata=" + suprafata +
                ", managerDepozit=" + managerDepozit +
                ", listaCategoriiDepozitate=" + listaCategoriiDepozitate +
                ", listaCantitati=" + listaCantitati +
                ", tipDepozit='" + tipDepozit + '\'' +
                ", tara='" + tara + '\'' +
                ", judet='" + judet + '\'' +
                ", localitate='" + localitate + '\'' +
                ", strada='" + strada + '\'' +
                ", numar='" + numar + '\'' +
                '}';
    }
}
