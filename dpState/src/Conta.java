public class Conta {
    private Double saldo;
    private State state;

    public Conta() {
        this.saldo = new Double(0);
        this.state = new PositiveState(this);
    }

    public State getState() {
        return this.state;
    }
    private void changeState(State state) {
        this.state = state;
    }

    private void consultState() {
        if(saldo >= 0)
            changeState(new PositiveState(this));
        else if (saldo >= -1000)
            changeState(new NegativeState(this));
        
        
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
        consultState();
    }
}
