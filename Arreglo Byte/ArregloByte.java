
public class ArregloByte {

    public static void main(String[] args) {
        byte[] anArray = new byte[22];
        for (int i = 0; i < anArray.length; i++) {
            int TMP = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (byte) TMP;
            System.out.print(anArray[i] + ", ");
        }
        System.out.println();
    }

}
