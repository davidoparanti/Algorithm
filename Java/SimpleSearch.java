import java.util.*;
import java.lang.Math;
class SimpleSearch {
    public static void main(String[] args) {
        // put your code here
        Boolean isSorted = true; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbeaar");
        int number = sc.nextInt();

        String[] array = new String[number];

        System.out.println("Enter the word");
        String word = sc.nextLine(); 
        
        array = word.split(" ");
       for(int i = 0; i < array.length - 1; i++) {
            
           if(Integer.parseInt(array[i]) > Integer.parseInt(array[i + 1]) ) {
               isSorted = false;
           }
       }

     
        System.out.println(isSorted);     
    }
