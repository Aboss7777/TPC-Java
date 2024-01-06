import java.util.Scanner;

public class calc {
    /*public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter the operation to be performed(+,-,/,*):");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("The sum of two numbers is: "+(a+b));
                break;
            case '-':
                System.out.println("The difference of two numbers is: "+(a-b));
                break;
            case '*','x','X':
                System.out.println("The product of two numbers is: "+(a*b));
                break;
            case '/':
                System.out.println("The division of two numbers is: "+(a/b));
                break;
            default:
                System.out.println("Enter a valid operation");
                break;
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The character");
        char c = sc.next().charAt(0);
        if ((c>'a'&& c<'z')||(c>'A'&&c<'Z')){
            System.out.println(c+" is an alphabet");
        }
        else
            System.out.println(c+" is not an alphabet");
    }
}
