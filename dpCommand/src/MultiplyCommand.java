public class MultiplyCommand implements Command{
    public double valueToMultiply;

    public MultiplyCommand(double valueToMultiply) {
        this.valueToMultiply = valueToMultiply;
    }

    @Override
    public double execute(double value) {
        return value * this.valueToMultiply;
    }

    @Override
    public double undo(double value) {
        return value / this.valueToMultiply;
    }
}
