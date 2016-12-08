
public class ArregloDouble {

    public static void main(String[] args) {
        double[] anArray = new double[13];
        for (int i = 0; i < anArray.length; i++) {
            int TMP = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (double) TMP;
            System.out.print(anArray[i] + ", ");
        }
        System.out.println();
    }

}
