import java.util.Scanner;

public class Loops {
    /*public static void main(String[] args) {
        for (int i=1; i<=3; i++){
            System.out.print("\n");
            for (int j = 1; j <=3; j++) {
                System.out.print(" "+j);
            }
        }
    }*/
    /*public static void main(String[] args) {
        System.out.println("Enter no of rows:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 1; i <=rows; i++) {
            System.out.print("\n");
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        }
    }*/
    /*public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= x; ++i) {
            fact *= i;
        }
        System.out.printf("Factorial of %d is %d",x,fact);
    }*/
    public static void main(String[] args) {
        System.out.println("Enter no of terms");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0,b=1,i;
        System.out.println("The Fibonacci Series:");
        for(i=0; i<=n-1; i++) {
            System.out.print(a+", ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
