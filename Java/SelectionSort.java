import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {8,3,4,7,0,9,2,1,4,-4,-20};
        selectionSort(array);

        System.out.println(Arrays.toString(array));  // [-20, -4, 0, 1, 2, 3, 4, 4, 7, 8, 9]
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int findMinIndex(int[] array, int startIndex) {
        int minIndex = startIndex;
        int minValue = array[startIndex];
        for(int i = startIndex + 1; i < array.length; i++) {
            if(array[i] < minValue) {
                minIndex = i;
                minValue = array[minIndex];
            }
        }
        return  minIndex;
    }



    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = findMinIndex(array, i);
            swap(array, i, minIndex);
        }

    }
}

