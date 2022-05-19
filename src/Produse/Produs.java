package Produse;

public class Produs {
    private String denumireProdus;
    private int pret;

    public Produs(String denumireProdus, int pret) {
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
                "denumireProdus='" + denumireProdus + '\'' +
                ", pret=" + pret +
                '}';
    }
}
