import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine().toLowerCase(); // Convert input to lowercase
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (isVowel(ch, vowels)) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }

    private static boolean isVowel(char ch, char[] vowels) {
        for (char vowel : vowels) {
            if (ch == vowel) {
                return true;
            }
        }
        return false;
    }
}
