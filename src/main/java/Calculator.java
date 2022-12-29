public class Calculator {
    public int add(int x1, int x2) {
        return x1 + x2;
    }

    public int multiply(int x1, int x2) {
        return x1 * x2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result != 60) {
            System.out.println("Bad result: " + result);
        }
    }
}