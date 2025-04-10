public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("Addition : " + calc.addition(a, b));
        System.out.println("Subtraction : " + calc.subtraction(a, b));
        System.out.println("Multiplication : " + calc.multiplication(a, b));
        System.out.println("Division : " + calc.division(a, b));
    }
}