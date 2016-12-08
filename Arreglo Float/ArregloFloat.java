
public class ArregloFloat {


    public static void main(String[] args) {
        float[] anArray = new float[100];
        for (int i = 0; i < anArray.length; i++) {
            int TMP = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (long) TMP;
            System.out.print(anArray[i] + ", ");
        }
        System.out.println();
    }
    
}
