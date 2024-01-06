public class Day {
    /*public static void main(String[] args) {
        int i = 4;
        if (i==1)
            System.out.println("Today is Sunday");
        else if (i==2)
            System.out.println("Today is Monday");
        else if (i==3)
            System.out.println("Today is Tuesday");
        else if (i==4)
            System.out.println("Today is Wednesday");
        else if (i==5)
            System.out.println("Today is Thursday");
        else if (i==6)
            System.out.println("Today is Friday");
        else if (i==7)
            System.out.println("Today is Saturday");                
    }*/
    public static void main(String[] args) {
        int i = 4;
        switch (i) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Wednesay");  
                break; 
            case 4:
                System.out.println("Today is Thursday"); 
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Enter valid choice");
                break;
        }
    }
}
