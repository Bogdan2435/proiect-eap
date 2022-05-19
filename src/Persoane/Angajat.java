package Persoane;

public class Angajat extends Persoana{
    private int salariu;
    private int departament;
    private int vechime;

    public Angajat(String numeFamilie, String prenume, String cnp, int varsta, int salariu, int departament, int vechime) {
        super(numeFamilie, prenume, cnp, varsta);
        this.salariu = salariu;
        this.departament = departament;
        this.vechime = vechime;
    }

    public Angajat() {
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "salariu=" + salariu +
                ", departament=" + departament +
                ", vechime=" + vechime +
                ", numeFamilie='" + numeFamilie + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp='" + cnp + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
