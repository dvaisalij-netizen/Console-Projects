package CourseEnrollmentSystem;

public class OfflineCourse extends Course implements OfflineCourseInterface {
    public OfflineCourse(String courseId,int fee,StudentInterface student){
        this.setCourseId(courseId);
        this.setFee(fee);
        this.setStudent(student);
    }
    public OfflineCourse(){

    }

}