
import cstio.*;
import javax.swing.JOptionPane;

public class PruebaNadadores {

    Pizarra p = new Pizarra();
    Dialog d = new Dialog();
    String r;
    Medallas Obj1 = new Medallas();
    int Total, Suma;

    private void Inicio() {
        p.out("Hello\n" + "\nAqui Capturaremos El Numero De Medallas Ganadas");
        p.setVisible(true);
    }

    void datos(Medallas b) {

        Obj1.setN(JOptionPane.showInputDialog(null, "Cual Es El Nombre Del Nadador?"));
        Obj1.setS(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas Medallas Gano en Sydney?")));
        Obj1.setA(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas Medallas Gano en Atenas?")));
        Obj1.setB(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas Medallas Gano en Bellin?")));
        Obj1.setL(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas Medallas Gano en Londres?")));
        Obj1.setR(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas Medallas Gano en Rio de Janeiro?")));
        Suma = Obj1.gets() + Obj1.geta() + Obj1.getb() + Obj1.getl() + Obj1.getr();
        Total = (Obj1.gets() + Obj1.geta() + Obj1.getb() + Obj1.getl() + Obj1.getr()) / 5;
    }

    void resultados() {
        p.out("\nEl Nadador: " + Obj1.getn());
        p.out("\nSydney:  " + Obj1.gets());
        p.out("\nAtenas:  " + Obj1.geta());
        p.out("\nBellin:  " + Obj1.getb());
        p.out("\nLondres:  " + Obj1.getl());
        p.out("\nRio De janeiro:  " + Obj1.getr());
        p.out("\nSuma De Las Medallas:  " + Suma);
        p.out("\nPromedio De Medallas:  " + Total + "\n");
    }

    public static void main(String[] args) {
        String resp = "S";
        PruebaNadadores Inicia = new PruebaNadadores();

        Inicia.Inicio();
        while (resp.toUpperCase().charAt(0) == 'S') {
            Inicia.datos(Inicia.Obj1);
            Inicia.resultados();
            resp = Inicia.d.readString("Deseas Capturar El Numero De Medallas? Si/No: ");
        }

    }

}