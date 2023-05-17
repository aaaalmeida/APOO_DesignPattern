public class AddCommand implements Command{
    public double valueToAdd;

    public AddCommand(double valueToAdd){
        this.valueToAdd = valueToAdd;
    }

    @Override
    public double execute(double value) {
        return value + this.valueToAdd;
    }

    @Override
    public double undo(double value) {
        return value - this.valueToAdd;
    }
}
