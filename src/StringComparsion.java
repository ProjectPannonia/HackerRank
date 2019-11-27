import java.util.ArrayList;
import java.util.Scanner;

public class StringComparsion {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < s.length()-1; i++){

        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
