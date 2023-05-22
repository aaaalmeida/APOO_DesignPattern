public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.getState().depositar(new Double(200)); // saldo positivo  200
        conta.getState().sacar(new Double(300)); // saldo negativo  -100
        conta.getState().sacar(new Double(1000)); // bloqueado  -1100
        conta.getState().sacar(new Double(100)); // impossivel realizar -1100
        conta.getState().depositar(new Double(200)); // saldo negativo  -900
        conta.getState().depositar(new Double(1000)); // saldo positivo -100
    }
}