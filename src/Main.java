import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner to take in input
        Scanner scan = new Scanner(System.in);
        //greets user with instructions
        System.out.println("*Pig Latin Translator Engaged*");
        System.out.print("Please enter a word to translate: ");
        //takes input from user and stores word in 'word' variable
        String word = scan.nextLine();
        System.out.println(" ");
        // convert word string to lowercase
        String newWord = word.toLowerCase();
        newWord.toCharArray();
        // computating stuff
        System.out.println("*ocessingpray*");
        System.out.println(" ");
        System.out.println("*anslatingtray*");
        System.out.println(" ");
        ordway(newWord);

    }

    public static void ordway(String newWord) {
        int lengthOfWord = newWord.length();
        newWord.startsWith("a" || "e" || "i")
        char[] ordWay = new char[lengthOfWord];
        for (int i = 0; i <= (lengthOfWord - 1); i++) {
            ordWay[i] = newWord.charAt(i);
            if ((String)ordWay[i].contains('a', 'e', 'i', 'o', 'u'));
        }



    }
}
