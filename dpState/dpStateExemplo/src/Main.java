public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.PressPowerButton();    // inicia desligado
        computer.PressPowerButton();    // ligado
        computer.PressPowerButton();    // hibernando
    }
}