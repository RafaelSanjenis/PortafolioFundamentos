
public class Point {

    private int X1, Y1, X2, Y2;
    private double Total;

    public void setX1(int x1) {
        this.X1 = x1;
    }

    public int getx1() {
        return X1;
    }

    public void setY1(int y1) {
        this.Y1 = y1;
    }

    public int gety1() {
        return Y1;
    }

    public void setX2(int x2) {
        this.X2 = x2;
    }

    public int getx2() {
        return X2;
    }

    public void setY2(int y2) {
        this.Y1 = y2;
    }

    public int gety2() {
        return Y2;
    }

    public double total() {
        return Total = Math.sqrt((X2 - X1) * (X2 - X1)  + (Y2 - Y1) * (X2 - X1));
    }
}
