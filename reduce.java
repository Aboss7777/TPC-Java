public class reduce {
    public static void main(String[] args) {
        String s = "aabbbbeeeeffggg";
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            if (i>0){
                if (s.charAt(i)==s.charAt(i-1)) {
                    continue;
                }
            }
            int count=0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j)==s.charAt(i)) {
                    count++;
                }
                else    
                    break;
            }
            ns = ns + s.charAt(i)+count;
        }
        System.out.println(ns);
    }
    
}
