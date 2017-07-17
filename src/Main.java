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
        if (howmanychars(newWord, lengthOfWord) == true) {
        } else {
            System.out.println(newWord + "way");
        }

    }

    public static boolean howmanychars(String newWord, int lengthOfWord) {
        int numberOfChars = 0;

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
            CharSequence pigLatinWord = newWord.substring(numberOfChars) + newWord.substring(0, numberOfChars) + "ay";
        System.out.println(pigLatinWord);
        if (pigLatinWord != null) {
            return true;
        } else {
            return false;
        }
    }

//    public static void main(String[] args) {
//
//    }
}
