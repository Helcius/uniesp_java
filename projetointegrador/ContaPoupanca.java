public class ContaPoupanca {
    private Cliente cliente;
    private double saldo;

    public ContaPoupanca(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}