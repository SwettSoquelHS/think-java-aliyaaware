import java.util.Scanner;
public class CaesarCipher{
    public static void main(String[] args){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Ceaser Cipher please enter a Sentence you would like encrypted: ")
        String message = new String();
        message = sc.next();

        Scanner num = new Scanner(System.in);
        System.out.println("how many spaces would you like to be shifted over?: ")
        String number = new String();
        number = num.next();

        //System.out.println(encrypt(message, 3));
        //System.out.println(decrypt(encrypt(message, 3), 3));
        sc.close();
    }
    public static shifted(String n_alpha){
        String cipher="";
        String key = "";
        
    }
}



// ## cipher shift program

// ## prompting user for message and variables
// cipher = ""
// key = ""

// ## variables and alphabet
// from string import ascii_lowercase 
// from string import ascii_uppercase
// alphabet = list(ascii_lowercase)

// def shifted(n_alpha):
//     cipher = input("Enter a sentence to be encrypted ").lower()
//     key = int(input("How many spaces would you like to be shifted over? "))
//     encrypt = ''
//     if key == 0:
//         return cipher
//     else:
//         if key > 0 or key < 0:
//             shift = alphabet[key:] + alphabet[:key]
//             n_alpha = shift
//         for i in cipher:
//             if i in alphabet:
//                 encrypt+=alphabet[(alphabet.index(i)+ key)%26]
//             if i == ' ':
//                 encrypt+=i
//         return encrypt

            
// print(shifted(cipher))      
