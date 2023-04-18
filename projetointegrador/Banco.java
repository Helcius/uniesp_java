import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um cliente com CPF, senha e saldo iniciais
        Cliente cliente = new Cliente("15101400424", "1234", 1000.0);

        // Realiza um investimento com o saldo do cliente
        cliente.investir(100, 12);

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

        // Realiza um saque da conta corrente
        boolean saqueEfetuado = false;
        while (!saqueEfetuado) {
            System.out.print("Digite o valor do saque: ");
            double valor = scanner.nextDouble();
            if (contaCorrente.sacar(valor)) {
                System.out.println("Saque efetuado com sucesso. Novo saldo: " + contaCorrente.consultarSaldo());
                saqueEfetuado = true;
            } else {
                System.out.println("Saldo insuficiente para o saque. Digite um valor válido.");
            }
        }

        // Realiza um depósito na conta corrente
        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();
        contaCorrente.depositar(valorDeposito);
        System.out.println("Depósito efetuado com sucesso. Novo saldo: " + contaCorrente.consultarSaldo());

        // Realiza uma transferência da conta corrente para a conta poupança
        System.out.print("Digite o valor da transferência da conta corrente para a conta poupança: ");
        double valorTransferencia = scanner.nextDouble();
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
        while (!contaCorrente.transferir(valorTransferencia, contaPoupanca)) {
            System.out.println("Saldo insuficiente na conta corrente para a transferência.");
            System.out.print("Digite um valor válido: ");
            valorTransferencia = scanner.nextDouble();
        }
        System.out.println("Transferência efetuada com sucesso. Novo saldo na conta corrente: " + contaCorrente.consultarSaldo() + ". Novo saldo na poupança: " + contaPoupanca.getSaldo());

        // Realiza um saque na conta poupança
        System.out.print("Digite o valor do saque na conta poupança: ");
        double valorSaquePoupanca = scanner.nextDouble();
        if (contaPoupanca.sacar(valorSaquePoupanca)) {
            System.out.println("Saque efetuado com sucesso. Novo saldo na poupança: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Saldo insuficiente na poupança para o saque.");
        }
    }

}
