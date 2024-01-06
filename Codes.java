import java.util.Scanner;

public class Codes {
    public static void main(String[] args) {
        System.out.println("hello hello");
        Scanner sc = new Scanner(System.in);
        int x = 5,y=2;
        System.out.println(x);
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x*y);
        System.out.println("enter the number ");
        int z = sc.nextInt();
        int dig= z%10;
        System.out.println("The last digit of given number is "+dig);
        int rem, sum=0;
        while(z!=0){
            rem = z%10;
            sum = sum + rem;
            z=z/10;
        }
        System.out.println("The sum of digits is: "+sum);
        ;
    }
}
