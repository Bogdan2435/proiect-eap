package Produse;

public class Produs extends Categorie{
    private String denumireProdus;
    private int pret;

    public Produs(String denumireCategorie, String descriere, String denumireProdus, int pret) {
        super(denumireCategorie, descriere);
        this.denumireProdus = denumireProdus;
        this.pret = pret;
    }

    public Produs() {
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public void setDenumireProdus(String denumireProdus) {
        this.denumireProdus = denumireProdus;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "Categorie='" + denumireCategorie + '\'' +
                ", denumireProdus='" + denumireProdus + '\'' +
                ", pret=" + pret +
                '}';
    }
}
