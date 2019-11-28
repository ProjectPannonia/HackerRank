import java.util.Scanner;

public class StringTokenizer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // is composed of any of the following: English alphabetic letters, blank spaces,
        // exclamation points (!), commas (,),
        // question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
        String token = "[A-Za-z !,?._'@]+";
        String[] tokenizer = s.trim().split(token);
        for (int i = 0; i < tokenizer.length; i++){
            System.out.println(tokenizer[i]);
        }
        scan.close();
    }
}
