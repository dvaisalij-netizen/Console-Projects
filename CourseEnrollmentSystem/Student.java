package CourseEnrollmentSystem;

public class Student implements StudentInterface{
    private int duration;
    private String courseType;
    private OnlineCourseInterface onlineCourse;
    private OfflineCourseInterface offlineCourse;
    public Student(int duration,String courseType){
        this.duration=duration;
        this.courseType=courseType;
    }
    public Student(){
        // constructor overloading
    }

    public int getDuration() {

        return duration;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }

    public String getCourseType() {

        return courseType;
    }

    public void setCourseType(String courseType) {

        this.courseType = courseType;
    }


    public OnlineCourseInterface getOnlineCourse() {
        return onlineCourse;
    }

    public void setOnlineCourse(OnlineCourseInterface onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    public OfflineCourseInterface getOfflineCourse() {
        return offlineCourse;
    }

    public void setOfflineCourse(OfflineCourseInterface offlineCourse) {
        this.offlineCourse = offlineCourse;
    }
}