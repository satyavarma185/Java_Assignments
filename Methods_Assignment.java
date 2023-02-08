import java.util.*;

// Q1 - Write a Java method to compute the average of three numbers
class Average{
    static int Average_num(int a,int b,int c){
        int avg = (a + b + c)/3;
        return avg;
    }
}

// Q2 - Write a Java method to count all vowels in a string
class Count_vowels{

    int count(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='u' || s.charAt(i)=='o'){
                count+=1;
            }
            else{
                continue;
            }
        }
        return count;
    }
}

// Q3 - Write a Java method to display the middle character of a string.
class Method3{
    String Mid_char(String s1){
        String mid;
        int l = s1.length();
        if(l%2==0){
            char mid1 = s1.charAt(l/2);
            char mid2 = s1.charAt(l/2);
            mid = ""+mid1+mid2;
        }
        else{
            mid = ""+s1.charAt(l/2);
        }
        return mid;
    }
}

// Q4 - Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
class Method4{
    boolean leap(int year){
        if(year % 4 == 0){
            if (year % 100 == 0){
                if(year % 400 ==0 ){
                    return true;
                }
                else {
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}

// Q5 - Write a Java method to find the smallest number among three numbers.
class Method5{
    int Smallest(int x,int y, int z){
        if(x<y && x<z){
            return x;
        } else if (y<x && y<z) {
            return y;
        }else{
            return z;
        }
    }
}
public class Methods_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Average avg =  new Average();
        int result = avg.Average_num(x,y,z);
        System.out.println("Average :"+result);

        String s = sc.next();
        Count_vowels cnt = new Count_vowels();
        int result1 = cnt.count(s);
        System.out.println(result1);

        String str = sc.next();
        Method3 m3 = new Method3();
        String result2 = m3.Mid_char(str);
        System.out.println(result2);

        int year = sc.nextInt();
        Method4 m4 = new Method4();
        boolean result3 = m4.leap(year);
        System.out.println(result3);

        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        Method5 m5  = new Method5();
        int result4 = m5.Smallest(p,q,r);
        System.out.println(result4);
    }
}
