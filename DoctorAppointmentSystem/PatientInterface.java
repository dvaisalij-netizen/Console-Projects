package DoctorAppointmentSystem;

public interface PatientInterface {
        public String getSymptoms();
        public void setSymptoms(String symptoms);
        public String getDoctorType();
        public void setDoctorType(String doctorType);
        public SpecialistDoctorInterface getSpecialistDoctor();
        public void setSpecialistDoctor(SpecialistDoctorInterface specialistDoctor);
        public GeneralDoctorInterface getGeneralDoctor();
        public void setGeneralDoctor(GeneralDoctorInterface generalDoctor);
    }

