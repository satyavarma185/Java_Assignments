import java.util.*;
//  Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array
class method1{
    void pos_array(int[] arr){
        for(int item : arr){
            if(item >= 0){
                System.out.println(item);
            }
        }
    }
}

// Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
//strings stored on odd indices of the array

class method2{
    void String_Array(String[] arr){
        for(int i=0;i< arr.length;i++){
            if(i%2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}

// Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
//elements.
class method3{
    void Traverse_Array(int[] arr){
        for(int item:arr){
            if(item%2==0){
                System.out.println(item);
            }
        }
    }
}

// Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
//for calculating the minimum element.
class method4{
    int Min_Array(int[] arr){
        int min = arr[0];
        for(int i=0;i< arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }
}

//
//Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
//Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
//Leftmost and rightmost element cannot be a peak element.
class method5{
    int peak_num(int[] arr){
        int peak=0;
        if(arr.length < 3){
            System.out.println("Array length must be greater than equal to 3");
        }
        else{
            for(int i=1;i<arr.length-1;i++){
                if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                    peak = arr[i];
                    break;
                }
            }
        }
        return peak;
    }
}
public class Array_Assignment {
public static void main(String[] args) {
    method1 m1 = new method1();
    int[] arr = {2, 6, -5, -1, 0, 4, -9};
    System.out.println("Positive values in an array : ");
    m1.pos_array(arr);

    method2 m2 = new method2();
    String[] arr4 = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
    System.out.println("Strings stored in odd indices : ");
    m2.String_Array(arr4);

    method3 m3 = new method3();
    int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println("Traverse Even Elements : ");
    m3.Traverse_Array(arr1);

    method4 m4 = new method4();
    int[] arr2 = {2, -3, 5, 8, 1, 0, -4};
    int result = m4.Min_Array(arr2);
    System.out.println("Minimum element in array : "+result);

    method5 m5 = new method5();
    int[] arr3 = {1, 1, 3, 4, 2, 3, 5, 7, 0};
    int result1 = m5.peak_num(arr3);
    System.out.println("Peak element : "+result1);
}
}
