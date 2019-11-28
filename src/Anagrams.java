import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean flag = false;
        if(a.length() != b.length())return false;
        else{
            char[] aChars = a.toCharArray();
            char[] bChars = a.toCharArray();
            int szamlalo = 0;

            for (int i = 0; i < aChars.length; i++){

            }

        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
