
// Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another. A single number is assumed to be ordered sequence with the length = 1.

// Input data format

// The first line contains the size of an array.
// The second line contains elements of the array separated by spaces.

// Example

// The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5. It includes the following elements: 1 2 3 5 7.

// Sample Input 1:

// 10
// 1 2 4 1 2 3 5 7 4 3

// Sample Output 1:

// 5
import java.util.*;
import java.lang.Math;
class Longest {

    public static void main (String[] args) {

             Scanner sc = new Scanner(System.in); 
            int length = sc.nextInt();
            int[] inputArray = new int[length];

            for(int i = 0; i < inputArray.length; i++) {
                inputArray[i] = sc.nextInt();
            }
            int highest = 0;
            int count = 1;
            int first = 0;
            
            for(int i = 1; i < inputArray.length; i++) {
                if( inputArray[i] > inputArray[first]) {
                    count++;
                    first++;
                    
                } else {
                   highest = Math.max(highest, count);
                    count = 1; 
                }
            } 
            System.out.println();
        System.out.println("The output is " + highest);
    }
}