
import java.io.*;
import cstio.*;

class PTipo {

    TipoTriangulo Obj = new TipoTriangulo();
    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String r;

    void inicio() {
        p.out("Hello\n" + "\nCapturaremos Los Lados De Un Triangulo :v");
        p.setVisible(true);
    }

    void datos(TipoTriangulo b) {
        String RP;

        do {
            RP = d.readString("Capture El Lado A: ");
        } while (!isNum(RP));
        b.setA(Integer.parseInt(RP));
        do {
            RP = d.readString("Capture El Lado B:");
        } while (!isNum(RP));
        b.setB(Integer.parseInt(RP));
        do {
            RP = d.readString("Capture El Lado C: ");
        } while (!isNum(RP));
        b.setC(Integer.parseInt(RP));
    }

    boolean isNum(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Solo se aseptan numeros");
            return false;
        }
    }

    void resultados() {
        if ((Math.abs(Obj.geta() - Obj.getc()) < Obj.getb()) && (Obj.getb() < (Obj.geta() + Obj.getc()))) {
            p.out("\nMedia A Es: " + Obj.geta());
            p.out("\nMedida B Es:  " + Obj.getb());
            p.out("\nMedida C Es:  " + Obj.getc() + "\n");

        } else {
            p.out("\nNo Se Puede Formar Un Triangulo Con Estas Medidas: "
                    + Obj.geta() + ", " + Obj.getb() + ", " + Obj.getc());
        }
        if (Obj.geta() == Obj.getb() && Obj.getb() == Obj.getb()) {
            p.out("\nEl Triangulo Es Equilatero ");
        } else {
            if (Obj.geta() == Obj.getb() || Obj.geta() == Obj.getc() || Obj.getb() == Obj.getc()) {
                p.out("\nEl Triangulo Es Isoceles ");
            } else {
                if (Obj.geta() != Obj.getb() || Obj.geta() != Obj.getc() || Obj.getc() != Obj.getb()) {
                    p.out("\nEl Triangulo Es Escaleno ");                    
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        String resp = "S";
        PTipo Inicia = new PTipo();

        Inicia.inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj);
            Inicia.resultados();
            resp = Inicia.d.readString("¿Deseas calcular otro triangulo? Si/No: ");
        }
    }
}
