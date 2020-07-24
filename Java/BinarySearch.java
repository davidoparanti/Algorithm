import java.util.*;
public class BinarySearch {

    static int binarySearch(int[] arr, int num) { //1 2 3 4 5 6 7 8 9
        int first = 0;
        int end = arr.length - 1;
        

        while(first <= end) {
            int middle =  (first + end) / 2;
            if(arr[middle] < num) {
                first = middle  + 1 ;
                //middle = Math.floor(first + end)
            } else if(arr[middle] > num) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(array, num));
    }
}