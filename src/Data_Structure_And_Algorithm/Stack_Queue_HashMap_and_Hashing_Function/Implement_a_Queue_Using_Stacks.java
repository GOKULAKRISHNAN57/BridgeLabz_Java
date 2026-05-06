package Data_Structure_And_Algorithm.Stack_Queue_HashMap_and_Hashing_Function;

import java.util.Stack;

public class Implement_a_Queue_Using_Stacks {

    public Stack<Integer> stack1 = new Stack<>();
    public Stack<Integer> stack2 = new Stack<>();


    public void insertion(int number){

            while (!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }

            stack1.add(number);

            while (!stack2.isEmpty()){
                stack1.add(stack2.pop());
            }


    }

    public void removal(){
        if(!stack1.isEmpty()){
            stack1.pop();
        }
        else{
            System.out.println("stack is empty we cant remove !!!");
        }
    }
    public static void main(String[] args) {


        Implement_a_Queue_Using_Stacks implementAQueueUsingStacks = new Implement_a_Queue_Using_Stacks();
        implementAQueueUsingStacks.insertion(12);
        implementAQueueUsingStacks.insertion(3);
        implementAQueueUsingStacks.insertion(5);
        implementAQueueUsingStacks.insertion(7);
        implementAQueueUsingStacks.insertion(4);

        implementAQueueUsingStacks.removal();
        implementAQueueUsingStacks.removal();

        System.out.println(implementAQueueUsingStacks.stack1);



    }
}
