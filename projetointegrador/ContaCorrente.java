public class ContaCorrente {
    private Cliente cliente;
    private double saldo;

    public ContaCorrente(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}