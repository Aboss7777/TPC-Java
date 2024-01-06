import java.util.ArrayList;
import java.util.Arrays;
 
public class diffarr{
    /*public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6));
        ArrayList<Integer> nlist1 = new ArrayList<>();
        ArrayList<Integer> nlist2 = new ArrayList<>();
 
        for (int ele : list1) {
            if (!list2.contains(ele) && !nlist1.contains(ele)) {
                nlist1.add(ele);
            }
        }
 
        for (int ele : list2) {
            if (!list1.contains(ele) && !nlist2.contains(ele)) {
                nlist2.add(ele);
            }
        }
 
        Integer[][] nlist = new Integer[2][];
        nlist[0] = nlist1.toArray(new Integer[0]);
        nlist[1] = nlist2.toArray(new Integer[0]);
 
        System.out.println(Arrays.deepToString(nlist));
    }*/
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 9, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,8,9, 4, 9));
        ArrayList<Integer> nlist1 = new ArrayList<>();

        for (int ele : list1) {
            if (list2.contains(ele)) {
                nlist1.add(ele);
            }
        }
        System.out.println(nlist1.toString());
    }
}