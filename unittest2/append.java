/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unittest2;
import java.util.Scanner;//IMPORTING SCANNER
public class append
{
    

    public static void main (String[] args)
    {
         // TODO code application logic here
      append1 obj= new append1();//OBJ CREATION
      obj.get();
      obj.print();
      obj.split();
     
    }
}
class append1
{
    String str1;
    String str2;
    Scanner obj=new Scanner(System.in);
    void get()//GETTING TWO STRINGS
    {
          System.out.println("Enter the first string");
       str1=obj.next();
     System.out.println("Enter the second string");
       str2=obj.next();
    }
    void split()//CONCATENATING STRINGS  AND OMITTING THE SAME LETTERS
    {
         if (str1.length() != 0 && str2.length() != 0 && str1.charAt(str1.length() - 1) == str2.charAt(0))
         {
            //  System.out.println(str1+str2);
               System.out.println("The strings after concatenation are:");
             System.out.println(str1 + str2.substring(1));
            
         }
    }
    void print()//PRINTING THE STRING AFTER CONCATENATION
    {
         System.out.println("The given strings are: "+str1+"  and  "+str2);
      
    }
 }