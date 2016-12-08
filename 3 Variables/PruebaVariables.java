
import javax.swing.JOptionPane;
import cstio.*;
import java.io.*;

public class PruebaVariables {

    Variables Obj = new Variables();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String r;

    void inicio() {
        p.out("Hello\n" + "\nAqui Capturaremos 3 Variables");
        p.setVisible(true);
    }

    void datos(Variables b) {
        String RP;

        do {
            RP = d.readString("Capture El Numero U: ");
        } while (!isNum(RP));
        b.setU(Integer.parseInt(RP));
        do {
            RP = d.readString("Capture El Numero D:");
        } while (!isNum(RP));
        b.setD(Integer.parseInt(RP));
        do {
            RP = d.readString("Capture El Numero T: ");
        } while (!isNum(RP));
        b.setT(Integer.parseInt(RP));
    }

    boolean isNum(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Solo se aseptan valores numericos");
            return false;
        }
    }

    void Resultados() {
        if (Obj.getu() == Obj.gett() && Obj.getd() == Obj.getu()) {
            p.out("Todas Las Variables Son Iguales");
            p.out("\nEl Numero T Es: " + Obj.gett());
            p.out("\nEl Numero D Es:  " + Obj.getd());
            p.out("\nEl Numero U Es:  " + Obj.getu() + "\n");

        } else if (Obj.getd() == Obj.gett()) {
            p.out("Dos Variables Son Iguales");
            p.out("\nEl Numero T Es: " + Obj.gett());
            p.out("\nEl Numero D Es:  " + Obj.getd() + "\n");

        } else if (Obj.getu() == Obj.gett()) {
            p.out("Dos Variables Son Iguales");
            p.out("\nEl Numero T Es: " + Obj.gett());
            p.out("\nEl Numero U Es:  " + Obj.getu() + "\n");

        } else if (Obj.getu() == Obj.getd()) {
            p.out("Dos Variables Son Iguales");
            p.out("\nEl Numero U Es: " + Obj.getu());
            p.out("\nEl Numero D Es:  " + Obj.getd() + "\n");
            p.ofoto("C:\\Users\\ricar\\Desktop\\logo.png");

        } else {
            p.out("Ninguna Variable Es Igual");
            p.out("\nEl Numero T Es: " + Obj.gett());
            p.out("\nEl Numero D Es:  " + Obj.getd());
            p.out("\nEl Numero U Es:  " + Obj.getu() + "\n");
        }
    }

    public static void main(String[] args) {
        String resp = "S";
        PruebaVariables Inicia = new PruebaVariables();
        Inicia.inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj);
            Inicia.Resultados();
            resp = JOptionPane.showInputDialog(null, "¿Deseas Calcular nuevas Variables? Si/No: ");

        }
    }
}
