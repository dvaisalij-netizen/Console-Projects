package CourseEnrollmentSystem;

public class OnlineCourse extends Course implements OnlineCourseInterface{
    public OnlineCourse(String courseId,int fee,StudentInterface student){
        this.setCourseId(courseId);
        this.setFee(fee);
        this.setStudent(student);
    }
    public OnlineCourse(){

    }
}