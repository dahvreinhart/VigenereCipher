/* Dahv Reinhart
*Assignment 1 Cipher Tester Class.
*/
public class CipherTester {
 public static void main(String[] args) {
   String key = "bob";
   int[] testArray = {1,2,3,4,5};
   String testString = "wowihopethisworks";
   VigenereCipher test = new VigenereCipher(key);
   //The below code tests the encrypt decrypt function of the VigenereCipher class. All other functions of the VigenereCipher
   //class are tested from its own main() as per the instructions of the assignment.
   
   /*System.out.println(testString);
   System.out.println();
   String encryptedThing = test.encrypt(testString);
   System.out.println(encryptedThing);
   String decryptedThing = test.decrypt(encryptedThing);
   System.out.println();
   System.out.println(decryptedThing);
   */ 
 }
} //end of CipherTester class