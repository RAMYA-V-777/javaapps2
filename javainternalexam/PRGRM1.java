/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javainternalexam;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Desktop pc
 */
public class PRGRM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list= new ArrayList<String>();
        Scanner obj= new Scanner(System.in);
         list.add(0,"bags");
        list.add(1,"pens");
        list.add(2,"skies");
        list.add(3,"dogs");
        list.add(4,"roses");
        list.add(5,"caps");
        list.add(6,"apps");
        list.add(7,"fruits"); 
        



// remove all plural words
for (int i = 0; i < list.size(); i++) {
    String word = list.get(i);
    if (word.endsWith("s")) {
        list.remove(i);
        i--;
    }
    System.out.println(list);
}
//capitalize words
for (int i = 0; i < list.size(); i++) 
{
    if (list.get(i).toLowerCase().endsWith("s")) 
{
    list.set(i, list.get(i).toUpperCase());
}
}
    }


    }
    

