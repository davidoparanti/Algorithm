import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Boolean isSorted = true;
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        String[] arrayOfImput = new String[size];
        
        //System.out.println("Enter your value separated by comma");
         sc.nextLine();
        String input = sc.nextLine();
        
        arrayOfImput = input.split(" ");
        for(int i = 0; i < arrayOfImput.length -1; i++) {
            if( Integer.parseInt(arrayOfImput[i]) > Integer.parseInt(arrayOfImput[i + 1]) ) {
                isSorted =false;
            }
        }
        
        System.out.println(isSorted);
                
    }
}