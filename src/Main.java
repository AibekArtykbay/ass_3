public class Main {
    public static void main(String[] args) {
     Doctor doctor = new HeadDoctor(new DoctorDecorator(new Paramedic()));
        System.out.println(doctor.makeJob());
    }
}
