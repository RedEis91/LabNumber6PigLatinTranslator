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
//        System.out.println("*ocessingpray*");
//        System.out.println(" ");
//        System.out.println("*anslatingtray*");
//        System.out.println(" ");
        int lengthOfWord = newWord.length();
       pigLatin(newWord, lengthOfWord);

    }

    public static void pigLatin(String newWord, int lengthOfWord) {
        int numberOfChars = 0;
        CharSequence pigLatinWord;
        for (int i = 0; i <= lengthOfWord; i++)
            {
                if (newWord.charAt(i) != 'a' && newWord.charAt(i) != 'e' && newWord.charAt(i) != 'i' && newWord.charAt(i) != 'o' && newWord.charAt(i) != 'u')
                    {
                        numberOfChars = i + 1;
                    }
                else {
                    numberOfChars = numberOfChars;
                    break;
                    }
            }
                if (numberOfChars != 0) {
                    pigLatinWord = newWord.substring(numberOfChars) + newWord.substring(0, numberOfChars) + "ay"; }
                else {
                    pigLatinWord = newWord + "way";
            }
        System.out.println(pigLatinWord);

    }

//    public static void main(String[] args) {
//
//    }
}
