import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um cliente com CPF, senha e saldo iniciais
        Cliente cliente = new Cliente("123.456.789-00", "1234", 1000.0);

        // Cria uma conta corrente associada ao cliente
        ContaCorrente contaCorrente = new ContaCorrente(cliente);

        // Realiza o login do cliente
        boolean loginEfetuado = false;
        do {
            System.out.print("Digite seu CPF: ");
            String cpf = scanner.next();
            System.out.print("Digite sua senha: ");
            String senha = scanner.next();

            if (cpf.equals(cliente.getCpf()) && senha.equals(cliente.getSenha())) {
                loginEfetuado = true;
                System.out.println("Login efetuado com sucesso!");
            } else {
                System.out.println("CPF ou senha incorretos. Tente novamente.");
            }
        } while (!loginEfetuado);

        // Permite que o usuário escolha entre saque e depósito
        System.out.print("Digite 1 para sacar ou 2 para depositar: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            // Realiza um saque da conta corrente
            System.out.print("Digite o valor do saque: ");
            double valor = scanner.nextDouble();
            if (contaCorrente.sacar(valor)) {
                System.out.println("Saque efetuado com sucesso. Novo saldo: " + contaCorrente.consultarSaldo());
            } else {
                System.out.println("Saldo insuficiente para o saque.");
            }
        } else if (opcao == 2) {
            // Realiza um depósito na conta corrente
            System.out.print("Digite o valor do depósito: ");
            double valor = scanner.nextDouble();
            contaCorrente.depositar(valor);
            System.out.println("Depósito efetuado com sucesso. Novo saldo: " + contaCorrente.consultarSaldo());
        } else {
            System.out.println("Opção inválida.");
        }
    }
}