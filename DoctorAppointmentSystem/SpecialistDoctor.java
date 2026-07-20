package DoctorAppointmentSystem;

public class SpecialistDoctor extends Doctor implements SpecialistDoctorInterface {
        public SpecialistDoctor(String appointmentId,int consultationFee,PatientInterface patient) {
            this.setAppointmentId(appointmentId);
            this.setConsultationFee(consultationFee);
            this.setPatient(patient);
        }
    }

