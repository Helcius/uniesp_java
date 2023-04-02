public class ContaCorrente {
    private Cliente cliente;

    public ContaCorrente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean sacar(double valor) {
        if (valor > cliente.getSaldo()) {
            return false;
        } else {
            double novoSaldo = cliente.getSaldo() - valor;
            cliente.setSaldo(novoSaldo);
            return true;
        }
    }

    public double consultarSaldo() {
        return cliente.getSaldo();
    }

    public void depositar(double valor) {
        double novoSaldo = cliente.getSaldo() + valor;
        cliente.setSaldo(novoSaldo);
        System.out.println("Depósito efetuado com sucesso. Novo saldo: " + novoSaldo);
    }

    public boolean transferir(double valor, ContaPoupanca contaPoupanca) {
        if (valor > cliente.getSaldo()) {
            System.out.println("Saldo insuficiente para a transferência.");
            return false;
        } else {
            cliente.setSaldo(cliente.getSaldo() - valor);
            contaPoupanca.depositar(valor);
            System.out.println("Transferência efetuada com sucesso. Novo saldo na conta corrente: " + cliente.getSaldo());
            return true;
        }
    }
}