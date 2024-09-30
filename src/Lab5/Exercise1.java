package Lab5;

public class Exercise1 {
    public static void main(String[]args){
        float a1 = 2.44F;
        float b2 = 2.333F;

        mini(a1,b2);
    }
    public static float mini(float a, float b){

        //(i) How many arguments does this method take?: it takes two arguments which are the floats
        //(ii) What are the types of argument expected by this method?: floats
        //(iii) What is the purpose of this method?: to find the minimum value of the two floats
        //(iv) What is the type of value returned by this method?: floats so decimal numbers like .222
        //(v) Give a line of code using a println() that demonstrates the correct use of this method.
        System.out.printf("the value of the floats are %.2f, %.2f",a, b);
        return a;

    }
}
