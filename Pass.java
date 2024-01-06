import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        String pass = "Hello123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String x = sc.nextLine();
        if (x.equals(pass)){
            System.out.println("Correct Password");
        }
        else
            System.out.println("Incorrect Password");
    }
}
