package collections;

import java.util.PriorityQueue;

/**
 *
 * @author Jaqueline Oliveira
 */
public class CreatePriorityQueueExample {

    //Criação de uma fila prioritária
    public static void main(String[] args) {

        // Create a Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);

        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }

    }

}

//# Output
//100
//500
//750
//900