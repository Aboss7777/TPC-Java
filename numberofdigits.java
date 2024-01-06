import java.util.Scanner;
import java.lang.*;

public class numberofdigits {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String x = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        rev.append(x);
        rev.reverse();
        System.out.println(rev);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int n =x;
        int rev=0,rem;
        while (n!=0) {
            rem=n%10;
            rev = rev*10 +rem;
            n=n/10;
        }
        System.out.println("Reverse is "+rev);
    }
}
