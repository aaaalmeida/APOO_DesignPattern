public class BlockedState extends State {

    public BlockedState(Conta conta) {
        super(conta);
    }

    public void depositar(Double valor) {
        System.out.println("Deposito em conta bloqueada");
        this.conta.setSaldo(conta.getSaldo() + valor);
        System.out.printf("Valor depositado: R$ %2f\nSaldo atual: R$ %2f\n\n", valor, conta.getSaldo());
    }

    public void sacar(Double valor) {
        System.out.println("Conta bloqueada, impossivel realizar saque\n");
    }
}