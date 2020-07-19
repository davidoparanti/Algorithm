//package tictactoe;
import java.util.*; 
public class Tictactoo {
    public static void main(String[] args) {  // oxx oxo xox
        // write your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("---------");

        for(int i = 0; i < input.length(); i+=3) {
            System.out.print("|");
            System.out.print(" ");

           for(int j = i; (j < i + 3); j++) {
               System.out.print(input.charAt(j));
               System.out.print(" ");
           }

           System.out.print("|");
           System.out.print("\n");
        } 

        System.out.println("---------");
        
    }
}
