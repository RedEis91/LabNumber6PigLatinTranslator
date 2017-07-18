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
        System.out.println(" ");
        //2) create integer variable Spaces to hold # of space characters (with character following)
        int spaces;
        // convert word string to lowercase
        String newWord = word.toLowerCase();
        char[] newWords = newWord.toCharArray();
        int lengthOfWord = newWord.length();
        int[] numberOfSpaces = new int[lengthOfWord];
        // 3) parse thru string for spaces and count # of spaces (with character following)
        for (char word1: newWords) {

               if (word1 != ' ')  {
                   numberOfSpaces[()] = 0;
               } else if
            }
        }
        //4) every instance of a space (with character following)  will be the start of a new word
        //5) create array with a size based on # of Spaces
        //6) if # of spaces > 0, create substrings from original word starting with 0, indexOf(first space)-1
        //then indexOf(first space)+1, indexOf(second space)-1
        //then indexOf(second space)+1, indexOf(third space)-1
        //7)store substrings in wordsToTranslate array
        //8)loop thru words in wordsToTranslate array, for each word run:
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
