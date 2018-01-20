package pl.sda;

public class MyStack {
    private char[] stack = new char[10];
    private int index = -1;

    public void push(char c){
        index++;
        if(index <=9 || index>=0){
            stack[index] = c;
        }else {
            System.out.println(":(");
        }
    }

    public char pop(){
        char peek = peek();
        if(index >= 0)
            index--;
        return peek;
    }

    public char peek(){
        if(index <=9 && index>=0){
            System.out.println(":)");
            return stack[index];
        }else {
            System.out.println(":(");
            return '?';
        }
    }
}
