public class AppointmentMain {
    public static void main(String[] args) {

        AppointmentConstructors a1 = new AppointmentConstructors();
        System.out.println(a1.toString());
        AppointmentConstructors a3 = new AppointmentConstructors("June", 30, 2023, 23, 59);
        System.out.println(a3.toString());

    }
}
