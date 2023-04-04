/**
 * MyStack.java
 * This project is basically just manipulating a Linked Stack using various different methods.
 * Mohammad Garada 
 */


package cmsc256;

import bridges.base.SLelement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.Scanner;

public class MyStack<E> implements StackInterface<E> {

    private SLelement<E> top;            // Pointer to first element
    private int size;                  // Number of elements


    //constructors
    public MyStack(int size) {
        this();
    }


    public MyStack() {
        clear();
    }

    @Override
    //Adds a new entry to the top of this stack
    public void push(E newEntry) {

        //if newEntry is null, throw an exception
     if(newEntry == null){
         throw new IllegalArgumentException();
     }
        top = new SLelement<E>(newEntry, top);
        size++;
    }

    @Override
    //Removes and returns this stack's top entry.
    public E pop() {

        //if the stack is empty, throw an exception
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E it = top.getValue();
        top = top.getNext();
        size--;
        return it;
    }

    @Override
    //Retrieves this stack's top entry.
    public E peek() {

        //if the stack is empty, throw an exception
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.getValue();
    }

    @Override
    //Detects whether this stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    //Removes all entries from this stack
    public void clear() {
        top = null;
        size = 0;
    }

    //This method uses the MyStack<E> to detect whether an html file is tag balanced or not.
    public static boolean isBalanced(File webpage) throws FileNotFoundException {

        boolean answer = false;

        Scanner input = new Scanner(webpage);
        String userInput = input.next();



        return true;
    }




}
