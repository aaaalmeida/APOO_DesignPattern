import java.util.Stack;

public class Calculator {
    public double valor;
    public Stack<Command> history;
    private static int cont = 0; // opcional, serve para a contagem de comandos usados

    public Calculator() {
        this.history = new Stack<Command>();
        this.valor = 0;
    }

    public void executeCommand(Command command) {
        cont++;
        this.valor = command.execute(valor);
        System.out.println(cont + ": " + valor);
        history.push(command);
    }

    public void undo() {
        Command command = history.pop();
        this.valor = command.undo(this.valor);
    }
}
