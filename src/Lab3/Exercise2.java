package Lab3;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[]args){

        String Sentence = "";
        int total_char = 0;
        int total_vowels=0;
        int total_digits=0;
        int total_oddNum_chars=0;
        int Consecutive_chars=0;
        int i = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a sentence terminated with a full-stop or exclamation mark: ");
        Sentence = input.nextLine();

        char ch = Sentence.charAt(i);

        while(ch != '!' && ch != '.' ) {

            //do loop stuff

            total_char++;
            i++;
            ch = Sentence.charAt(i);
            int l =  (char) Sentence.length();
            if(Character.isDigit(ch)){
                total_digits++;
                int digit = Character.getNumericValue(ch);

                if (digit % 2 != 0) {
                    total_oddNum_chars++;
                }
            }

            else if (Character.toLowerCase(ch) == 'a' ||Character.toLowerCase(ch) == 'e'||Character.toLowerCase(ch) == 'i'||Character.toLowerCase(ch) == 'o'||Character.toLowerCase(ch) == 'u')
            {
                total_vowels ++;
            }
            //int char_hold = 0;
            char new_ch =  Sentence.charAt(i-1);
            if(new_ch == ch){
                Consecutive_chars++;

           }
            //char_hold++;
            //sentence analysis

        }
        System.out.printf("Total Characters: %d\n " +
                "Total Vowels: %d\n " +
                "Total Odd Number Characters: %d\n " +
                "Total digits: %d\n "+
                "Times a Character appears consecutivley: %d",total_char,total_vowels,total_oddNum_chars,total_digits,Consecutive_chars);



    }
}

