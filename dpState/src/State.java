public abstract class State{
    protected Conta conta;
    public State(Conta conta) {
        this.conta = conta;
    }
    public abstract void depositar(Double valor);
    public abstract void sacar(Double valor);
}