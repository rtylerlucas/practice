package chapter.nine;

import java.util.Deque;
import java.util.LinkedList;

/*
 * NineDotOne, (9.1)
 * Implement a stack with Max API
 */
public class StackWithMax {

    private Deque<MaxStackEntry> stack = new LinkedList<>();

    public int getMax(){
        if(stack.isEmpty()){
            throw new IllegalStateException("max(): empty stack");
        }
        return stack.peek().max;
    }

    public void push(int x){
        stack.addFirst(new MaxStackEntry(x, Math.max(x, isEmpty() ? x : stack.peek().max)));
    }

    public int pop(){
        return stack.pop().entry;
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args){
        StackWithMax myStack = new StackWithMax();
    }
}
