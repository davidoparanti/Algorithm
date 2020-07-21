import java.util.*;
class FindIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int[] maxIndex = new int[2];

        int[][] twoDarray = new int[n][m];
        for (int i = 0; i < twoDarray.length; i++) {

            for(int j = 0; j < twoDarray[i].length; j++){
                System.out.println("Fill in your m");
                twoDarray[i][j] = sc.nextInt();
                if(max < twoDarray[i][j]) {
                    max = twoDarray[i][j];
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                }
               // max = max > twoDarray[i][j] ? max : twoDarray[i][j];
            }
        }
        System.out.println();
        for(int i = 0; i < maxIndex.length; i++){
              System.out.print(maxIndex[i] + " ");
        }
        System.out.println();
      
      
    }
}