import java.util.*;
class AjacentMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int input = sc.nextInt();
        int[][] arr = new int[4][4];

        Boolean check =  true;
        for(int i = 0; i < arr.length -1; i++) {
            for(int j = 0; j < arr[i].length -1; j++) {
            // int a = arr[i][j], b = arr[i][j+1] , c = arr[i][j], d = arr[i+1][j]; 
                if(arr[i][j] == arr[i][j+1] && arr[i+1][j] == arr[i][j] && arr[i][j] == arr[i+1][j+1]){
                    check = false;
                                    
                }
                
                }
            }
        System.out.println(check);
    }

    
}
    