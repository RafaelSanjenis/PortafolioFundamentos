
public class ArregloInt {


    public static void main(String[] args) {
        int[] anArray = new int[15];
        for (int i = 0; i < anArray.length; i++) {
            int TMP = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (int) TMP;
            System.out.print(anArray[i] + ", ");
        }
        System.out.println();
    }
    
}
