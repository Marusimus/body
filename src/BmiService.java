public class BmiService {
    double denominator;

    public int calculate(double meter, double kilogram) {
        denominator = meter * meter;
        double result = kilogram / denominator;
        return (int) result;
    }
}