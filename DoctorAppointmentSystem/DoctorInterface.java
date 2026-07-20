package DoctorAppointmentSystem;

public interface DoctorInterface {
                public String getAppointmentId();
                public void setAppointmentId(String appointmentId);
                public int getConsultationFee();
                public void setConsultationFee(int consultationFee);
                public void bookAppointment();
                public PatientInterface getPatient();
                public void setPatient(PatientInterface patient);
        }


