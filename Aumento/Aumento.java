
public class Aumento {

    private String NomE;
    private int SalarioE, Anterior;
    private double Aumento, Aumento2;

    public void setNomE(String nome) {
        this.NomE = nome;
    }

    public void setSalarioE(int salarioe) {
        this.SalarioE = salarioe;
    }

    public String getnome() {
        return NomE;
    }

    public int getsalarioe() {
        return SalarioE;
    }

    public double aumento() {
        return Aumento = SalarioE * 0.3;
    }

    public double aumento(String B) {
        return Aumento = SalarioE * 0.25;
    }

    public double aumento(double C) {
        return Aumento = SalarioE * 0.1;
    }

    public double aumento(int D) {
        return Aumento = SalarioE * 0.05;
    }

    public int anterior() {
        return Anterior = Anterior + SalarioE;
    }

    public double aumento2() {
        return Aumento2 = SalarioE + Aumento;
    }
}
