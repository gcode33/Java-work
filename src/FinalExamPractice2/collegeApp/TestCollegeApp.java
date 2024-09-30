package FinalExamPractice2.collegeApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class TestCollegeApp {
    public static void main(String args[]) throws InvalidPointOnScaleExecption {

        AcademicStaff academicStaff1 = new AcademicStaff("Mary McCarthy","Tralee, Co. Kerry","085-1234567",
                "t00012345",new GregorianCalendar(1986,5,23),"fulltime","lecturer",22,
                "R212",new String[]{"Mathematics","Mechanics","Hydraulics","Final Year Project"});

        AcademicStaff academicStaff2 = new AcademicStaff("James Collins","Killarney, Co. Kerry","083-7654321",
                "t00045678",new GregorianCalendar(1972,2,11),"halftime","lecturer",13,
                "T209",new String[]{"French","German","English"});

        AcademicStaff academicStaff3 = new AcademicStaff("Sally Fletcher","Mallow, Co. Cork","087-6758393",
                "t00065432",new GregorianCalendar(1998,11,29),"prorata","researcher",1,
                "S217",new String[]{"Social Care","Psychology","Behavioural Science"});

        FinanceStaff financeStaff1 = new FinanceStaff("Kevin Ashton","Moyvane, Co. Kerry","085-5847483",
                "t00056373",new GregorianCalendar(1983,2,16),"fulltime","clerical officer",4,
                "C203",new String[]{"Accounts","Procurement"});

        FinanceStaff financeStaff2 = new FinanceStaff("Lucy Ward","Kenmare, Co. Kerry","083-1145322",
                "t00056373",new GregorianCalendar(1996,10,20),"halftime","staff officer",8,
                "C215",new String[]{"Payroll","Procurement"});


        ArrayList<Employee> allEmployees = new ArrayList<>(Arrays.asList(academicStaff1,academicStaff2,academicStaff3,financeStaff1,financeStaff2));

        int i=0;

        System.out.println("Displaying the state of all the Employee objects within the array-list\n\n");

        for (Employee employee: allEmployees) {
            System.out.println("Employee " + (i+1) + " Details\n\n" + employee + "\n\n");
            i++;
        }

        System.out.println("Trying to set the point on scale value of the first AcademicStaff object to" +
                " an \ninvalid value of zero (to demonstrate exception-handling)\n");

        try {
            academicStaff1.setPointOnScale(0);
        }
        catch(InvalidPointOnScaleExecption ex){
            System.out.println(ex.getMessage());
        }

    }
}
