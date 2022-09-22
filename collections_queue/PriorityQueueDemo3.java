/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_queue;

import java.util.PriorityQueue;

/**
 *
 * @author Jaqueline Oliveira
 */
public class PriorityQueueDemo3 {
    
     public static void main(String args[]){
         
        PriorityQueue<String> pq = new PriorityQueue<>();
 
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
 
        System.out.println("Initial PriorityQueue " + pq);
 
          // using the method
        pq.remove("Geeks");
 
        System.out.println("After Remove - " + pq);
 
        System.out.println("Poll Method - " + pq.poll());
 
        System.out.println("Final PriorityQueue - " + pq);
    }
    
}

//Saída:
//PriorityQueue inicial [For, Geeks, Geeks]
//Após a remoção - [Para, Geeks]
//Método de votação - para
//PriorityQueue final - [Geeks]