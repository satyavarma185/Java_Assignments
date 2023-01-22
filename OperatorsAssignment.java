import java.util.*;
public class OperatorsAssignment {
    public static void main(String[] args) {
//  Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
// is taken with 5 and then multiply the resultant value by 5. Display the final result.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = (((x+8)/3)%5)*5;
        System.out.println(result);

//  Q2 - Swap two numbers without the use of third variable.
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a : "+a);
        System.out.println("b : "+b);

//  Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
        int num = sc.nextInt();
        int sum = 0;
            int f = num / 100;
            int t1 = num % 100;
            int l = t1%10;
            int m = t1/10;
            sum = f+l+m;
            System.out.println(sum);

//  Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1>50 && n1<n2);
        System.out.println(n1<50 || n1<n2);

//  Q5 - Find the total number of bits needed to be flipped to convert x to y.
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int xor = num1 ^ num2;
        int count = 0 ;
        while(xor != 0){
            xor = xor & (xor-1);
            count++;
        }
        System.out.println(count);
    }
}
