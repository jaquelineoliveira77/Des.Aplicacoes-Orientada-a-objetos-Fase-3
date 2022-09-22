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
public class PriorityQueueDemo4 {
    
      // Main Method
    public static void main(String[] args){
 
        // Creating a priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        System.out.println("PriorityQueue: " + pq);
 
        // Using the peek() method
        String element = pq.peek();
        System.out.println("Accessed Element: " + element);
    }
    
}

//Saída:
//PriorityQueue: [For, Geeks, Geeks]
//Elemento Acessado: Para