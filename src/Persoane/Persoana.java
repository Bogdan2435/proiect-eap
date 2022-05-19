package Persoane;

public class Persoana {
    protected String numeFamilie;
    protected String prenume;
    protected String cnp;
    protected int varsta;

    public Persoana(String numeFamilie, String prenume, String cnp, int varsta) {
        this.numeFamilie = numeFamilie;
        this.prenume = prenume;
        this.cnp = cnp;
        this.varsta = varsta;
    }

    public Persoana() {
    }

    public String getNumeFamilie() {
        return numeFamilie;
    }

    public void setNumeFamilie(String numeFamilie) {
        this.numeFamilie = numeFamilie;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "numeFamilie='" + numeFamilie + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp='" + cnp + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
