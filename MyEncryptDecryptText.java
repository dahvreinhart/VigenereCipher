import java.util.*;
public class MyEncryptDecryptText {
    public static void main(String[] args) {
        String plainText = "ohmythisiscool";
        String key = "bob";
        String cipherText = toCipherText(plainText , key);
        String newPlainText = toPlainText (cipherText , key);
        System.out.println(cipherText);
        System.out.println();
        System.out.println(newPlainText);
    }
    public static String toCipherText(String plainText , String key) {
        char[] cipherChar = new char[plainText.length()];
        for (int i = 0; i < plainText.length(); i++) {
            int plainNum = (int) plainText.charAt(i) - 97;
            int keyNum = (int) key.charAt(i % (key.length())) - 97;
            int cipherNum = ((plainNum + keyNum) % 26) + 97;
            cipherChar[i] = (char) cipherNum;
        }
        String cipherText = new String(cipherChar);
        return cipherText;
    }
    public static String toPlainText(String cipherText , String key) {
        char[] plainChar = new char[cipherText.length()];
        for (int i = 0; i < cipherText.length(); i++) {
            int cipherNum = (int) cipherText.charAt(i) - 97;
            int keyNum = (int) key.charAt(i % (key.length())) - 97;
            int plainNum = ((26 + cipherNum - keyNum) % 26) + 97;
            plainChar[i] = (char) plainNum;
        }
        String newPlainText = new String(plainChar);
        return newPlainText;
    }
}