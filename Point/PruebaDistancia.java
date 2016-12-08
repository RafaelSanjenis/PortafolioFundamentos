
import javax.swing.JOptionPane;



public class PruebaDistancia {
 int X1, X2, Y1, Y2;
 double Total;
    public static void main(String[] args) {
       
        PruebaDistancia Obj1 = new PruebaDistancia();
//        Point Obj = new Point();
        int R;
        do {
            R = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Capturar Datos, 2.- Resultado, 3.- Salir"));
            switch (R) {
                case 1:
                    Obj1.Capturar();
                    break;
                case 2:
                    Obj1.Imprimir();
                    break;
            }
        } while (R != 3);
    }

    public void Capturar() {
        
        X1 = Integer.parseInt(JOptionPane.showInputDialog("Punto x1"));
        Y1 = Integer.parseInt(JOptionPane.showInputDialog("Punto y1"));
        X2 = Integer.parseInt(JOptionPane.showInputDialog("Punto x2"));
        Y2 = Integer.parseInt(JOptionPane.showInputDialog("Punto y2"));
    }

    public void Imprimir() {
        Total = Math.sqrt((X2 - X1) * (X2 - X1)  + (Y2 - Y1) * (X2 - X1));
        System.out.print("La Ubicacion Del Punto A: " + X1 + ", " + Y1
        + "\nLa Ubicacion Del Punto B: " + X2 + ", " + Y2 + "\nLa Distancia Entre Los Puntos Es: "
        + Total);
    }
}

