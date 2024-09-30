package Lab10;

import Lab9.exercise3.Book2;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {
        int[] pages;
        double[] price;
        String[] ISBN;
        String[] title;
        String output = "";


        title = new String[]{JOptionPane.showInputDialog("What is the title of the book")};
        price = new double[]{Double.parseDouble(JOptionPane.showInputDialog("please enter the price of the book"))};
        ISBN = new String[]{JOptionPane.showInputDialog("What is the ISBN of the book")};
        pages = new int[]{Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages"))};


        Book2 b1 = new Book2();

        output += "Calling the no-argument Book constructor. " +
                "The first Computer object details are: \n\n" + b1.toString();

        Book2 b2 = new Book2();
        b2.setISBN(Arrays.toString(ISBN));
        b2.setPages(pages);
        b2.setTitle(Arrays.toString(title));
        b2.setPrice(price);


        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second Book object details are: \n\n" + b2.toString();

        Book2 b3 = new Book2("The babinski code",19.99,"3452617232",348);
        output += "\n\nCalling the multi-argument Book constructor. " +
                "The second Book object details are: \n\n" + b3.toString();

        JOptionPane.showMessageDialog(null,output,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);
        displaygrid(title,price,ISBN,pages);

        System.exit(0);
    }
    private static void displaygrid(String[] title, double[] price,String[] ISBN, int[] pages) {
        JTextArea textArea = new JTextArea();
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);

        textArea.setFont(textAreaFont);

        textArea.append(String.format("%-25s%-25s%-25s%-25s\n%-25s%-25s%-25s%-25s\n",
                "Title", "Price", "ISBN", "Pages", "------", "-----", "--------", "--------"));


        for(int i = title.length-1; i >= 0; i--)
            textArea.append(String.format("%-25s%-25.2f%-25s%d",title[i],price[i], ISBN[i], pages[i]));

        JOptionPane.showMessageDialog(null,textArea,"Sorted Results",JOptionPane.INFORMATION_MESSAGE);
    }
}
