import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter no of rows:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 0; i <=rows; i++) {
            System.out.print("\n");
            for (int k = rows-i; k<rows; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=rows-i; j++) {
                System.out.print("*");
            }
            for (int l = i; l < rows-1; l++) {
                System.out.print("*");
            }
        }
    }
}
