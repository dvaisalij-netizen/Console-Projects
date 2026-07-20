package DoctorAppointmentSystem;

public class Doctor implements DoctorInterface {
    private String appointmentId;
    private int consultationFee;
    //private String symptoms;
    private PatientInterface patient;

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }
    public void bookAppointment() {
        System.out.println("Appointment Booked for:");
        System.out.println(patient.getSymptoms());
        System.out.println("consultationFee");
        System.out.println(consultationFee);
    }

    public PatientInterface getPatient() {
        return patient;
    }

    public void setPatient(PatientInterface patient) {
        this.patient = patient;
    }
}