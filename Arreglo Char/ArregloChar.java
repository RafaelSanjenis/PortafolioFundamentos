
public class ArregloChar {

    public static void main(String[] args) {
        char[] anArray = new char[101];
        for (int i = 0; i < anArray.length; i++) {
            int TMP = Math.round((float) Math.random() * 100000 % 65535);
            anArray[i] = (char) TMP;
            System.out.print(anArray[i] + ", ");
        }
        System.out.println();
    }
}
