public interface Command {
    public double execute(double value);
    public double undo(double value);
}
