import java.util.Scanner;

public class Pletzer_Ryan_C3_Q33 {
    // Deceleration of global variables
    private static double input1Cost, input1Quantity, input2cost, input2Quantity;
    public static void main(String[] args) {
    welcomePrompt();
    compare();
    }

    private static void welcomePrompt (){
        // Welcome prompt assigning a variable to each global instance
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the price comparison tool");
        System.out.println("I will compare two objects to see which has the lower unit cost");
        System.out.println("please enter a cost for package 1 now:");
        input1Cost = input.nextDouble();
        System.out.println("please enter package 1's total quantity (include no units)");
        input1Quantity = input.nextDouble();
        System.out.println("Please enter the cost for package 2 now:");
        input2cost = input.nextDouble();
        System.out.println("Please enter package 2's total quantity (include no units)");
        input2Quantity = input.nextDouble();
    }
    private static void compare (){
        //comparing the unit price of the two objects; if equal, less then, greater then (unit 1 perspective)
        if (input1Cost/input1Quantity == input2cost/input2Quantity)
                System.out.println("the items cost the same");
        else if (input1Cost/input1Quantity <= input2cost/input2Quantity)
                System.out.println("The first item is cheaper");
        else if (input1Cost/input1Quantity >= input2cost/input2Quantity)
                System.out.println("The second item is cheaper");
    }
}
