package CourseEnrollmentSystem;

import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentInterface student1=new Student(30,"online");//know constructor
        StudentInterface student2=new Student();//empty constructor
        //Getting input from terminal
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Duration:");
        BigInteger input=new BigInteger(scanner.nextLine());
        System.out.println("Enter the Course type:");
        String inputType=scanner.nextLine();
        student2.setDuration(input.intValue());
        student2.setCourseType(inputType);

        if(student1.getCourseType()=="online"){
            System.out.println("========STUDENT1==============");
            OnlineCourseInterface onlineCourse=new OnlineCourse("VA2",500,student1);//Know constructor
            student1.setOnlineCourse(onlineCourse);
            onlineCourse.enroll();
            System.out.println(student1.getOnlineCourse().getCourseId());
            System.out.println(student1.getOnlineCourse().getFee());
        }
        else{
            System.out.println("========STUDENT1==============");
            OfflineCourseInterface offlineCourse=new OfflineCourse("VN23",1000,student1);
            student1.setOfflineCourse(offlineCourse);
            offlineCourse.enroll();
            System.out.println(student1.getOfflineCourse().getCourseId());
            System.out.println(student1.getOfflineCourse().getFee());
        }
        if(student2.getCourseType()=="online"){
            System.out.println("========STUDENT2==============");
            OnlineCourseInterface onlineCourse=new OnlineCourse("NK4",500,student2);//Know constructor
            student2.setOnlineCourse(onlineCourse);
            onlineCourse.enroll();
            System.out.println(student2.getOnlineCourse().getCourseId());
            System.out.println(student2.getOnlineCourse().getFee());
        }
        else{
            System.out.println("========STUDENT2==============");
            OfflineCourseInterface offlineCourse=new OfflineCourse("N348",1000,student2);
            student2.setOfflineCourse(offlineCourse);
            offlineCourse.enroll();
            System.out.println(student2.getOfflineCourse().getCourseId());
            System.out.println(student2.getOfflineCourse().getFee());
        }

    }
}