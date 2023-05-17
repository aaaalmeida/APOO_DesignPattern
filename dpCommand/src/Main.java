public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.executeCommand(new AddCommand(15)); // 15
        calculator.undo();
        calculator.executeCommand(new SubtractCommand(10)); // -10
        calculator.executeCommand(new DivisionCommand(2)); // -5
        calculator.undo();
        calculator.undo();

        System.out.println(calculator.valor); // 0
    }
}