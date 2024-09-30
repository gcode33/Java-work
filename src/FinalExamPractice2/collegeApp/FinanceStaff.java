package FinalExamPractice2.collegeApp;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class FinanceStaff  extends Employee implements Payable{
    private String[] duties;




    public FinanceStaff(String name, String address, String mobileNumber, String Tnumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] duties) throws InvalidPointOnScaleExecption {
        super(name, address, mobileNumber, Tnumber, dateOfBirth, workPattern, role, pointOnScale, office);
        setDuties(duties);
    }

    public String[] getDuties() {
        return duties;
    }

    public void setDuties(String[] duties) {
        this.duties = duties;
    }

    @Override
    public String toString() {
        return "FinanceStaff{" +
                "duties=" + Arrays.toString(duties) +"name"+getName()+
                "Address"+getAddress()+"number"+getMobileNumber()+
                "Tnumber"+getTnumber()+
                "date of birth"+getDateOfBirth()+"work pattern"+getWorkPattern()+
                "role"+getRole()+"point of scale"+getPointOnScale()+
                "office"+getOffice()+
                '}';
    }
}
