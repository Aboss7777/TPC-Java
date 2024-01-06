import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,rem, res=0,temp;
        System.out.println("Enter a three digit number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;
        while (temp!=0) {
            rem = temp%10;
            res += Math.pow(rem, 3);
            temp=temp/10;
        }
        if (n==res) 
            System.out.println(n+" is armstrong number");
        else
            System.out.println(n+" is not armstrong");
    }
}
