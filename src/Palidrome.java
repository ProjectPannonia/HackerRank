import java.util.ArrayList;
import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */


        char[] a = A.toCharArray();
        char[] b = new char[A.length()];
        int szamlalo = 0;
        for (int i = A.length()-1; i >= 0; i--){
            b[szamlalo] = a[i];
            szamlalo++;
        }
        String B = new String(b);
        System.out.println(A.equals(B) ? "Yes" : "No");
    }

}
