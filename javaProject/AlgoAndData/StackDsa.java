package AlgoAndData;

import java.util.Stack;

public class StackDsa {


    public static void main(String [] args){


        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("shy");
        stack.push("doom");
        stack.push("FFVI");
        stack.pop();

        System.out.println(stack);
    }
}
