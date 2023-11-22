/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encrypterdecrypter;

import java.util.*;

/**
 *
 * @author Gagan
 */
public class Encrypterdecrypter {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("BestKidzKlub encrypter/decrypter");
        String message = getmsg();   //input message function called
        int option = getoption();    // input option function called
        int offset = getoffset();    // input offset function called
        System.out.println(message);
        if (option == 1) {
            String ciphertext = Encrypt(message, offset);
            System.out.println(Encrypt(message, offset));  // encryption if option =1  function called

        } else {
            String plaintext = Decrypt(message, offset);
            System.out.println(Decrypt(message, offset));  // decryptiom if option =2  function called
        }

    }

    private static String getmsg() {
        String message;
        int msglength;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the message you would like to encrypt or decrypt");
            message = input.nextLine();
            message = message.toLowerCase();  //santilsation
            msglength = message.length();
            if (msglength == 0) {
                System.out.println("Invalid input");
            }
        } while (msglength == 0);   //msg cant be empty
        return message;
    }

    private static int getoption() {
        Scanner input = new Scanner(System.in);

        int option;
        do {
            System.out.println("Enter 1 to encrypt or 2 to decrypt");
            option = input.nextInt();

            if (!(option == 1 || option == 2)) {
                System.out.println("Invalid input");  // can only run if option is 1 or 2
            }
        } while (!(option == 1 || option == 2)); // loop until 1 or 2 is entered
        return option;
    }

    private static int getoffset() {
        Scanner input = new Scanner(System.in);
        int offset;
        do {
            System.out.println("Enter offset");
            offset = input.nextInt();
            if (offset == 0 || offset <= -26 || offset >= 26) {
                System.out.println("Invalid input");
            }

        } while (offset == 0 || offset <= -26 && offset >= 26);
        return offset;
    }

    public static String Encrypt(String message, int offset) {
        message = message.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < message.length(); i++) {
            int charPosition = ALPHABET.indexOf(message.charAt(i));
            int keyVal = (offset + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    private static String Decrypt(String message, int offset) {
        message = message.toLowerCase();
        String plainText = "";
        for (int i = 0; i < message.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(message.charAt(i));
            int keyVal = (charPosition - offset) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }

}
