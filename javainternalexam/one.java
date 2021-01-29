/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainternalexam;
import java.util.Scanner; // needed to use Scanner for input

public class phnkeypad{

    public static void main(String[] args) {

       
        String strinput;
        int btnNumber = 0;
        StringBuffer outputstr = new StringBuffer("");// length of the input String
        Scanner in = new Scanner(System.in);
        int strlenth;

        System.out.println("Enter a String");
        strinput = in.next().toString().toLowerCase();
        strlenth = strinput.length();

        for (int i = 0; i < strlenth; i++) {
            char alphabet = strinput.charAt(i);

            if (alphabet == 'a' || alphabet == 'b' || alphabet == 'c') {
                btnNumber = 2;

            } else if (alphabet == 'd' || alphabet == 'e' || alphabet == 'f') {
                btnNumber = 3;
            } else if (alphabet == 'g' || alphabet == 'h' || alphabet == 'i') {
                btnNumber = 4;
            } else if (alphabet == 'j' || alphabet == 'k' || alphabet == 'l') {
                btnNumber = 5;
            } else if (alphabet == 'm' || alphabet == 'n' || alphabet == 'o') {
                btnNumber = 6;
            } else if (alphabet == 'p' || alphabet == 'q' || alphabet == 'r' || alphabet == 's') {
                btnNumber = 7;
            } else if (alphabet == 't' || alphabet == 'u' || alphabet == 'v') {
                btnNumber = 8;
            } else if (alphabet == 'w' || alphabet == 'x' || alphabet == 'y' || alphabet == 'z') {
                btnNumber = 9;
            } else {
               
                outputstr = new StringBuffer("Invalid Input");
                break;

            }
            outputstr.append(btnNumber);
        }

     
        System.out.print(outputstr);

        System.out.println("");

    }

}
