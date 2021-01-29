/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest2;
import java.util.*;
public class Unit
{
public String conCat(String st1, String st2) 
{
    Scanner obj=new Scanner(System.in);
        if (st1.length() != 0 && st2.length() != 0
                && st1.charAt(st1.length() - 1) == st2.charAt(0))
            return st1 + st2.substring(1);
        return st1 + st2;
}

    public static void main (String[] args)
    {
      
       Unit s= new Unit();
      String str1,str2;
      System.out.println("Enter the first string:");
      str1=s.next();
          System.out.println("Enter the second string:");
          str2=s.next();
      System.out.println("The given strings are: "+str1+"  and  "+str2);
      System.out.println("The string after concatination are: "+obj.conCat(str1,str2));
    }
}