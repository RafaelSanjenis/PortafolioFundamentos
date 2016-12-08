
import javax.swing.JOptionPane;
import cstio.*;
import java.io.*;

public class PruebaCuadratica {

    double X = 0.0, Y = 0.0;
    Cuadratica Obj = new Cuadratica();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String r;

    void inicio() {
        p.out("Hello\n" + "\nAqui Calcularemoos Ecuaciones Cuadraticas");
        p.setVisible(true);
    }

    void datos(Cuadratica b) {
        String RP;

        do {
            RP = d.readString("Valor De A: ");
        } while (!isNum(RP));
        b.setA(Integer.parseInt(RP));
        do {
            RP = d.readString("Valor De B: ");
        } while (!isNum(RP));
        b.setB(Integer.parseInt(RP));
        do {
            RP = d.readString("Valor De C: ");
        } while (!isNum(RP));
        b.setC(Integer.parseInt(RP));
    }

    boolean isNum(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Solo se aseptan valores Numericos");
            return false;
        }
    }

    void Resultados() {
        X = -Obj.getb() + Math.sqrt(((Obj.getb() * Obj.getb()) - 4 * (Obj.geta() * Obj.getc())) / 2 * Obj.geta());
        Y = -Obj.getb() - Math.sqrt(((Obj.getb() * Obj.getb()) - 4 * (Obj.geta() * Obj.getc())) / 2 * Obj.geta());
        p.out("\nResultado");
        p.out("\nX1 = " + X);
        p.out("\nX2 = :  " + Y + "\n");

    }

    public static void main(String[] args) {
        String resp = "S";
        PruebaCuadratica Inicia = new PruebaCuadratica();
        Inicia.inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj);
            Inicia.Resultados();
            resp = JOptionPane.showInputDialog(null, "¿Deseas Calcular Otra Ecuacion Cuadratica? Si/No: ");

        }
    }
}
