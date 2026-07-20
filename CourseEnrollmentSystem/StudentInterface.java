package CourseEnrollmentSystem;

public interface StudentInterface {
        public int getDuration();
        public void setDuration(int duration);
        public String getCourseType();
        public void setCourseType(String courseType);
        public OnlineCourseInterface getOnlineCourse();
        public void setOnlineCourse(OnlineCourseInterface onlineCourse);
        public OfflineCourseInterface getOfflineCourse();
        public void setOfflineCourse(OfflineCourseInterface offlineCourse);
}