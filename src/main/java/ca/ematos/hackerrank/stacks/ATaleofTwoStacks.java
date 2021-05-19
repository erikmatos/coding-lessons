package ca.ematos.hackerrank.stacks;

import java.util.ArrayDeque;
import java.util.Queue;

public class ATaleofTwoStacks<E extends Number>{

    private Queue<E> items;
    public ATaleofTwoStacks(){
        items = new ArrayDeque<E>();
    }

    public void enqueue(E number){
        items.add(number);
    }

    public void dequeue(){
        items.poll();
    }

    public E peek(){
        return items.isEmpty() ? null : items.peek();
    }

    public static void main(String[] arguments){
        ATaleofTwoStacks queue = new ATaleofTwoStacks<Integer>();

        queue.enqueue(42);
        queue.dequeue();
        queue.enqueue(14);
        System.out.println(queue.peek());
        queue.enqueue(28);
        System.out.println(queue.peek());
    }

}
