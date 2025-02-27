public class BmiService {
    public int calculate(double meter, double kilogram) {
        double result = kilogram / Math.pow(meter, 2);
        return (int) result;
    }
}
