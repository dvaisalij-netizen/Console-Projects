package DoctorAppointmentSystem;

public class GeneralDoctor extends Doctor implements GeneralDoctorInterface {
        public GeneralDoctor(String appointmentId,int consultationFee,PatientInterface patient) {
            this.setAppointmentId(appointmentId);
            this.setConsultationFee(consultationFee);
            this.setPatient(patient);
        }

    }

