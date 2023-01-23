import java.util.*;
public class ConditionalsAssignment {
    public static void main(String[] args) {
//  Q1 - Write a program which takes the values of length and breadth from user and check if it is
// a square or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int length = sc.nextInt();
        System.out.println("Enter breadth : ");
        int breadth = sc.nextInt();
        if(length == breadth){
            System.out.println("Square");
        }
        else{
            System.out.println("Rectangle");
        }

//  Q2 - Write a program to print absolute value of a number entered by the user.
        int  num = sc.nextInt();
        if(num < 0){
            System.out.println(-(num));
        }

//  Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
// calculate Profit or Loss.
         System.out.println("Enter cost price");
         int cp = sc.nextInt();
         System.out.println("Enter selling price");
         int sp = sc.nextInt();
         int result = sp - cp;
         if(result < 0){
             System.out.println("Loss = "+result);
         }
         else if(result > 0){
             System.out.println("Profit = "+result);
         }
         else{
             System.out.println("No profit or loss");
         }

//  Q4 - Write a program to print positive number entered by the user, if user enters a negative
// number, it is skipped
         System.out.println("Enter an integer : ");
         int number = sc.nextInt();
         if(number >= 0){
             System.out.println(number);
         }
         else{
             System.out.println("The number is negative and skipped");
         }

//  Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
// and division.
        System.out.println("Enter an operator : ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String sol  = num1+" "+operator+" "+num2+" = ";
        switch(operator){
            case '+':
                System.out.println(sol+(num1+num2));
                break;
            case '-':
                System.out.println(sol+(num1-num2));
                break;
            case '/':
                System.out.println(sol+(num1/num2));
                break;
            case '*':
                System.out.println(sol+(num1*num2));
                break;
        }

//  Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :
            System.out.println("Enter Your Marks : ");
            int marks = sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("A+");
            }if(marks>90 && marks<=80){
                System.out.println("A");
            }if(marks>80 && marks<=70){
                System.out.println("B+");
            }if(marks>70 && marks<=60){
                System.out.println("B");
            }if(marks>60 && marks<=50){
                System.out.println("C");
            }if(marks>50 && marks<=40){
                System.out.println("D");
            }if(marks>40 && marks<=30){
                System.out.println("E");
            }if(marks>30 && marks<=0){
                System.out.println("F");
            }

    }
}
