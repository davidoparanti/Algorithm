import java.util.*;
class FindIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();

        int[][] twoDarray = new int[n][m];
        for (int i = 0; i < twoDarray.length; i++) {

            for(int j = 0; j < twoDarray[i].length; j++){
                System.out.println("Fill in your m");
                twoDarray[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < twoDarray.length; i++){
              System.out.println(Arrays.toString(twoDarray[i]));
        }
      
    }
}