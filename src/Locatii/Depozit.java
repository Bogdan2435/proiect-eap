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
    private Vector<Categorie> listaCategoriiDepozitate; // categoriile de produse pe care pot fii stocate in depozit
    private HashMap<Produs, Integer> listaCantitati; // produsele si cantitatea disponibila
    private Boolean tipDepozit; // FALSE daca este depozit pentru stocarea produselor sau TRUE daca este depozit de distributie

    public Depozit(String tara, String judet, String localitate, String strada, String numar, String numeDepozit, Integer suprafata, Angajat managerDepozit, Vector<Categorie> listaCategoriiDepozitate, Boolean tipDepozit) {
        super(tara, judet, localitate, strada, numar);
        this.numeDepozit = numeDepozit;
        this.suprafata = suprafata;
        this.managerDepozit = managerDepozit;
        this.listaCategoriiDepozitate = listaCategoriiDepozitate;
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

    public Vector<Categorie> getListaCategoriiDepozitate() {
        return listaCategoriiDepozitate;
    }

    public void setListaCategoriiDepozitate(Vector<Categorie> listaCategoriiDepozitate) {
        this.listaCategoriiDepozitate = listaCategoriiDepozitate;
    }

    public Boolean getTipDepozit() {
        return tipDepozit;
    }

    public void setTipDepozit(Boolean tipDepozit) {
        this.tipDepozit = tipDepozit;
    }

    @Override
    public String toString() {
        return "Depozit{" +
                "numeDepozit='" + numeDepozit + '\'' +
                ", suprafata=" + suprafata +
                ", managerDepozit=" + managerDepozit +
                ", listaCategoriiDepozitate=" + listaCategoriiDepozitate +
                ", tipDepozit=" + tipDepozit +
                ", tara='" + tara + '\'' +
                ", judet='" + judet + '\'' +
                ", localitate='" + localitate + '\'' +
                ", strada='" + strada + '\'' +
                ", numar='" + numar + '\'' +
                '}';
    }
}
