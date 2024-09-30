package Problem_solving_1;
import java.util.Scanner;
public class ExerciseA {
    public static void main(String[]args){
        double height;
        int age;
        String name;

        Scanner input = new Scanner(System.in);

        System.out.print("please enter the name of the president: ");
        name = input.nextLine();

        System.out.print("please enter the height of the president: ");
        height = input.nextDouble();

        System.out.print("Please enter the age of the president: ");
        age = input.nextInt();

        System.out.println("\n\n\n\t\t\t*****************\n"+
                "\t\t\tPresident Details\n"+
                "\t\t\t****************");

        System.out.printf("Name: %s\nHeight: %.1f\nAge: %d",name,height,age);

    }
}
