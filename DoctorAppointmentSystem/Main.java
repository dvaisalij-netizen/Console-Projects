package DoctorAppointmentSystem;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PatientInterface patient1=new Patient();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the symptoms:");
        String inputSymptoms=scanner.nextLine();
        patient1.setSymptoms(inputSymptoms);
        System.out.println("Enter the doctorType:");
        String inputDoctorType=scanner.nextLine();
        patient1.setDoctorType(inputDoctorType);

        PatientInterface patient2=new Patient();
        System.out.println("Enter the symptoms:");
        String symptoms=scanner.nextLine();
        patient2.setSymptoms(symptoms);
        System.out.println("Enter the doctorType:");
        String doctorType=scanner.nextLine();
        //get input from terminal and stored in the variable
        patient2.setDoctorType(doctorType);


        if(patient1.getDoctorType()=="SD"){
            System.out.println("===========patient1===============");
            SpecialistDoctorInterface specialistDoctor=new SpecialistDoctor("AJ123",500,patient1);//Hard code
            patient1.setSpecialistDoctor(specialistDoctor);
            specialistDoctor.bookAppointment();
            System.out.println("AppointmentId");
            System.out.println(patient1.getSpecialistDoctor().getAppointmentId());
            System.out.println("Fee");
            System.out.println(patient1.getSpecialistDoctor().getConsultationFee());
        }
        else{
            System.out.println("===========patient1===============");
            GeneralDoctorInterface generalDoctor=new GeneralDoctor("MA123",1000,patient1);
            patient1.setGeneralDoctor(generalDoctor);
            generalDoctor.bookAppointment();
            System.out.println("AppointmentId");
            System.out.println(patient1.getGeneralDoctor().getAppointmentId());
            System.out.println("Fee");
            System.out.println(patient1.getGeneralDoctor().getConsultationFee());
        }
        if(patient2.getDoctorType()=="SD"){
            System.out.println("===========patient2===============");
            SpecialistDoctorInterface specialistDoctor=new SpecialistDoctor("A123",500,patient2);
            patient2.setSpecialistDoctor(specialistDoctor);
            specialistDoctor.bookAppointment();
            System.out.println("AppointmentId");
            System.out.println(patient2.getSpecialistDoctor().getAppointmentId());
            System.out.println("Fee");
            System.out.println(patient2.getSpecialistDoctor().getConsultationFee());
        }
        else{
            System.out.println("===========patient2===============");
            GeneralDoctorInterface generalDoctor=new GeneralDoctor("D123",1000,patient2);
            patient2.setGeneralDoctor(generalDoctor);
            generalDoctor.bookAppointment();
            System.out.println("AppointmentId");
            System.out.println(patient2.getGeneralDoctor().getAppointmentId());
            System.out.println("Fee");
            System.out.println(patient1.getGeneralDoctor().getConsultationFee());
        }

    }
}