import java.util.Scanner;

class Reversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        //int modulo = 0if
      
        int sign = 1;
        if(input < 0) {
            sign = -1;
            input *= sign; 
        }
        int reversed = 0;
        while(input > 0) {
            int modulo = input % 10;
            reversed = reversed * 10 + modulo;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                System.out.println(0);
                break;
            } 
            input = input / 10;
        }
        
     System.out.println(reversed * sign);
    }
}