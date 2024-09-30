package FinalExamPractice2.collegeApp;

public interface Payable {
    public final static int POINTS_ON_SCALE=25;

    public default double calculateEarnings(int POINTS_ON_SCALE, String workPattern){
        if(workPattern == "fulltime"){
            return  35000+ (65000 * POINTS_ON_SCALE) /(POINTS_ON_SCALE);
        } else if (workPattern == "parttime") {
            return  17500+ (65000 * POINTS_ON_SCALE) /(POINTS_ON_SCALE*2);
        }
        else{
            return 0;
        }
    }
}
