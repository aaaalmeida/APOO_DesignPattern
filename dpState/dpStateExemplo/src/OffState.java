public class OffState implements State{
    @Override
    public void pressPowerButton(Computer computer) {
        System.out.println("Ligando o computador");
        computer.setState(new OnState());
    }
}
