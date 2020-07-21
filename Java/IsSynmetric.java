
import java.util.*;
class IsSynmetric {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the dimention of matrix");
    int n =  sc.nextInt();
    int[][] matrix = new int[n][n];

    for (int i = 0; i < matrix.length;i++){
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = sc.nextInt();
        }
    } 
    String synmetric = "YES"; 
    for (int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[i].length; j++) {
          if (matrix[i][j] != matrix[j][i]) {
              synmetric = "NO";
          } 
        }
    } 
   System.out.println(synmetric);  
  }
}