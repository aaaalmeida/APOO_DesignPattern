public class OnState implements State{
    @Override
    public void pressPowerButton(Computer computer) {
        System.out.println("Computador ja esta ligado, mudando para modo hibernação");
        computer.setState(new HibernationState());
    }
}
