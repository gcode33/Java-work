package FinalExamPractice2.collegeApp;

public class InvalidPointOnScaleExecption extends Throwable {

    private String message;

    public InvalidPointOnScaleExecption(String message) {
        setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
