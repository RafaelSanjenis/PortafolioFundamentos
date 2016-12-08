
public class ArregloLong {


    public static void main(String[] args) {
       long[] anArray = new long[10];
        for (int i = 0; i < anArray.length; i++) {
            int TMP = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (long) TMP;
            System.out.print(anArray[i] + ", ");
        }
        System.out.println();
    }
    
}
