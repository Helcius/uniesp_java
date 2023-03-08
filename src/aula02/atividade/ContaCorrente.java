// Declaração da classe ContaCorrente
public class ContaCorrente {
    // Declaração das propriedades privadas da conta
    private String titular;
    private double saldo;

    // Construtor da classe que recebe o nome do titular como argumento
    public ContaCorrente(String titular) {
        // Define o nome do titular como o valor fornecido e o saldo inicial como 0
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        // Adiciona o valor fornecido ao saldo da conta
        this.saldo += valor;
        // Imprime uma mensagem informando que o depósito foi realizado e o saldo atual
        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R" + this.saldo);
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        // Verifica se o saldo atual é menor que o valor solicitado para saque
        if (this.saldo < valor) {
            // Se for, imprime uma mensagem informando que o saldo é insuficiente
            System.out.println("Saldo insuficiente. Peça um empréstimo!");
        } else {
            // Caso contrário, subtrai o valor solicitado do saldo atual da conta
            this.saldo -= valor;
            // Imprime uma mensagem informando que o saque foi realizado e o saldo atual
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + this.saldo);
        }
    }

    // Métodos para acessar e definir o nome do titular da conta
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    // Método para acessar o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }
}
