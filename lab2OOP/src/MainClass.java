public class MainClass {
    public static void main(String[] args) {
        // Test push, peek, pop, and isEmpty operations
        Stack1 stack = new Stack1();
        stack.push(5);
        stack.push(9);
        stack.push(12);

        System.out.println("Top element: " + stack.peek()); // Output: 12
        System.out.println("Popped element: " + stack.pop()); // Output: 12
        System.out.println("Popped element: " + stack.pop()); // Output: 9
        System.out.println("Is stack empty: " + stack.isEmpty()); // Output: false

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Remaining elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Test getReverseStack
        Stack1 stack1 = new Stack1();
        stack1.push(5);
        stack1.push(9);
        stack1.push(12);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        Stack1 reversedStack = Stack1.getReverseStack(stack1);
        System.out.println("Reversed Stack:");
        while (!reversedStack.isEmpty()) {
            System.out.println(reversedStack.pop());
        }

        // Test getMaxStack
        Stack1 stack2 = new Stack1();
        stack2.push(5);
        stack2.push(9);
        stack2.push(12);
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        Stack1 maxStack = Stack1.getMaxStack(stack2);
        System.out.println("Max Stack:");
        while (!maxStack.isEmpty()) {
            System.out.println(maxStack.pop());
        }

        // Test getEvenStack
        Stack1 stack3 = new Stack1();
        stack3.push(5);
        stack3.push(9);
        stack3.push(12);
        stack3.push(10);
        stack3.push(20);
        stack3.push(30);
        Stack1 evenStack = Stack1.getEvenStack(stack3);
        System.out.println("Even Stack:");
        while (!evenStack.isEmpty()) {
            System.out.println(evenStack.pop());
        }
    }
}
