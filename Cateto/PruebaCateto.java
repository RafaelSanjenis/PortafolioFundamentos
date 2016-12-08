
import javax.swing.JOptionPane;
import cstio.*;
import java.io.*;

public class PruebaCateto {

    double Total = 0.0;
    Cateto Obj = new Cateto();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String r;

    void inicio() {
        p.out("Hello\n" + "\nAqui calcularemos la Hipotenusa");
        p.setVisible(true);
    }

    void datos(Cateto b) {
        String RP;

        do {
            RP = d.readString("Valor Del Cateto Opuesto: ");
        } while (!isNum(RP));
        b.setCatO(Integer.parseInt(RP));
        do {
            RP = d.readString("Valor Del Cateto Adyacente: ");
        } while (!isNum(RP));
        b.setCatA(Integer.parseInt(RP));

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
        Total = Math.sqrt((Obj.getcato() * Obj.getcato()) + (Obj.getcata() * Obj.getcata()));
        p.out("\nDatos");
        p.out("\nCateto Opuesto Es: " + Obj.getcato());
        p.out("\nCateto Adyacente Es:  " + Obj.getcata());
        p.out("\nLa Hipotenusa Es De:  " + Total + "\n");
    }

    public static void main(String[] args) {
        String resp = "S";
        PruebaCateto Inicia = new PruebaCateto();
        Inicia.inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj);
            Inicia.Resultados();
            resp = JOptionPane.showInputDialog(null, "¿Deseas Calcular Los Catetos Para Sacar La Hipotenusa? Si/No: ");

        }
    }

}