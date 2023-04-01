import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um cliente com CPF, senha e saldos iniciais
        Cliente cliente = new Cliente("123.456.789-00", "1234", 1000.0, 500.0);

        // Cria uma conta corrente e uma conta poupança associadas ao cliente
        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);

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

        // Permite que o usuário escolha entre a conta corrente e a conta poupança
        System.out.print("Digite 1 para acessar a conta corrente ou 2 para acessar a conta poupança: ");
        int op = scanner.nextInt();
        if (op == 1) {
            // Menu da conta corrente
            boolean sair = false;
            do {
                System.out.println("\n===============================");
                System.out.println("Conta corrente");
                System.out.println("Saldo: R$ " + contaCorrente.consultarSaldo());
                System.out.println("1. Consultar extrato");
                System.out.println("2. Sacar");
                System.out.println("3. Depositar");
                System.out.println("4. Transferir para conta poupança");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Extrato: ");
                        contaCorrente.imprimirExtrato();
                        break;
                    case 2:
                        System.out.print("Digite o valor a ser sacado: ");
                        double valor = scanner.nextDouble();
                        boolean saqueEfetuado = contaCorrente.sacar(valor);
                        if (saqueEfetuado) {
                            System.out.println("Saque efetuado com sucesso.");
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        break;
                    case 3:
                        System.out.print("Digite o valor a ser depositado: ");
                        valor = scanner.nextDouble();
                        contaCorrente.depositar(valor);
                        System.out.println("Depósito efetuado com sucesso.");
                        break;
                    case 4:
                        System.out.print("Digite o valor a ser transferido para a conta poupança: ");
                        valor = scanner.nextDouble();
                        boolean transferenciaEfetuada = contaCorrente.transferir(valor, contaPoupanca);
                        if (transferenciaEfetuada) {
                            System.out.println("Transferência efetuada com sucesso.");
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        break;
                    case 5:
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }