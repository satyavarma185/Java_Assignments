import java.util.*;
public class LoopsAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
        int num = sc.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 2; i <num ; i++) {
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        System.out.println();

//  Q2 - Write a program to enter the numbers till the user wants, the number can be positive,negative or zero. Calculate the sum of numbers until a negative number is encountered.
//If the input is a negative number, current sum is discarded and print -1.
        int sum = 0;
        while(sc.hasNextInt()){
            int number = sc.nextInt();
            if(number>=0) {
                sum += number;
                System.out.println(sum);
            }
            else{
                sum = -1;
                break;
            }
        }

//  Q3 - Write a program to calculate the factorial of a number
        int n = sc.nextInt();
        int fact = 1;
        if(n==0){
            System.out.println("1");
        }
        else{
            for (int i = 1; i <=n ; i++) {
                fact = fact * i;
            }
        }
        System.out.println(fact);

//  Q4- Write a program to print all Armstrong numbers between 1 to n.
        int n1 = sc.nextInt();
        int original = 1;
        while (original <= n1){
            int count = 0;
            int i = original;
        }

//  Q5- Write a program to print the cross pattern given below (in the shape of X):
        System.out.println("Enter only odd numbers to draw a x pattern:");
        int row = sc.nextInt();
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=row ; j++) {
                if(i==j || i+j==row+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//  Q6- Write a program to print alphabet diamond pattern:
           int r = sc.nextInt();
           int alphabet = 65;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < r-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i-1 ; j++) {
                System.out.print((char)(alphabet+j));
            }
            System.out.println();
        }
        for (int i = r; i >0 ; i--) {
            for (int j = 0; j <r-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i-1 ; j++) {
                System.out.print((char)(alphabet+j));
            }
            System.out.println();
        }

//  Q7- Write a program to print pattern given below :
//        *
//        *
//      *****
//        *
//        *
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == size/2){
                    System.out.print("*");
                }
                else {
                    if (j == size/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }


//  Q8 - Write a program to print a triangle of prime numbers upto given number of lines of the trinagle.
        int x1;
        int x2;
        int x3;
        int number1=3;
        int banner=0;
        x1 = scn.nextInt(); //denoting length of pattern
        int d= x1; //number of spaces at each line, equal to line number
        for(x2=1;x2<= x1; x2++){
            for(int e=1;e<=d;e++){
                System.out.print(" ");
            }
            if(x2==1){//1st line
                System.out.print("2");
            }
            else{//other lines
                for(x3=0; x3!= x2;){
                    banner=0;
                    for (int k=2;k<number1;k++){ //check if prime or not
                        if((number%k)==0)
                            banner=1; //not prime
                    }
                    if(banner==0){ //prime
                        x3++;
                        System.out.print(number1 + " ");
                    }
                    number1++;
                }
            }
            System.out.println(); //move to next line
            d--;
        }
//  Q9 - Write a program to check whether a prime Number can be expressed as a Sum of Two Prime Numbers.
         int prim = sc.nextInt();
         if(isPrime(prim) && isPrime(prim-2)){
             System.out.println(true);
         }else{
             System.out.println(false);
         }
//  Q10. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits
//       the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb
//       is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will
//       be switched on after n fluctuations.
//       Take as input a number n, representing the number of bulbs.
//       Print all the bulbs that will be on after the nth fluctuation in voltage.
         int bulbs = sc.nextInt();
         for (int i = 1; i*i <= bulbs; i++) {
            System.out.println(i*i+" ");
         }

    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for (int i = 2; i*i <= n ; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}

