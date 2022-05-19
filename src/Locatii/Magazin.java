package Locatii;

import Persoane.Angajat;
import Produse.Produs;

import java.util.HashMap;
import java.util.Vector;

public class Magazin extends Locatie{

    private String numeMagazin;
    private Vector<Depozit> listaDepozite; // Depozitele care tin de respectivul magazin.
    private Angajat managerMagazin; // Orice magazin are un manager.
    private HashMap<Produs, int> listaProduse; // Produsele pe care le vinde fiecare magazin si pretul la care le vand

    public Magazin(String tara, String judet, String localitate, String strada, String numar, String numeMagazin, Vector<Depozit> listaDepozite, Angajat managerMagazin, HashMap<Produs, int> listaProduse) {
        super(tara, judet, localitate, strada, numar);
        this.numeMagazin = numeMagazin;
        this.listaDepozite = listaDepozite;
        this.managerMagazin = managerMagazin;
        this.listaProduse = listaProduse;
    }

    public Magazin() {
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public Vector<Depozit> getListaDepozite() {
        return listaDepozite;
    }

    public void setListaDepozite(Vector<Depozit> listaDepozite) {
        this.listaDepozite = listaDepozite;
    }

    public Angajat getManagerMagazin() {
        return managerMagazin;
    }

    public void setManagerMagazin(Angajat managerMagazin) {
        this.managerMagazin = managerMagazin;
    }

    public HashMap<Produs, int> getListaProduse() {
        return listaProduse;
    }

    public void setListaProduse(HashMap<Produs, int> listaProduse) {
        this.listaProduse = listaProduse;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "tara='" + tara + '\'' +
                ", judet='" + judet + '\'' +
                ", localitate='" + localitate + '\'' +
                ", strada='" + strada + '\'' +
                ", numar='" + numar + '\'' +
                ", numeMagazin='" + numeMagazin + '\'' +
                ", listaDepozite=" + listaDepozite +
                ", managerMagazin=" + managerMagazin +
                ", listaProduse=" + listaProduse +
                '}';
    }
}
