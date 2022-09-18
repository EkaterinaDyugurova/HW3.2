public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmi = service.calculate(60, 1.63);
        System.out.println(myBmi);


    }
}
