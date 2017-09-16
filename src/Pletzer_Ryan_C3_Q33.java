/*
(Financial: compare costs) Suppose you shop for rice in two different packages. You would like to write a program
to compare the cost. The program prompts the user to enter the weight and price of the each package and displays
the one with the better price

Author: Ryan Pletzer
All rights reserved

 */

import java.util.Scanner;
public class Pletzer_Ryan_C3_Q33 {
    // Deceleration of global variables
    private static double input1Cost, input1Quantity, input2cost, input2Quantity;
    private static String value;
    public static void main(String[] args) {
    welcomePrompt();
    value = compare(input1Cost, input1Quantity, input2cost, input2Quantity);
    System.out.println("Object 1 is " + "\"" + value + "\""+"/cost to object 2");
    }

    public static void welcomePrompt (){
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
    public static String compare (double input1Cost, double input1Quantity, double input2cost, double input2Quantity){
        //comparing the unit price of the two objects; if equal, less then, greater then (unit 1 perspective)
        String value = new String();
        if (input1Cost/input1Quantity == input2cost/input2Quantity)
            value = ("Equal");
        else if (input1Cost/input1Quantity <= input2cost/input2Quantity)
            value = ("Less");
        else if (input1Cost/input1Quantity >= input2cost/input2Quantity)
            value =("Greater");
        return value;
    }
}
