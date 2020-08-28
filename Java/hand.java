import java.util.Arrays;

public class hand {

    static String sumGreater(int[] array, int num) {

        return Arrays.stream(array).filter(a -> a > num).reduce((b, c) -> b + c).toString();
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumGreater(array, 0));
    }
}
