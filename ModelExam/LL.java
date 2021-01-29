/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelExam;

/**
 *
 * @author velmurugan
 */
import java.io.*; 
  
class LinkedList { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    
    Node reverse(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
  
    // prints content of double linked list 
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        list.head = new Node(10); 
        list.head.next = new Node(20); 
        list.head.next.next = new Node(30); 
        list.head.next.next.next = new Node(40); 
  
        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
}
public class LL
{
    public static class NodeA         
    {
        int data;      
        NodeA next;      
        
    }
    public static class NodeB         
    {
        int data;
        NodeB next;
    }
    public static class NodeC
    {
        int data;
        NodeC next;
    }
    public static void main(String args[])
    {
        NodeA newnodeA1=new NodeA();    
        NodeA newnodeA2=new NodeA();    
        NodeA newnodeA3=new NodeA();    
        NodeA newnodeA4=new NodeA();    
        newnodeA1.data=1;
        newnodeA2.data=3;
        newnodeA3.data=5;
        newnodeA4.data=7;
        
        NodeB newnodeB1=new NodeB();    
        NodeB newnodeB2=new NodeB();   
        NodeB newnodeB3=new NodeB();    
        NodeB newnodeB4=new NodeB();    
        newnodeB1.data=2;
        newnodeB2.data=4;
        newnodeB3.data=6;
        newnodeB4.data=8;
        
        NodeC newnodeC1=new NodeC();    
        NodeC newnodeC2=new NodeC();    
        NodeC newnodeC3=new NodeC();   
        NodeC newnodeC4=new NodeC();    
        NodeC newnodeC5=new NodeC();
        NodeC newnodeC6=new NodeC();
        NodeC newnodeC7=new NodeC();
        NodeC newnodeC8=new NodeC();
        
        
        newnodeA1.next=newnodeA2;      
        newnodeA2.next=newnodeA3;
        newnodeA3.next=newnodeA4;
        newnodeA4.next=null;
        
        newnodeB1.next=newnodeB2;      
        newnodeB2.next=newnodeB3;
        newnodeB3.next=newnodeB4;
        newnodeB4.next=null;
        
        //Now both the linked lists are complete separate linked lists
        
        newnodeC1.next=newnodeC2;
        newnodeC2.next=newnodeC3;
        newnodeC3.next=newnodeC4;
        newnodeC4.next=newnodeC5;
        newnodeC5.next=newnodeC6;
        newnodeC6.next=newnodeC7;
        newnodeC7.next=newnodeC8;
        newnodeC8.next=null;
        
        //from here the merging starts
        NodeA currentnode1=newnodeA1;        //making temporary copied nodes with head of the linkedlists
        NodeB currentnode2=newnodeB1;
        NodeC currentnode3=newnodeC1;
        while(currentnode3.next!=null)      //loop will run until it reaches the end of linked list 3
        {
            if(currentnode1.data>currentnode2.data)     //data will be compared between two nodes and the smaller data will be inserted next
            {
                currentnode3.data=currentnode2.data;
                currentnode2=currentnode2.next;
                currentnode3=currentnode3.next;
                
            }
            else if(currentnode1.data<currentnode2.data)
            {
                currentnode3.data=currentnode1.data;
                currentnode1=currentnode1.next;
                currentnode3=currentnode3.next;
            }
            
        }
        
        //from here printing starts
        
        NodeC currentnode=newnodeC1;    //make a temporary node 
        System.out.println("The merged list is:");
        for (int i=1;i<=8;i++)
        {
            System.out.print(currentnode.data+" ");
            currentnode=currentnode.next;
        }
        
        
    }
}
  