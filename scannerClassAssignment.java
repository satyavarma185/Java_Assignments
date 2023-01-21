import java.util.*;
public class scannerClassAssignment {
    public static void main(String[] args) {
//   Q1 - Input name, roll number and field of interest from user and print in the format below :
//Name: xyz, Roll number: xyz, Field of interest: xyz
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rno = sc.nextInt();
        String foi = sc.next();
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Field of Interest : "+foi);

//  Q2 - Input two different string and print them in same line.
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(s1+s2);

//  Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
//100), write a program to calculate his total marks and percentage marks.
         int m1 = sc.nextInt();
         int m2 = sc.nextInt();
         int m3 = sc.nextInt();
         int Total_Marks = m1+m2+m3;
         int percentage = (Total_Marks * 100)/ 300;
         System.out.println("Total marks : "+Total_Marks);
         System.out.println("Percentage : "+percentage+"%");

//  Q4 - Given two numbers, return their sum in the following format:
//Int t representing number of test cases
//T lines of Two integers representing the numbers to be added
          int t = sc.nextInt();
          while(t != 0){
              int t1 = sc.nextInt();
              int t2 = sc.nextInt();
              System.out.println(t1+t2);
              t--;
          }

//  Q5 - Given few lines of input(number of lines unknown) where each line has two
//strings, concatenate the strings.
          while(sc.hasNextLine()){
              String a = sc.next();
              String b = sc.next();
              System.out.println(a+b);
          }
    }
}
