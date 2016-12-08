
import javax.swing.JOptionPane;
import cstio.*;


public class PruebaBono {

    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String r;
    Bono Obj = new Bono();
    int Total;

    void inicio() {
        p.out("Hello\n" + "\nCapturaremos la informacion del trabajador");
        p.setVisible(true);
    }

    void datos(Bono b) {
        String RP;
        Obj.setNombre(JOptionPane.showInputDialog(null, "每ual es el nombre del trabajador?"));
        do {
            RP = d.readString("每uantas Asistencias Tiene?");
        } while (!isNum(RP));
        b.setAsistencias(Integer.parseInt(RP));
        do {
            RP = d.readString("每uantas Horas Tiene?");
        } while (!isNum(RP));
        b.setHrs(Integer.parseInt(RP));
        do {
            RP = d.readString("每ual es su Sueldo?");
        } while (!isNum(RP));
        b.setSueldo(Integer.parseInt(RP));
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

        if (Obj.getasistencias() >= 20) {
            Total = 500 + Obj.getsueldo();
            p.out("\nDatos");
            p.out("\nSu Nombre Es: " + Obj.getnombre());
            p.out("\nSus Asistencias Son:  " + Obj.getasistencias());
            p.out("\nSueldo Total: $  " + Total + "\n");

        }
        if (Obj.getasistencias() == 15 && Obj.getasistencias() < 20) {
            Total = 400 + Obj.getsueldo();
            p.out("\nDatos");
            p.out("\nSu Nombre Es: " + Obj.getnombre());
            p.out("\nSus Asistencias Son:  " + Obj.getasistencias());
            p.out("\nSueldo Total $:  " + Total + "\n");

        }
        if (Obj.getasistencias() == 10 && Obj.getasistencias() < 15) {
            Total = 300 + Obj.getsueldo();
            p.out("\nDatos");
            p.out("\nSu Nombre Es: " + Obj.getnombre());
            p.out("\nSus Asistencias Son:  " + Obj.getasistencias());
            p.out("\nSueldo Total: $  " + Total + "\n");
        }
        if (Obj.getasistencias() == 0 && Obj.getasistencias() < 10) {
            Total = 200 + Obj.getsueldo();
            p.out("\nDatos");
            p.out("\nSu Nombre Es: " + Obj.getnombre());
            p.out("\nSus Asistencias Son:  " + Obj.getasistencias());
            p.out("\nSueldo Total: $  " + Total + "\n");
        }
        if (Obj.getasistencias() == 0) {
            Total = 100 + Obj.getsueldo();
            p.out("\nDatos");
            p.out("\nSu Nombre Es: " + Obj.getnombre());
            p.out("\nSus Asistencias Son:  " + Obj.getasistencias());
            p.out("\nSueldo Total: $  " + Total + "\n");
        }
    }

    public static void main(String[] args) {
        String resp = "S";
        PruebaBono Inicia = new PruebaBono();
        Inicia.inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj);
            Inicia.Resultados();
            resp = JOptionPane.showInputDialog(null, "求eseas Capturar los Datos de otro trabajador para los Aumentos? Si/No: ");
        }
    }
}
