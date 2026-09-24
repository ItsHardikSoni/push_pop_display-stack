import java.io.InputStream;
import java.util.Scanner;

class Student {
    static int SIZE = 5;
    static int top = -1;
    static int[] stack = new int[SIZE];


    static void push(int value){
        if(top == SIZE-1){
            System.out.println("Stack is overflow \n");
        }else{
            top++;
            stack[top] = value;
            System.out.println(value + " Pushed into stack \n");
        }
    }

    static void pop(){
        if(top == -1){
            System.out.println("Stack is underflow \n");
        }else{
            System.out.println(stack[top] + " Popped from stack \n");
            top--;
        }
    }

    static void display(){
        if(top == -1){
            System.out.println("Stack is empty \n");
        }else {
            System.out.println("Stack Elements: \n");
            for (int i = top; i >= 0; i--){
                System.out.println(stack[i]);
            }
        }
    }

}
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the operation \n 1. push \n 2. pop \n 3. display \n 4. exit \n");
            System.out.println("Enter Operation: ");
            int op = input.nextInt();

            switch (op){
                case 1:
                    System.out.println("Enter Element: ");
                    int value = input.nextInt();
                    Student.push(value);
                    break;
                case 2:
                    Student.pop();
                    break;
                case 3:
                    Student.display();
                    break;
                case 4:
                    System.out.println("Program exited.\n");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid Operator \n");
            }
        }
    }
}