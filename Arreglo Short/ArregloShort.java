
public class ArregloShort {

    public static void main(String[] args) {
        short[] anArray = new short[30];
        for (int i = 0; i < anArray.length; i++) {
            int TMP = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (short) TMP;
            System.out.print(anArray[i] + ", ");
        }
        System.out.println();
    }

}
