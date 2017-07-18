import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner to take in input
        Scanner scan = new Scanner(System.in);
        //greets user with instructions

        System.out.println("*Pig Latin Translator Engaged*");
        System.out.print("Please enter a word to translate: ");
        //1) take in string as word
        //takes input from user and stores word in 'word' variable
        String word = scan.nextLine();
        // convert word string to lowercase
        String lowerCaseWord = word.toLowerCase();
        String[] words = lowerCaseWord.split(" ");
        int lengthOfWords = words.length;
        for (String word1 : words) {
            String translation = pigLatin(word1, lengthOfWords);
            System.out.print(translation + " ");
        }
    }

    public static String pigLatin(String word1, int lengthOfWords) {
        int numberOfChars = 0;
        for (int i = 0; i <= lengthOfWords; i++)
            {
                if (word1.charAt(i) != 'a' && word1.charAt(i) != 'e' && word1.charAt(i) != 'i' && word1.charAt(i) != 'o' && word1.charAt(i) != 'u')
                    {
                        numberOfChars = i + 1;
                    }
                else {
                    numberOfChars = numberOfChars;
                    break;
                    }
            }
                if (numberOfChars != 0) {
                    word1 = word1.substring(numberOfChars) + word1.substring(0, numberOfChars) + "ay"; }
                else {
                    word1 = word1 + "way";
            }

        return word1;
    }


//    public static void main(String[] args) {
//
//    }
}
