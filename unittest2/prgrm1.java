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
public class prgrm1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer obj=new outer();
        outer.inner obj1=obj.new inner();
        
        obj1.calculate();
       //  obj.inputvalidation();
       
    }
    
}
class outer
{
    Scanner obj=new Scanner(System.in);
    int i,s;
    double a=0,ave,roundoff;
    boolean flag;
          void inputvalidation()
        {
        if ((s >= 0) && (s <=100)) 
        {
                 flag=true;
        } 
        else 
        {
            
                flag=false; 
        }
        }
    void repetition()
    {
        if(flag!=true)
        {
            i--;
             System.out.println("Invalid input,try again...");
        }
      
    }       
    class inner
    {
       
        void calculate()
        {
             for(i=0;i<3;)
             {
            System.out.println("Enter the mark (0-100) for student "+(i+1)+":");
            s=obj.nextInt();
           inputvalidation(); 
            repetition(); 
            i++;
             a=a+s;
             ave=a/3;
        }
           
         
          roundoff= Math.round(ave*100.00)/(100.00);
          System.out.println("Average is:"+roundoff);
         
    }
}
}