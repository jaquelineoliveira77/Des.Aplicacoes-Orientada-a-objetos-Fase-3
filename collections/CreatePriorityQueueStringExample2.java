/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.PriorityQueue;

/**
 *
 * @author Jaqueline Oliveira
 */
public class CreatePriorityQueueStringExample2 {
   
    //Vamos ver o mesmo exemplo com uma fila de prioridade de elementos String.
    
    public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        // Remove items from the Priority Queue (DEQUEUE)
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }

    }
 
}

//# Output
//Angelina
//Chris
//Joe
//John
//Lisa
//Robert