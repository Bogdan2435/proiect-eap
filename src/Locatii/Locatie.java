package Locatii;

public class Locatie {
    protected String tara;
    protected String judet;
    protected String localitate;
    protected String strada;
    protected String numar;

    public Locatie(String tara, String judet, String localitate, String strada, String numar) {
        this.tara = tara;
        this.judet = judet;
        this.localitate = localitate;
        this.strada = strada;
        this.numar = numar;
    }

    public Locatie() {

    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getTara() {
        return tara;
    }

    public String getJudet() {
        return judet;
    }

    public String getLocalitate() {
        return localitate;
    }

    public String getStrada() {
        return strada;
    }

    public String getNumar() {
        return numar;
    }

    @Override
    public String  toString() {
        return "Locatie{" +
                "tara='" + tara + '\'' +
                ", judet='" + judet + '\'' +
                ", localitate='" + localitate + '\'' +
                ", strada='" + strada + '\'' +
                ", numar='" + numar + '\'' +
                '}';
    }
}
