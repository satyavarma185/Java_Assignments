public class Assignment1 {
    public static void main(String[] args) {
//  Q1 - Take 2 integer values in two variables x and y and print their product.
        int x= 2;
        int y= 4;
        System.out.println(x*y);

//  Q2 - Print the ASCII value of character ‘U’
        char c = 'U';
        int ascii = c;
        System.out.println(ascii);

//  Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.
        int length = 7;
        int breadth = 4;
        System.out.println(length * breadth);

//  Q4 - Write a Java program to calculate the cube of a number.
        int cube = 4;
        System.out.println(4*4*4);

//  Q5 - Write a Java program to swap two numbers with the help of a third variable.
        int a = 2;
        int b = 3;
        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);
        int temp = a;
        a = b;
        b=temp;
        System.out.println("After Swap");
        System.out.println(a);
        System.out.println(b);
    }
}
