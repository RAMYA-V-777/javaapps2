/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MainPackageone;//PACKAGE FOR ACCESSING PACKAGEONE(CURRENCY PACKAGE)
import java.util.*;
import Packageone.*;//IMPORTING PACKAGEONE

/**
 *
 * @author velmurugan
 */
public class PackageForAccessingCurrency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        currency obj=new currency();//OBJECT CREATION FOR CURRENCY PACKAGE
        obj.readfunc();//FUNCTIONS ACCESSED BY MAINPACKAGEONE
        obj.convertfunc();//FUNCTIONS ACCESSED BY MAINPACKAGEONE
    }
    
}
//CONTENT OF PACKAGEONE
package Packageone;//PACKAGE FOR THE GIVEN PROGRAM
import java.util.*;


/**
 *
 * @author velmurugan
 */
public class currency {
    int type;
    double Dollar,Euro,Yen,Ind,Value;
    Scanner obj=new Scanner(System.in);
    public void readfunc()//FUNVTION TO READ THE TYPE OF CONVERSIONS
    {
        System.out.println("Enter the type of conversion:");
         System.out.println("1.Dollar");
         System.out.println("2.Euro");
         System.out.println("3.Yen");
         System.out.println("4.IndianRupees");
         System.out.println("Enter the option:");
         type=Integer.parseInt(obj.nextLine().trim());
         System.out.println("Enter no of conversions:");
         Value=Double.parseDouble(obj.nextLine().trim());
    }
    public void convertfunc()//FUNCTION TO CONVERT INTO RESPECTIVE CURRENCIES AS PER THE CHOICE OF THE USER
    {
         System.out.println("Currency conversion");
         switch(type)
         {
             case 1:Ind=Value*68.84;
                  System.out.println("Dollar="+Value);
                  System.out.println("Indianrupees="+Ind);
                 break;
             case 2:Ind=Value*80.90;
                  System.out.println("Euro="+Value);
                  System.out.println("Indianrupees="+Ind);
                 break;
            case 3:Ind=Value*0.62;
                  System.out.println("Yen="+Value);
                  System.out.println("Indianrupees="+Ind);
                 break;
            case 4:Dollar=Value/68.84;
                Euro=Value/80.90;
                Yen=Value/0.62;
                 System.out.println("Indianrupees="+Value);
                 System.out.println("Dollar="+Dollar);
                System.out.println("Euro="+Euro);
                System.out.println("Yen="+Yen);
                break;
         }
                
                 
         }
         
    }
    

    
    

