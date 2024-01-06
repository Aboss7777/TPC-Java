public class functions {
    public static void main(String[] args) {
        name("Vivek");
        System.out.println(sum(10));
    }

    public static void name(String name){
        System.out.println("Good morning "+name);
    }
    public static int sum(int k){
        if (k>0) {
            return k + sum(k-1);
        }
        else
            return 0;
    }
}
