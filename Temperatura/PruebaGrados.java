
import javax.swing.JOptionPane;
import cstio.*;
import java.io.*;

public class PruebaGrados {

    int CF, CC;
    Grados Obj = new Grados();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String r;

    void inicio() {
        p.out("Hello\n" + "\nSe Caculara la conversion de Centigrados a Farengeit y de Farengeit a Centigrados");
        p.setVisible(true);
    }

    void datos(Grados b) {
        String RP;

        do {
            RP = d.readString("Cuantos Grados Centigrados son: ");
        } while (!isNum(RP));
        b.setC(Integer.parseInt(RP));
        do {
            RP = d.readString("Cuantos Grados Farengeit son: ");
        } while (!isNum(RP));
        b.setF(Integer.parseInt(RP));
        CF = 18 * Obj.getc() + 32;
        CC = (Obj.getf() - 32) / 18;
    }

    boolean isNum(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("solo se aceptan valores numericos");
            return false;
        }
    }

    void Resultados() {

        p.out("\nResultados");
        p.out("\nTemperatura En øC = " + Obj.getc() + " Su Equivalente En øF = " + CF);
        p.out("\nTemperatura En øF = " + Obj.getf() + " Su Equivalente En øC = " + CC + "\n");       
    }

    public static void main(String[] args) {
        String resp = "S";
        PruebaGrados Inicia = new PruebaGrados();
        Inicia.inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj);
            Inicia.Resultados();
            resp = JOptionPane.showInputDialog(null, "¨Deseas Calcular Otra Equivalencia? Si/No: ");

        }

    }
}
