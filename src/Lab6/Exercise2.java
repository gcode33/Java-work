package Lab6;

import javax.swing.*;

public class Exercise2 {
    public static void main(String[]args){
        String email, allValidEmails="", prompt;

        for(int i = 1; i <= 5; i++) {
            email = JOptionPane.showInputDialog("Loop " + i + " - Please enter an email value");

            prompt = email_add(email);

            while(!prompt.equals("valid email address")) {

                email = JOptionPane.showInputDialog(prompt);
                prompt = email_add(email);
            }

            allValidEmails += email + "\n";
        }

        JOptionPane.showMessageDialog(null,"The list of valid emails entered is: \n\n" + allValidEmails, "Valid Emails",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static String email_add(String email){
        if(email.length() < 7 || email.length() > 322){
            return "This is an invalid email as it is to short or too long";
        }
        int contains = email.indexOf("@");
        if(contains == -1){
            return"invalid email there is no @";
        }
        if(!email.endsWith(".com")&& !email.endsWith(".org") && !email.endsWith(".ie") && !email.endsWith(".net")){
            return "invalid email as it doesnt end with .org .com .ie or .net ";
        }
        String recipiant = email.substring(0, contains);
        if(recipiant.length() < 1 || recipiant.length() > 64){
            return "the email is invalid as the recipiant name is less than 1 or greater that 64 characters";
        }
        char ch;
        for(int i = 0; i < recipiant.length(); i++){
            ch = recipiant.charAt(i);
            if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '.' && ch != '_' && ch!='-' ){
                return "The email is invalid because your recipiant name doesnt have letters or digitis or any acceptable special characters which are ., -, _";
            }
        }
        String domain_name = email.substring(contains+1, email.length()-4);
        if(domain_name.length() <2 || domain_name.length() >252 ){
            return "invalid email the domain name is either less than 2 characters or greater than 252 characters";
        }
        for(int j = 0; j < domain_name.length(); j++){
            ch = recipiant.charAt(j);
            if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '.' && ch != '_' && ch!='-' ){
                return "The email is invalid because your domain name doesnt have letters or digitis or any acceptable special characters which are ., -, _";
            }
        }

        return "valid email address";
    }
}
