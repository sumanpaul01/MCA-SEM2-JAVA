//Design a stack class. Provide your own stack exceptions namely push exception and pop exception....

import java.util.Scanner;

class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}

class Stack {
    private int[] array;
    private int top;
    private int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        top = -1;
    }

    public void push(int value) throws StackFullException {
        if (top == maxSize - 1) {
            throw new StackFullException("Stack is full. Cannot push more elements.");
        }
        array[++top] = value;
        System.out.println("Pushed element: " + value);
    }

    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty. Cannot pop from an empty stack.");
        }
        int poppedElement = array[top--];
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum size of the stack: ");
        int maxSize = scanner.nextInt();

        Stack stack = new Stack(maxSize);

        try {
            // Push elements into the stack
            for (int i = 1; i <= maxSize; i++) {
                stack.push(i * 10);
            }

            // Attempt to push more elements to trigger StackFullException
            stack.push(100); // This should throw StackFullException
        } catch (StackFullException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Pop elements from the stack
            for (int i = 1; i <= maxSize; i++) {
                stack.pop();
            }

            // Attempt to pop more elements to trigger StackEmptyException
            stack.pop(); // This should throw StackEmptyException
        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
