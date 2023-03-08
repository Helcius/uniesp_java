import java.util.Scanner;

// Declaração da classe principal AppCC
public class AppCC {
    // Declaração da classe principal AppCC
    public static void main(String[] args) {
        // Cria uma nova instância da classe Scanner para receber entradas do usuário
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário que informe o nome do titular da conta
        System.out.print("Informe o nome do titular da conta: ");
        // Lê a linha digitada pelo usuário e armazena na variável 'titular'
        String titular = scanner.nextLine();
        // Cria uma nova instância da classe ContaCorrente, passando o nome do titular como argumento.
        ContaCorrente conta = new ContaCorrente(titular);

        // Solicita ao usuário que informe o valor a ser depositado
        System.out.print("Informe o valor a ser depositado: ");
        // Lê o valor digitado pelo usuário e armazena na variável 'valorDeposito'
        double valorDeposito = scanner.nextDouble();
        // Chama o método 'depositar' da instância 'conta' da classe ContaCorrente, passando o valor do depósito como argumento
        conta.depositar(valorDeposito);

        // Solicita ao usuário que informe o valor a ser sacado
        System.out.print("Informe o valor a ser sacado: ");
        // Lê o valor digitado pelo usuário e armazena na variável 'valorSaque'
        double valorSaque = scanner.nextDouble();
        // Lê o valor digitado pelo usuário e armazena na variável 'valorSaque'
        conta.sacar(valorSaque);
    }
}
