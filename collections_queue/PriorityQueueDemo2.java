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
public class PriorityQueueDemo2 {
    
     public static void main(String args[]){
         
        PriorityQueue<String> pq = new PriorityQueue<>();
 
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
 
        System.out.println(pq);
    }
    
    
}

//Saída:
//[Para, Geeks, Geeks]