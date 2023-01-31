import java.util.*;
// Q1. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
//the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
class Student{
    String name;
    int roll_no;
}

// Q2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//creating a class named 'Triangle' without any parameter in its constructor.
class Triangle{
    int s1;
    int s2;
    int s3;
    double area;
    int perimeter;
}

// Q3. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
//of its length and breadth as parameters of its constructor and having a method named 'returnArea'
//which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

    class Area{
       int length;
       int breadth;
       public Area(int l, int b){
           length=l;
           breadth=b;
       }
       public int returnArea(){

           return length * breadth;
       }
    }

// Q4. Print the sum, difference and product of two complex numbers by creating a class named
//'Complex' with separate methods for each operation whose real and imaginary parts are
//entered by user.
class Complex {
    int real;
    int imag;
    public Complex(int r,int i){
          real = r;
          imag = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }
    public static Complex difference(Complex a , Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex product(Complex a,Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex(){
        if(real==0 && imag != 0){
            System.out.println(imag+"i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}

// Q5. Write a program that would print the information (name, year of joining, salary, address) of three
//employees by creating a class named 'Employee'.
class Employee{
    String name;
    int yoj;
    String address;
    
}
public class Oops_Assignment {
    public static void main(String[] args) {
//      Q-1
        Student st = new Student();
        st.name = "John";
        st.roll_no = 2;
        System.out.println(st.name);
        System.out.println(st.roll_no);

//      Q-2
        Triangle tg = new Triangle();
        tg.s1 = 3;
        tg.s2 = 4;
        tg.s3 = 5;
        tg.perimeter = tg.s1+ tg.s2+ tg.s3 ;
        System.out.println("Perimeter of triangle :"+tg.perimeter);
        int semi_p = tg.perimeter/2;
        tg.area = Math.sqrt(semi_p*(semi_p- tg.s1)*(semi_p- tg.s2)*(semi_p- tg.s3));
        System.out.println("Area of triangle :"+tg.area);

//      Q-3
        Scanner sc = new Scanner(System.in);
        int l,b;
        System.out.println("Enter length :");
        l = sc.nextInt();
        System.out.println("Enter breadth :");
        b = sc.nextInt();
        Area a = new Area(l,b);
        System.out.println("Area :"+a.returnArea());

//      Q-4
        System.out.println("Enter real part of complex 1 :");
        int real1 = sc.nextInt();
        System.out.println("Enter imaginary part of complex 1 :");
        int imag1 = sc.nextInt();
        System.out.println("Enter real part of complex 2 :");
        int real2 = sc.nextInt();
        System.out.println("Enter imaginary part of complex 2 :");
        int imag2 = sc.nextInt();
        Complex c = new Complex(real1,imag1);
        Complex d = new Complex(real2,imag2);
        Complex e = Complex.add(c,d);
        Complex f = Complex.difference(c,d);
        Complex g = Complex.product(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();

//      Q-5
        Employee emp_a = new Employee();
        emp_a.name = "Robert";
        emp_a.yoj = 1994;
        emp_a.address = "64C - WallsStreet";
        Employee emp_b = new Employee();
        emp_b.name = "Sam";
        emp_b.yoj = 2000;
        emp_b.address = "64D - WallsStreet";
        Employee emp_c = new Employee();
        emp_c.name = "John";
        emp_c.yoj = 1999;
        emp_c.address = "26B - WallsStreet";
        System.out.println("Name" + "\t" + "Year of joining" + "\t" + "Address");
        System.out.println(emp_a.name + "\t" + emp_a.yoj + "\t\t" + emp_a.address);
        System.out.println(emp_b.name + "\t" + emp_b.yoj + "\t\t" + emp_b.address);
        System.out.println(emp_c.name + "\t" + emp_c.yoj + "\t\t" + emp_c.address);
    }
}
