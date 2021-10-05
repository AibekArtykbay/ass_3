public class NurseDecorator implements Doctor{

    private Doctor doctor;

    public NurseDecorator(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String makeJob() {
        return doctor.makeJob();
    }
}
