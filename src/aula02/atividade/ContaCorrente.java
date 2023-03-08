public class ContaCorrente {
    private String nome;
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            throw new RuntimeException("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
