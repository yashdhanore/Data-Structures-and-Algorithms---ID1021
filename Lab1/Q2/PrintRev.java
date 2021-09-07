import java.util.Scanner;

public class PrintRev {
    static void PrintRecursive(String str) {   //printing recursive using built-in string functions
        if (str.length() <= 1) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));   //displays the last character
            PrintRecursive(str.substring(0, str.length() - 1)); //reduces the length of string and calling the function
                                                                //again
        }
    }

    static void PrintIterative(String str) {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();//Using stack for iterative
        for(int i = 0; i < str.length(); i++){                  //pushing elements in the stack
            stack.push(str.charAt(i));  
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());                      //poping stack until stack is empty
        }

    }
    public static void main(String args[]) { //main for testing
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String toRev = scn.nextLine();
        //PrintRecursive(toRev);     
        PrintIterative(toRev);
    }
}
class LinkedStackOfStrings {
    private Node first = null;

    private class Node {
        char item;
        Node next;
    }
    public boolean isEmpty(){  return first == null;  }

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

