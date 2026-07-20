package DoctorAppointmentSystem;

public class Patient implements PatientInterface {
        private String symptoms;
        private String doctorType;

        private SpecialistDoctorInterface specialistDoctor;
        private GeneralDoctorInterface generalDoctor;

        public Patient(){

        }
        public String getSymptoms() {
            return symptoms;
        }

        public void setSymptoms(String symptoms) {
            this.symptoms = symptoms;
        }

        public String getDoctorType() {
            return doctorType;
        }

        public void setDoctorType(String doctorType) {
            this.doctorType = doctorType;
        }

        public SpecialistDoctorInterface getSpecialistDoctor() {
            return specialistDoctor;
        }

        public void setSpecialistDoctor(SpecialistDoctorInterface specialistDoctor) {
            this.specialistDoctor = specialistDoctor;
        }

        public GeneralDoctorInterface getGeneralDoctor() {
            return generalDoctor;
        }

        public void setGeneralDoctor(GeneralDoctorInterface generalDoctor) {
            this.generalDoctor = generalDoctor;
        }
    }

