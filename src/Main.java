public class Main {
    public static void main(String[] args) {
     Doctor doctor = new NurseDecorator(new DoctorDecorator(new HeadDoctor()));
        System.out.println(doctor.makeJob());
    }
}
