import java.io.* ;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class IsAnagram {

    static boolean isAnagram(String str1, String str2) {
        Map<String, Integer> mapStr1 = new HashMap<>();
        Map<String, Integer> mapStr2 = new HashMap<>();

        for(String s : str1.split("")) {
            if(mapStr1.containsKey(s)) {
                mapStr1.put(s, mapStr1.get(s) + 1);
            } else {
                mapStr1.put(s, 1);
            }
        }

        for(String s : str2.split("")) {
            if(mapStr2.containsKey(s)) {
                mapStr2.put(s, mapStr2.get(s) + 1);
            } else {
                mapStr2.put(s, 1);
            }
        }


        for(String s : mapStr1.keySet()) {
            if(!mapStr1.get(s).equals(mapStr2.get(2))) {
                return false;
            }
        }

        return true;
    }

    static boolean isAnagram2(String s1, String s2) {
        //Removing all white spaces from s1 and s2

        String copyOfs1 = s1.replaceAll("s", "");

        String copyOfs2 = s2.replaceAll("s", "");

        //Initially setting status as true

        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

            status = false;
        } else {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array

            char[] s1Array = copyOfs1.toLowerCase().toCharArray();

            char[] s2Array = copyOfs2.toLowerCase().toCharArray();

            //Sorting both s1Array and s2Array

            Arrays.sort(s1Array);

            Arrays.sort(s2Array);

            //Checking whether s1Array and s2Array are equal


        }

        //Output
        return true;


    }
    public static void main(String[] args) {
        System.out.println(isAnagram("ooo", "ooo"));
    }
}