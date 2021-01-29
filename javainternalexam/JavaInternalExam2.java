/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javainternalexam;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class JavaInternalExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
       phone1 obj1=new phone1();//OBJECT CREATION
       obj1.getStr();//OBJECT CALL
       obj1.cal();//OBJECT CALL
}        
}
    class phone1
    {
            StringBuffer s1 = new StringBuffer();//STRING BUFFER
            int NoToPrint= 0,slen;
            String s;
            Scanner obj= new Scanner(System.in);
        void getStr()//TO GET A STRING
        {
             System.out.println("Enter a String");
           s =obj.next().toString().toLowerCase();
           slen = s.length();
        }
        void cal()//TO DO THE GIVEN OPERATION
        {
        for (int i = 0; i < slen; i++) {
            char alp= s.charAt(i);

            if (alp=='a'||alp=='b'||alp== 'c') 
            {
                NoToPrint=2;

            } 
            else if (alp=='d'||alp=='e'||alp== 'f') 
            {
                NoToPrint=3;
            }
            else if (alp=='g'||alp=='h'||alp=='i') 
            {
                NoToPrint=4;
            } 
            else if (alp=='j'||alp=='k'||alp=='l') 
            {
                NoToPrint = 5;
            } 
            else if (alp=='m'||alp=='n'||alp=='o') 
            {
                NoToPrint = 6;
            } 
            else if (alp== 'p'||alp== 'q' ||alp== 'r' || alp== 's') 
            {
                NoToPrint = 7;
            } 
            else if (alp=='t'||alp=='u'||alp=='v')
            {
                NoToPrint = 8;
            } 
            else if (alp=='w'||alp=='x'||alp=='y'||alp=='z') 
            {
                NoToPrint = 9;
            } 
            else
            {
                s1 = new StringBuffer("Invalid Input");
            }
            s1.append(NoToPrint);
        }
        System.out.print(s1);//PRINTING AS PERGIVEN PROBLEM
    }

  }
    
    

