/**
 * VigenereCipher
 * Created for CSC115 Assignment One BY DAHV REINHART.
 */
import java.util.*;
public class VigenereCipher implements Cipher {
    public String cipherKey;
    public VigenereCipher(String key) {
       cipherKey = key;
    }
   
    public void runDumpArray(int[] array , String text , VigenereCipher test) {
        test.dumpArray(array , text);
    }
    public int[] runStringToIntArray(String text , VigenereCipher test) {
        int[] intTest = test.stringToIntArray(text);
        return intTest;
    }
    public String runIntArrayToString(int[] letterValues , VigenereCipher test) {
        String stringTest = test.intArrayToString(letterValues);
        return stringTest;
    }
    
    private void dumpArray(int[] array, String text) {
        System.out.print(text + " ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                System.out.print(".\n");
            }
            else {
                System.out.print(", ");
            }
        }
    }
    
    private int[] stringToIntArray(String text) {
        int[] letterNumValue = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            letterNumValue[i] = (int) text.charAt(i) - 97;
        }
        return letterNumValue;
    }
    
    private String intArrayToString(int[] encodedText) {
        String decodedText;
        char[] decodedChars = new char[encodedText.length];
        for (int i = 0; i < encodedText.length; i++) {
            decodedChars[i] = (char) (encodedText[i] + 97);
        }
        decodedText = new String(decodedChars);
        return decodedText;
    }
    
    public String encrypt(String plainText) {
        char[] cipherChar = new char[plainText.length()];
        for (int i = 0; i < plainText.length(); i++) {
            int plainNum = (int) plainText.charAt(i) - 97;
            int keyNum = (int) cipherKey.charAt(i % cipherKey.length()) - 97;
            int cipherNum = ((plainNum + keyNum) % 26) + 97;
            cipherChar[i] = (char) cipherNum;
        }
        String cipherText = new String(cipherChar);
        return cipherText;
    }

    public String decrypt(String cipherText) {
        char[] plainChar = new char[cipherText.length()];
        for (int i = 0; i < cipherText.length(); i++) {
            int cipherNum = (int) cipherText.charAt(i) - 97;
            int keyNum = (int) cipherKey.charAt(i % (cipherKey.length())) - 97;
            int plainNum = ((26 + cipherNum - keyNum) % 26) + 97;
            plainChar[i] = (char) plainNum;
        }
        String newPlainText = new String(plainChar);
        return newPlainText;
    }

    public void setKey(String key) {
    }
    
    public static void main(String[] args) {
        int[] arrayTest = {0,1,2,3,4,5};
        String textTest = "thisisatestoftheprogram";
        String key = "bob";
        VigenereCipher test = new VigenereCipher(key);
        //The below tests are aimed at comfirming the correct function of the various methods within the VigenereCipher class.
        //They may be run one at a time to test the functionality of each method in the class.
        //For varifying if the class can communicate with an outside program, please see the test available in the CipherTester class.
        
        //test.runDumpArray(arrayTest , textTest , test);
        
        //int[] stringToIntArrayTest = test.runStringToIntArray(textTest , test);
        //System.out.println(Arrays.toString(stringToIntArrayTest));
        
        //String intArrayToStringTest = test.runIntArrayToString(arrayTest , test);
        //System.out.println(intArrayToStringTest);
        
        //String encryptTest = test.encrypt(textTest);
        //System.out.println("ENCRYPTED TEXT: " + encryptTest);
        //System.out.println();
        //String decryptTest = test.decrypt(encryptTest);
        //System.out.println("DECRYPTED TEXT: " + decryptTest);
    }
} //end of VigenereCipher Class