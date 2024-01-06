import java.util.Scanner;
class perform{
    public static void main(String[] args){
        multiplecalc obj = new multiplecalc();
        System.out.println("*****************Multiple Calci*****************");
        System.out.println("1.Area of Circle");
        System.out.println("2.Area of Square");
        System.out.println("3.Volume of Sphere");
        System.out.println("4.Circumference of circle");
        System.out.println("5.Surface Area of sphere");
        System.out.println("6.Area of rectangle");
        System.out.println("7.Area of triangle");
        System.out.println("8.Perimeter of rectangle");
        System.out.println("9.Exit");
        System.out.println("Enter Your choice");
        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();
            switch (ch) {
                case 1:
                    obj.Areaofcircle();
                    break;
                case 2:
                    obj.Areaofsquare();
                    break;
                case 3:
                    obj.VolSphere();
                    break;
                case 4:
                    obj.Circumference();
                    break;
                case 5:
                    obj.AreaSphere();
                    break;
                case 6:
                    obj.Areaofrect();
                    break;
                case 7:
                    obj.Areaoftriangle();
                    break;
                case 8:
                    obj.Periofrect();
                    break;
                default:
                    System.out.println("Please Enter a valid choice");
            }
    }
}
public class multiplecalc {
    final double PI = 3.14;
 
    public void Areaofcircle() {
        System.out.println("Enter radius of circle");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = r * r * PI;
        System.out.println(area);
    }
 
    public void Areaofsquare() {
        System.out.println("Enter side of square");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        double area = s * s;
        System.out.println(area);
    }
 
    public void Circumference() {
        System.out.println("Enter radius of circle");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double circum = 2 * r * PI;
        System.out.println(circum);
    }
 
    public void Areaofrect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int l = sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b = sc.nextInt();
        double area = l * b;
        System.out.println(area);
    }
 
    public void VolSphere() {
        System.out.println("Enter radius of sphere");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double volume = (4.0 / 3.0) * r * r * r * PI;
        System.out.println(volume);
    }
 
    public void AreaSphere() {
        System.out.println("Enter radius of sphere");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 4 * r * r * PI;
        System.out.println(area);
    }
 
    public void Areaoftriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of triangle");
        int h = sc.nextInt();
        System.out.println("Enter base of triangle");
        int b = sc.nextInt();
        double area = 0.5 * h * b;
        System.out.println(area);
    }
 
    public void Periofrect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int l = sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b = sc.nextInt();
        double peri = 2 * (l + b);
        System.out.println(peri);
    }
}