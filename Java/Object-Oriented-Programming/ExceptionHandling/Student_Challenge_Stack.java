import java.util.Arrays;

class Stack{
    private int sizeOfStack;
    private int [] stackElements;
    private int pushCounter;
    private int popCounter;
    private int counter=0;

    Stack(int sizeOfStack){
        this.sizeOfStack = sizeOfStack;
        stackElements = new int[sizeOfStack];
        pushCounter = sizeOfStack - 1;
        popCounter = 0;
    }
    public void push(int element) throws StackOverflowException{
        if(pushCounter==-1)
            throw new StackOverflowException();
        stackElements[pushCounter--] = element;
    }
    public void pop() throws StackUnderflowException {
        counter++;
        if(popCounter == sizeOfStack)
            throw new StackUnderflowException();
        stackElements[popCounter++] = 0;
    }

    public int[] getStackElements() {
//        int [] temp = new int[sizeOfStack];
        if(counter > sizeOfStack - 1)
            counter = sizeOfStack;

            return Arrays.copyOfRange(stackElements,counter,sizeOfStack);
//        return stackElements;
    }

    class StackOverflowException extends Exception{
        public String toString(){
                return "Stack is full, stack overflow occurred";
        }
    }
    class StackUnderflowException extends Exception{
        public String toString (){
            return "Stack Underflow occurred";
        }
    }

}
public class Student_Challenge_Stack{
    public static void main(String[] args) {
        Stack s = new Stack(3);
        try {
        s.push(1);
        s.push(2);
        s.push(4);
        }
        catch (Stack.StackOverflowException e){
            System.out.println(e);
        }
        try{
            s.pop();
            s.pop();
            s.pop();
        }
        catch (Stack.StackUnderflowException e){
            System.out.println(e);
        }
        System.out.println(Arrays.toString(s.getStackElements()));
    }

}