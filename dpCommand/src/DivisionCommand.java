public class DivisionCommand implements Command{
    public double valueToDivision;

    public DivisionCommand(double valueToDivision) {
        this.valueToDivision = valueToDivision;
    }

    @Override
    public double execute(double value) {
        return value / this.valueToDivision;
    }

    @Override
    public double undo(double value) {
        return value * this.valueToDivision;
    }
}
