import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int rem,sum=0;
        int n = sc.nextInt();
        while(n!=0){
            rem = n%10;
            sum = sum + rem;
            n=n/10;
        }
        System.out.println("The sum of digits is: "+sum);
    }
}
