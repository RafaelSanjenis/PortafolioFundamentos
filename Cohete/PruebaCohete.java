
import cstio.*;
import javax.swing.JOptionPane;

public class PruebaCohete {

    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String r;
    int Total, Suma;
    int Segundos, Minutos, Horas, Dias;
    Cohete Obj = new Cohete();

    private void Inicio() {
        p.out("Hello\n" + "\nSe calculara el tiempo que tarda el viaje de un Cohete");
        p.setVisible(true);
    }

    void datos(Cohete b) {
        Obj.setH(Integer.parseInt(JOptionPane.showInputDialog(null, "Dame La Hora Del Despege")));
        Obj.setM(Integer.parseInt(JOptionPane.showInputDialog(null, "Dame Los Minutos Del Despege")));
        Obj.setS(Integer.parseInt(JOptionPane.showInputDialog(null, "Dame Los Segundos Del Despege")));
        Obj.setV(Integer.parseInt(JOptionPane.showInputDialog(null, "Dame El Tiempo De Vuelo En Segundos ")));
        Segundos = Obj.gets() + Obj.getv();
        Minutos = (Obj.getm() + Segundos) / 60;
        Horas = (Obj.geth() + Minutos) / 60;
        Dias = Horas / 24;

    }
    void resultados() {
        p.out("\nDias: " + Dias);
        p.out("\nHoras:  " + Horas);
        p.out("\nMinutos:  " + Minutos);
        p.out("\nSegundos:  " + Segundos + "\n");
    }


    public static void main(String[] args) {
        String resp = "S";
        PruebaCohete Inicia = new PruebaCohete();

        Inicia.Inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj);
            Inicia.resultados();
            resp = Inicia.d.readString("¿Deseas repetir el programa? Si/No: ");
        }

    }
}

