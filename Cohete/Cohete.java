
public class Cohete {

    private int H, M, S, V;
//            Segundos, Minutos, Horas, Dias;

    public void setH(int h) {
        this.H = h;

    }

    public void setM(int m) {
        this.M = m;
    }

    public void setS(int s) {
        this.S = s;
    }

    public void setV(int v) {
        this.V = v;
    }

    public int geth() {
        return H;
    }

    public int getm() {
        return M;
    }

    public int gets() {
        return S;
    }

    public int getv() {
        return V;
    }

//    public int segundos() {
//        return Segundos = S + V;
//    }
//
//    public int minutos() {
//        return Minutos = (M + Segundos) / 60;
//    }
//
//    public int horas() {
//        return Horas = (H + Minutos) / 60;
//    }
//
//    public int dias() {
//        return Dias = Horas / 24;
//    }
}
