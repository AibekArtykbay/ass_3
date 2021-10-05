public class HeadDoctor extends NurseDecorator{

    public HeadDoctor(Doctor doctor) {
        super(doctor);
    }
    String managetheHospital(){
        return "manage the hospital";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+managetheHospital();
    }
}
