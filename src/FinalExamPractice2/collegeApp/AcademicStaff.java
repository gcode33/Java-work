package FinalExamPractice2.collegeApp;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class AcademicStaff extends Employee implements Payable{
    private String[] coursesTaught;



    public AcademicStaff(String name, String address, String mobileNumber, String Tnumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office, String[] coursesTaught) throws InvalidPointOnScaleExecption {
        super(name, address, mobileNumber, Tnumber, dateOfBirth, workPattern, role, pointOnScale, office);
        setCoursesTaught(coursesTaught);
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
    public double calculateEarnings(){
        if(getWorkPattern().equals("prorata"))
            return 100000/740 * (1 + getPointOnScale()/POINTS_ON_SCALE);
        else
            return calculateEarnings(getPointOnScale(), getWorkPattern());
    }

    @Override
    public String toString() {
        return "AcademicStaff{" +
                "coursesTaught=" + Arrays.toString(coursesTaught) +
                "Earnings"+calculateEarnings()+"name"+getName()+
                "Address"+getAddress()+"number"+getMobileNumber()+
                "Tnumber"+getTnumber()+
                "date of birth"+getDateOfBirth()+"work pattern"+getWorkPattern()+
                "role"+getRole()+"point of scale"+getPointOnScale()+
                "office"+getOffice()+
                '}';
    }
}
