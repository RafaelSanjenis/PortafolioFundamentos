
public class ArregloBoolean {

    public static void main(String[] args) {
        boolean[] anArray = new boolean[18];
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = Math.random() > 0.5 ? true : false;
            System.out.print(anArray[i] + ", ");
        }
    }
}
