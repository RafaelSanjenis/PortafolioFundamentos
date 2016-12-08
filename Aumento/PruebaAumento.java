import javax.swing.JOptionPane;
import cstio.*;
import java.io.*;

public class PruebaAumento {

    Aumento Obj = new Aumento();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String r;

    void inicio() {
        p.out("Hello\n" + "\nAqui capturaremos los datos para sacar los salarios\n");
        p.setVisible(true);
    }

    void datos(Aumento b) {
        String RP;
        Obj.setNomE(JOptionPane.showInputDialog(null, "¨Cual es su Nombre?"));
        do {
            RP = d.readString("¨Cual es su Salario?");
        } while (!isNum(RP));
        b.setSalarioE(Integer.parseInt(RP));

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
        double Seg = 0.0;
        if (Obj.getsalarioe() <= 2000) {
            Seg = Obj.aumento();
        }
        if (Obj.getsalarioe() > 2000) {
            Seg = Obj.aumento("B");
        }
        if (Obj.getsalarioe() > 4000) {
            Seg = Obj.aumento(0.0);
        }
        if (Obj.getsalarioe() > 10000) {
            Seg = Obj.aumento(1);
        }
        p.out("\nDatos");
        p.out("\nSu Nombre Es: " + Obj.getnome());
        p.out("\nEl Salario Anterior Es: $  " + Obj.anterior());
        p.out("\nEl Aumento Es: $  " + Seg);
        p.out("\nEl Salario Total: $  " + Obj.aumento2() + "\n");
    }

    public static void main(String[] args) {
        String resp = "S";
        PruebaAumento Inicia = new PruebaAumento();
        Inicia.inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj);
            Inicia.Resultados();
            resp = JOptionPane.showInputDialog(null, "¨Deseas capturar los datos para otro el aumento? Si/No: ");

        }
    }
}
