import java.util.*;
public class Num_Sys_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  Q1 - Convert a decimal number into binary
        int num1 = sc.nextInt();
        int res = 0;
        int pw = 1;
        while (num1>0){
            int parity = num1 % 2;
            res += (parity * pw);
            num1/=2;
            pw*=10;
        }
        System.out.println(res);

//  Q2 - Convert a binary number to decimal
         int num2 = sc.nextInt();
         int dec = 0;
         int pow = 1;
         while (num2 > 0){
             int unit = num2 % 2;
             dec += (unit * pow);
             num2/=10;
             pow*=2;
         }
        System.out.println(dec);

//  Q3 - Add two numbers given in different base
        System.out.println("Enter decimal number : ");
        int decimal = sc.nextInt();
        System.out.println("Enter binary number : ");
        int binary = sc.nextInt();
        // Convert the binary number to decimal number
        int bin_num = 0;
        int pow1 = 1;
        while (binary > 0){
            int unit = binary % 2;
            bin_num+=(pow1 * unit);
            pow1*=2;
            binary/=10;
        }
        System.out.println("Sum is :"+(decimal + bin_num));

//  Q4 - Multiply two numbers given in different base
        System.out.println("Enter decimal number : ");
        int decimal1 = sc.nextInt();
        int binary1 = sc.nextInt();
        // Convert the binary number to decimal number
        int bin_num1 = 0;
        int pow2 = 1;
        while (binary1 > 0){
            int unit1 = binary1 % 2;
            bin_num1+=(pow2 * unit1);
            pow2*=2;
            binary1/=10;
        }
        System.out.println("Sum is :"+(decimal1 * bin_num1));

//  Q5 - Convert a decimal double number into binary string for upto k precision digits
        System.out.println("Enter the double number :");
        double d = sc.nextDouble();
        System.out.println("Enter the number of precision digits :");
        int k = sc.nextInt();
        int decimal_d = (int)d;
        double fractional_d = d - decimal_d;
        int decimal_bin = 0;
        int power = 1;
        while (decimal_d > 0){
            int parity1 = decimal_d % 2;
            decimal_bin += (parity1 * power);
            decimal_d /= 2;
            power *= 10;
        }
        String s = Integer.toString(decimal_bin) + ".";
        while(k > 0 && fractional_d != 0){
            fractional_d *= 2;
            int digit = (int)fractional_d;
            s += digit;
            fractional_d = fractional_d - digit;
            k--;
        }
        System.out.print(s);

    }
}
