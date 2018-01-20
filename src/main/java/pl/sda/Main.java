package pl.sda;

public class Main {
    public static void main(String[] args) {
        String input = "+3+5+6--+5+6+9+4---+5+6+3----------";
        MyStack myStack = new MyStack();
        int i =0;
        while(i < input.length()-1){
            if(input.charAt(i++) == '+'){
                char c = input.charAt(i++);
                myStack.push(c);
            } else if( input.charAt(i++) == '-') {
                myStack.pop();
            }
        }
    }
}
