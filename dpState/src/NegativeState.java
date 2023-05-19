public class NegativeState extends State {

    public NegativeState(Conta conta) {
        super(conta);
    }

    public void depositar(Double valor) {
        System.out.println("Deposito em conta com saldo negativo");
        this.conta.setSaldo(conta.getSaldo() + valor);
        System.out.printf("Valor depositado: R$ %2f\nSaldo atual: R$ %2f\n\n", valor, conta.getSaldo());
    }

    public void sacar(Double valor) {
        System.out.println("Saque em conta com saldo negativo");
        this.conta.setSaldo(conta.getSaldo() - valor);
        System.out.printf("Valor sacado: R$ %2f\nSaldo atual: R$ %2f\n\n", valor, conta.getSaldo());
    }
}