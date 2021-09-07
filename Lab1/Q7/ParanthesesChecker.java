
/*
Task - Implement a program which takes as input a series of parentheses , that is a series of the characters:
 '(', ')', '[', ']', '{', '}'. The program should check if the parentheses are "balanced" or not

 Author: Yash Dhanore
*/
import java.util.Scanner;

//could have also done by pushing all open parantheses in the stack and if you come across a closing one, check 
//if the top most is opening. if yes then pop. But this would take more time in my opinion. 
public class ParanthesesChecker {

    static void checker(String str) {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') { // works on simple logic that if you encounter opening parantheses then
                                        // push a closing parantheses of the same. If you encounter a closing
                                        // parantheses then check if the top most element of stack is same as closing
                                        // one
                                        // if yes then it is balanced, else its not
                                        // so if the stack is empty then its balanced
                stack.push(')');
            } else if (str.charAt(i) == '{') {
                stack.push('}');
            } else if (str.charAt(i) == '[') {
                stack.push(']');
            } else if (stack.pop() != str.charAt(i)) {
                System.out.println("Not Balanced");
                return;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Balanced!");
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String string = scn.nextLine();
        checker(string);
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