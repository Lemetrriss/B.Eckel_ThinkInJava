package dima.p342;

import java.util.LinkedList;
import java.util.List;

public class Stack<T> {

    private LinkedList<T> list = new LinkedList<>();

    public void push(T t){
        list.addFirst(t);
    }

    public T pop(){
        return list.removeFirst();
    }

    public boolean empty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class Main{
    Stack<String> stack;

    public Main(String str) {
        stack = new Stack<>();
        String[] split = str.trim().split("");
        for(int i = split.length-1; i>=0; i--)
            stack.push(split[i]);
        System.out.println(stack);
    }

    private Stack<String> calc(){
        Stack<String> temp = new Stack<>();
        while (!stack.empty()){
            if(stack.pop().equals("+")){
                temp.push(stack.pop());
            } else {
                temp.pop();
            }
            System.out.println(temp);
        }
        return temp;
    }

    public static void main(String[] args) {
        Main m = new Main("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
        System.out.println(m.calc());
    }
}