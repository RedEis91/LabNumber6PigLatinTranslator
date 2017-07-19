import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner to take in input
        Scanner scan = new Scanner(System.in);
        //greets user with instructions
        String contin;
        System.out.println("*Pig Latin Translator Engaged*");
        System.out.println();
        do {
            System.out.println("Please enter a word or phrase to translate: ");
            System.out.println();
            //1) take in string as word
            //takes input from user and stores word in 'word' variable
            String word = scan.nextLine();
            System.out.println();
            // convert word string to lowercase
            String lowerCaseWord = word.toLowerCase();
            System.out.println("...ocessingpray...");
            System.out.println();
            System.out.println("...omputingcay...");
            System.out.println();
            String[] words = lowerCaseWord.split(" ");
            int lengthOfWords = words.length;
            System.out.println("'" +lowerCaseWord + "'" + " in pig latin is: ");
            System.out.println();
            for (String word1 : words) {
                String translation = pigLatin(word1, lengthOfWords);
                System.out.print(translation + " ");
            }
            System.out.println();
            System.out.println();
            System.out.println("Translate another word?");
            System.out.println();
            contin = scan.nextLine();
            System.out.println();
        } while (contin.contains("y") || contin.contains("Y"));
        System.out.println("Ankthay uuyay orfay ayingplay!");
        System.out.println("(Thank you for playing!)");
        System.out.println();
        System.out.println(" =D ");
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
