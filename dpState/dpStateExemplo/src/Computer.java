public class Computer {
    State state;

    public Computer() {
        this.state = new OffState();
    }

    public void PressPowerButton() {
        state.pressPowerButton(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
