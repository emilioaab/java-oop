class Stack1 {

    private int[] data; //Array to store the elements of the stack
    private int top1; //Index to store the top element of the stack

    public Stack1() { //Constructor to initialize the stack
        top1 = -1; //Initialize the top index to -1
        data = new int[10]; //Initialize the array with size 10
    }

    public void push(int value) {
    if (top1 == data.length - 1) {
        int[] temp = new int[data.length + 5];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }
    data[++top1] = value;
}

    public int pop() {
        if (top1 == -1) { //If the stack is empty
            //If the stack is empty, throw an exception
            throw new IllegalStateException("Stack is empty");
        }
        //Return the top element of the stack
        return data[top1--]; //Return the top element of the stack and decrement the top index
    }

    public int peek() { //Function to return the top element of the stack
        if (top1 == -1) { //If the stack is empty
            throw new IllegalStateException("Stack is empty");
        }
        return data[top1]; //Return the top element of the stack
    }

    public boolean isEmpty() { //Function to check if the stack is empty
        return top1 == -1; //Return true if the stack is empty, false otherwise
    }


    //Additional Functions

    public static Stack1 getReverseStack(Stack1 original) {
        Stack1 copy = new Stack1();
        Stack1 temp = new Stack1();
        while (!original.isEmpty()) {
            int value = original.pop();
            copy.push(value);
            temp.push(value);
        }
        while (!temp.isEmpty()) {
            original.push(temp.pop());
        }

        Stack1 reversed = new Stack1();
        while (!copy.isEmpty()) {
            reversed.push(copy.pop());
        }
        return reversed;
    }

    public static Stack1 getMaxStack(Stack1 original) {
        Stack1 copy = new Stack1();
        Stack1 temp = new Stack1();
        while (!original.isEmpty()) {
            int value = original.pop();
            copy.push(value);
            temp.push(value);
        }
        while (!temp.isEmpty()) {
            original.push(temp.pop());
        }

        Stack1 maxStack = new Stack1();
        int max = Integer.MIN_VALUE;
        while (!copy.isEmpty()) {
            int value = copy.pop();
            if (value > max) {
                max = value;
            }
        }
        maxStack.push(max);
        return maxStack;
    }


    public static Stack1 getEvenStack(Stack1 original) {
        Stack1 copy = new Stack1();
        Stack1 temp = new Stack1();
        while (!original.isEmpty()) {
            int value = original.pop();
            copy.push(value);
            temp.push(value);
        }
        while (!temp.isEmpty()) {
            original.push(temp.pop());
        }

        Stack1 evenStack = new Stack1();
        while (!copy.isEmpty()) {
            int value = copy.pop();
            if (value % 2 == 0) {
                evenStack.push(value);
            }
        }
        return evenStack;
    }
}
