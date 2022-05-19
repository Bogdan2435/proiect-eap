package Locatii;

import Persoane.Persoana;
import Produse.Produs;

import java.util.HashMap;

public class Furnizor extends Locatie{
    private String denumireFurnizor;
    private Persoana reprezentantFurnizor; // Fiecare Furnizor trebuie sa aiba un reprezentant(o persoana)
    private HashMap<Produs, Integer> listaProduse; // Produsele ce pot fi furnizate si preturile aferente acestora

    public String getDenumireFurnizor() {
        return denumireFurnizor;
    }

    public void setDenumireFurnizor(String denumireFurnizor) {
        this.denumireFurnizor = denumireFurnizor;
    }

    public Persoana getReprezentantFurnizor() {
        return reprezentantFurnizor;
    }

    public void setReprezentantFurnizor(Persoana reprezentantFurnizor) {
        this.reprezentantFurnizor = reprezentantFurnizor;
    }

    public HashMap<Produs, Integer> getListaProduse() {
        return listaProduse;
    }

    public void setListaProduse(HashMap<Produs, Integer> listaProduse) {
        this.listaProduse = listaProduse;
    }

    public Furnizor(String tara, String judet, String localitate, String strada, String numar, String denumireFurnizor, Persoana reprezentantFurnizor, HashMap<Produs, Integer> listaProduse) {
        super(tara, judet, localitate, strada, numar);
        this.denumireFurnizor = denumireFurnizor;
        this.reprezentantFurnizor = reprezentantFurnizor;
        this.listaProduse = listaProduse;
    }

    public Furnizor() {

    }

    @Override
    public String toString() {
        return "Furnizor{" +
                "----DATE FURNIZOR----" + '\'' +
                "denumireFurnizor='" + denumireFurnizor + '\'' +
                ", reprezentantFurnizor=" + reprezentantFurnizor +
                ", listaProduse=" + listaProduse +
                "----ADRESA----" + '\'' +
                ", tara='" + tara + '\'' +
                ", judet='" + judet + '\'' +
                ", localitate='" + localitate + '\'' +
                ", strada='" + strada + '\'' +
                ", numar='" + numar + '\'' +
                '}';
    }
}
