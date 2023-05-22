public class HibernationState implements State{
    @Override
    public void pressPowerButton(Computer computer) {
        System.out.println("Saindo do modo de hibernação");
        computer.setState(new OnState());
    }
}
