import java.util.*;
import java.lang.Math;

class SimpleSearch {
    public static void main(String[] args) {
        // put your code here
        Boolean contain = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter your value ");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter your searc numbr");
        int number = sc.nextInt();

        for(int j = 0; j < array.length; j++) {
            if(array[j] == number){
               contain = true;
                
            } 
            
        }
       System.out.println(contain);
    }
}