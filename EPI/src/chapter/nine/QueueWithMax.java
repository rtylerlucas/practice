package chapter.nine;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 9.12 Implement a queue with getMax API
 */
public class QueueWithMax{

    private Queue<Integer> queue = new LinkedList<>();
    private Deque<Integer> maxes = new LinkedList<>();

    public void enqueue(Integer a){
        queue.add(a);
        while(!maxes.isEmpty() && maxes.getLast() < a){
            maxes.removeLast();
        }
        maxes.add(a);
    }

    public Integer dequeue(){
        if(queue.isEmpty())
            throw new IllegalStateException("dequeue: queue is empty");
        if(0==queue.peek().compareTo(getMax())){
            maxes.removeFirst();
        }
        return queue.poll();
    }

    public int getMax(){
        return maxes.getFirst().intValue();
    }

    public static void main(String[] args){

        QueueWithMax queue = new QueueWithMax();
//		queue.enqueue(1);
//		queue.enqueue(2);
        queue.enqueue(11);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        System.out.println(queue.getMax());
    }
}
