package Produse;

public class Categorie {
    protected String denumireCategorie;
    protected String descriere;

    public Categorie(String denumireCategorie, String descriere) {
        this.denumireCategorie = denumireCategorie;
        this.descriere = descriere;
    }

    public Categorie() {
    }

    public String getDenumireCategorie() {
        return denumireCategorie;
    }

    public void setDenumireCategorie(String denumireCategorie) {
        this.denumireCategorie = denumireCategorie;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "denumireCategorie='" + denumireCategorie + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }
}
