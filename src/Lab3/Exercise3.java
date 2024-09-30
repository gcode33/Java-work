package Lab3;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {


        int characterCount = 0;
        int letterCount = 0;
        int digitCount = 0;
        int punctuationCount = 0;
        int Word_Count = 0;
        int sentenceCount = 0;


        int cnt = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String sentence = scanner.nextLine();

        while(cnt < sentence.length()){
            char ch = sentence.charAt(cnt);
            characterCount++;

            if(Character.isLetter(ch)){
                letterCount++;
            }
            else if (Character.isDigit(ch))
            {
                digitCount++;
            }
            else if (ch == ' ')
            {
                Word_Count++;
                punctuationCount++;
            }
            else if (ch == '.'|| ch == '?'|| ch == '!')
            {
                sentenceCount++;
                punctuationCount++;
            }
            else //if (ch == '!' || ch == ',' || ch == ';' || ch == '.' ||  ch == '?' || ch == '-' ||
                 //   ch == '\'' || ch == '\"' || ch == ':'||Character.isWhitespace(ch) )
            {
                punctuationCount++;
            }
            cnt++;
        }
        System.out.println("Character count: " + characterCount);
        System.out.println("Letter count: " + letterCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Word count: " + Word_Count);
        System.out.println("Punctuation count: " + punctuationCount);
        System.out.println("Sentence count: " + sentenceCount);

    }
}