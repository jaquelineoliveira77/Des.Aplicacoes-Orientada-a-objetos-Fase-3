/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author Jaqueline Oliveira
 */
public class PriorityQueueDemo5 {
    
    public static void main(String args[]) {
        
        PriorityQueue<String> pq = new PriorityQueue<>();
 
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
 
        Iterator iterator = pq.iterator();
 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
    
}

//Saída
//Para Geeks Geeks 
