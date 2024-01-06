public class leader {
    public static void main(String[] args) {
        int[] arr = {2,17,3,8,12};
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if (flag==true) {
               System.out.print(arr[i]+" "); 
            }
            
        }
    }
}
