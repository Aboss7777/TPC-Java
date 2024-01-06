import java.util.Scanner;

public class HCF {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf =1;
        for (int i = 1; i <=n1 && i<=n2; i++) {
            if (n1%i==0 && n2%i==0) {
                hcf=i;
            }
        }
        System.out.println("HCF of "+n1+" and "+n2+" is "+hcf);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm = (n1>n2)? n1:n2;
        int big = lcm;
        while (true) {
            if (lcm%n1==0&&lcm%n2==0) {
                System.out.println("The LCM of "+n1+" & "+n2+" is "+lcm);
                break;
            }
            lcm+=big;
        }
    }
}
