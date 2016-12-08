
public class TipoTriangulo {

    int A, B, C;

    boolean setA(int a) {
        if (a > 0) {
            A = a;
            return true;
        } else {
            return false;
        }
    }

    boolean setB(int b) {
        if (b > 0) {
            B = b;
            return true;
        } else {
            return false;
        }
    }

    boolean setC(int c) {
        if (c > 0) {
            C = c;
            return true;
        } else {
            return false;
        }
    }

    int geta() {
        return A;
    }

    int getb() {
        return B;
    }

    int getc() {
        return C;
    }

    String printStates() {
        return ("Medida A" + A
                + "\n Medida B" + B
                + "\n Medida C" + C);
    }
}
