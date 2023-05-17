public class SubtractCommand implements Command{
    public double valueToSubtract;

    public SubtractCommand(double valueToSubtract) {
        this.valueToSubtract = valueToSubtract;
    }

    @Override
    public double execute(double value) {
        return value - this.valueToSubtract;
    }

    @Override
    public double undo(double value) {
        return value + this.valueToSubtract;
    }
}
