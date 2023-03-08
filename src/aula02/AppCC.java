public class AppCC {

    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente("Messi R. Batista");

        cc1.depositar(1000);
        cc1.sacar(205.78);
        cc1.depositar(1560.94);

        System.out.println("Titular: " + cc1.getTitular());
        System.out.println("Saldo: " + cc1.verificarSaldo());


    }

}
