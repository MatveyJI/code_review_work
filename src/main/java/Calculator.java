public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return b != 0 ? a / b : 0;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int sum = add(5, 5);
        int product = times(sum, 2);
        int division = div(10, 2);
        return dif(product, division);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Результат solver: " + calculator.solver());
    }
}
