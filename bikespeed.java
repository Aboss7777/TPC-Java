public class bikespeed {
    public static void main(String[] args) {
        bike sbike = new bike();
        bike kawasaki = new bike("Kawasaki Ninja");

        sbike.name_of_bike();
        System.out.println(kawasaki.name_of_bike);
        System.out.println();
        System.out.println("The kawasaki is faster");
    }

    
}
