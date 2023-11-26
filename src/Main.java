public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massKg = 98;
        double heightMeters = 1.87;
        int bmi = service.calculate(massKg, heightMeters);
        System.out.println("bmi-индекс " + bmi);
    }
}
