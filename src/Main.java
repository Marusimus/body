public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(1.85, 98);
        System.out.println("BMI-индекс= " + bmi);
    }
}
