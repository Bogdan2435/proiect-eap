package Locatii;

import Persoane.Angajat;
import Produse.Produs;

import java.util.HashMap;
import java.util.Vector;

public class Magazin extends Locatie{

    private String numeMagazin;
    private HashMap<String, Depozit> listaDepozite; // Depozitele care tin de respectivul magazin.
    private Angajat managerMagazin; // Orice magazin are un manager.

    public Magazin(String tara, String judet, String localitate, String strada, String numar, String numeMagazin, HashMap<String, Depozit> listaDepozite, Angajat managerMagazin) {
        super(tara, judet, localitate, strada, numar);
        this.numeMagazin = numeMagazin;
        this.listaDepozite = listaDepozite;
        this.managerMagazin = managerMagazin;
    }

    public Magazin() {
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public HashMap<String, Depozit> getListaDepozite() {
        return listaDepozite;
    }

    public void setListaDepozite(HashMap<String, Depozit> listaDepozite) {
        this.listaDepozite = listaDepozite;
    }

    public Angajat getManagerMagazin() {
        return managerMagazin;
    }

    public void setManagerMagazin(Angajat managerMagazin) {
        this.managerMagazin = managerMagazin;
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
                '}';
    }
}
