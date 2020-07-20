import java.util.*;
import java.lang.Math;

class SimpleSearch {
    public static void main(String[] args) {

        Boolean contain = false;

        System.out.println("Enter the the size of th umbrr" );
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String[] array = new String[number];

        System.out.println("Enter the word");
        String word = sc.nextLine() + sc.nextLine();
        array = word.split(" ");

        System.out.println("Enter the search word");
        String ww = sc.nextLine();

        for(String w : array ){
            if(w.equals(ww) ) {
                contain = true;
            }
        }
     
     System.out.println(contain) ; 
    }
        
            
    
   
}