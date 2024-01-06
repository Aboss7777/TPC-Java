import java.util.Scanner;

public class Array {
    /*public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];
        System.out.println("Enter values of first array");
        inp(arr1,r,c);
        System.out.println("Enter values of second array");
        inp(arr2,r,c);
        int x[][] = new int[r][c];
        int y[][] = new int[r][c];
        x= Sum(arr1, arr2);
        y= multiply(arr1, arr2);
        System.out.println("The sum of matrices is : ");
        print(x, r, c); 
        System.out.println("The product of matrices is : ");
        print(y, r, c); 
    }
    static void inp(int[][] mat1, int m, int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter element [%d][%d]: ",i,j);
                mat1[i][j] = sc.nextInt();
            }
        }
    }
    static int[][] Sum(int[][] mat1, int[][] mat2){
        int sum[][] = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        return sum;
    }
    static int[][] multiply(int[][] mat1, int[][] mat2){
        if(mat1[0].length!=mat2.length){
            System.out.println("Matrices have incompatible dimensions");
            return null;
        }
        int[][] product = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++) {
                    product[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        return product;
    }
    static void print(int[][] mat1, int n, int m){
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
