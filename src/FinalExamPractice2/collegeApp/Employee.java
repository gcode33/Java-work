package FinalExamPractice2.collegeApp;

import java.util.GregorianCalendar;

public abstract class Employee {
    private String name;
    private String address;
    private String mobileNumber;
    private String Tnumber;
    private GregorianCalendar dateOfBirth;
    private String workPattern;
    private String role;
    private int pointOnScale;
    private String office;

    public Employee(String name, String address, String mobileNumber, String Tnumber, GregorianCalendar dateOfBirth, String workPattern, String role, int pointOnScale, String office) throws InvalidPointOnScaleExecption {
        setName(name);
        setAddress(address);
        setMobileNumber(mobileNumber);
        setTnumber(Tnumber);
        setDateOfBirth(dateOfBirth);
        setWorkPattern(workPattern);
        setRole(role);
        setPointOnScale(pointOnScale);
        setOffice(office);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getTnumber() {
        return Tnumber;
    }

    public void setTnumber(String tnumber) {
        Tnumber = tnumber;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getWorkPattern() {
        return workPattern;
    }

    public void setWorkPattern(String workPattern) {
        this.workPattern = workPattern;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPointOnScale() {
        return pointOnScale;
    }

    public void setPointOnScale(int pointOnScale) throws InvalidPointOnScaleExecption {
        if (pointOnScale >= 1 && pointOnScale <= Payable.POINTS_ON_SCALE)
            this.pointOnScale = pointOnScale;
        else
        {
            throw new InvalidPointOnScaleExecption("Invalid Data enterd for point on scale");
        }
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", mobileNumber='" + getMobileNumber() + '\'' +
                "TNumber"+getTnumber()+
                ", dateOfBirth=" + getDateOfBirth() +
                ", workPattern='" + getWorkPattern() + '\'' +
                ", role='" + getRole() + '\'' +
                ", pointOnScale=" + getPointOnScale() +
                ", office='" + getOffice() + '\'' +
                '}';
    }
}
