public class DoctorDecorator extends NurseDecorator {

    public DoctorDecorator(Doctor doctor) {
        super(doctor);
    }
    String doestheOperation(){
        return "make operation";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+doestheOperation();
    }
}
