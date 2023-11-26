public class BmiService {
    public int calculate(double massKg, double heightMeters){
        int bmi;
        bmi = (int)(massKg/(heightMeters * heightMeters));
        return bmi;
    }
}
