
/**
*MyStack.java
*This project provides an implementation of the StackInterface using a linked stack
data structure. 
*Mohammad Garada 
**/

package cmsc256;

import bridges.base.SLelement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.Scanner;

public class MyStack<E> implements StackInterface<E> {

    private SLelement<E> top;  // Pointer to first element
    private int size;          // Number of elements

    // Constructors
    public MyStack(int size) {
        this();
    }

    public MyStack() {
        clear();
    }

    /**
     * Adds a new entry to the top of this stack.
     *
     * @param newEntry An object to be added to the stack.
     * @throws IllegalArgumentException if newEntry is null.
     */
    @Override
    public void push(E newEntry) {
        if (newEntry == null) {
            throw new IllegalArgumentException();
        }
        top = new SLelement<E>(newEntry, top);
        size++;
    }

    /**
     * Removes and returns this stack's top entry.
     *
     * @return The object at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E it = top.getValue();
        top = top.getNext();
        size--;
        return it;
    }

    /**
     * Retrieves this stack's top entry.
     *
     * @return The object at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    @Override
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    /**
     * Detects whether this stack is empty.
     *
     * @return True if the stack is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Removes all entries from this stack.
     */
    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    /**
     * This method uses the MyStack<E> to detect whether an html file is tag balanced or not.
     *
     * @param webpage The html file to check for tag balancing.
     * @return True if the tags are balanced, false otherwise.
     * @throws FileNotFoundException if the html file is not found.
     */
   public static boolean isBalanced(File webpage) throws FileNotFoundException {

    // Create an empty stack
    Stack<Character> stack = new Stack<>();

    // Open the file and read its contents line by line
    Scanner scanner = new Scanner(webpage);
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();

        // Check each character in the line
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '<') {
                // Push the opening tag onto the stack
                stack.push(c);
            } else if (c == '>') {
                if (stack.isEmpty()) {
                    // Found a closing tag with no corresponding opening tag
                    return false;
                } else {
                    // Pop the most recent opening tag from the stack
                    stack.pop();
                }
            }
        }
    }

    // If the stack is empty, all opening tags have been closed
    return stack.isEmpty();
}

