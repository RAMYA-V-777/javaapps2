/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unittest2;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class localincls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        out obj=new out();//obj creation
        obj.display();
       
    }
    
}
class out//outer class
{
    Scanner obj=new Scanner(System.in);
    int msal,age;
    double a,b,c,d,e,f,g,h;
    void display()//outer class method
    {
        class inn//inner class
        {
            void PensionContributionCalculator()//inner class method
            {
                System.out.println("Enter the monthly salary:");
                msal=obj.nextInt();
                System.out.println("Enter the age:");
                age=obj.nextInt();
                        
            }
           
            void contributionemp()//inner class method
            {
                 if (age <= 55) 
                 {
                      System.out.println("The employees contribution is:");
                     a=((double)msal*0.2*100.00/100.00);// 55 and below
                      System.out.println(a);
                 }
                 else if(age>=55 && age<60)
                 {
                      System.out.println("The employees contribution is:");
                        b=(double)msal*0.13*100.00/100.00;
                          System.out.println(b);
                 }
                 else if(age>=60 && age<65)
                 {
                      System.out.println("The employees contribution is:");
                        c=(double)msal*0.075*100.00/100.00;
                          System.out.println(c);
                 }
                 else if(age>65)
                 {
                      System.out.println("The employees contribution is:");
                        d=(double)msal*0.05*100.00/100.00;
                          System.out.println(d);
                 }
            }
                 void contributionemployer()//inner class method
                         
                 {
                  if (age <= 55) 
                 {
                    System.out.println("The employers contribution is:")  ;
                     e=(double)msal*0.17*100.000/100.000;// 55 and below
                       System.out.println(e);
                 }
                  else if(age>=55 && age<60)
                 {
                      System.out.println("The employers contribution is:")  ;
                        f=(double)msal*0.13*100.00/100.00;
                          System.out.println(f);
                 }
                 else if(age>=60 && age<65)
                 {
                      System.out.println("The employers contribution is:")  ;
                        g=(double)msal*0.09*100.00/100.00;
                          System.out.println(g);
                 }
                 else if(age>65)
                 {
                      System.out.println("The employers contribution is:");
                              h=(double)msal*0.075*100.00/100.00;
                                System.out.println(h);
                       
                 }
      
            }
         
                
    }
      inn obj1=new inn();
      obj1.PensionContributionCalculator();
      obj1.contributionemp();
      obj1.contributionemployer();
     
}
}