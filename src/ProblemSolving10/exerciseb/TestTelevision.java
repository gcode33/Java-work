package ProblemSolving10.exerciseb;

//TestTelevision.java
/*A driver class that contains the main() method for testing the functionality of
the Television class*/

public class TestTelevision {
    public static void main( String args[]) {

        Television tv1 = new Television("Mitsubishi Model TK3",1432563, new Dimension(1000,50,800), 250,"Plasma",850.98 );

        System.out.println("\n\nDisplaying the state of the Television object at this point\n\n" + tv1);

    }
}
