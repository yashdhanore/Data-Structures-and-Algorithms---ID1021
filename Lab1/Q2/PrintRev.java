// Q. Implement the above program in JAVA (both iterative and recursive) using one of the ADTs suggested 
// in Algorithms ch. 1.3 for the iterative version.

// - Used LinkedStackOfStrings from lecture slides
// - Used pop and push mechanism for iterative solution.
// - Used substring and charAt, which are String functions for recursive solution
// Author: Yash Dhanore
// Created - 6th Sept, 2021
// Upadtes - 8th Sept, 2021 (Changed input text)
//         - 14th Sept, 2021 (Changed Recursive function)

import java.util.Scanner;

public class PrintRev {

    static void RecursivePrintHelper(String str, int index) {
        if (index < 0) {
            return;
        } else {
            System.out.print(str.charAt(index));
            RecursivePrintHelper(str, --index);
        }
    }

    static void PrintRecursive(String str) { // printing recursive using built-in string functions
        RecursivePrintHelper(str, str.length() - 1);
    }

    static void PrintIterative(String str) {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();// Using stack for iterative
        for (int i = 0; i < str.length(); i++) { // pushing elements in the stack
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()); // poping stack until stack is empty
        }

    }

    public static void main(String args[]) { // main for testing
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String toRev = scn.nextLine();
        System.out.println();
        PrintRecursive(toRev);
        // PrintIterative(toRev);
    }
}

class LinkedStackOfStrings {
    private Node first = null;

    private class Node {
        char item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(char item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public char pop() {
        char item = first.item;
        first = first.next;
        return item;
    }
}
