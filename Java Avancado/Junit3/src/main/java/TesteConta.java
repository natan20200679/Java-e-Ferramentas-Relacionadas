public class TesteConta {

    public static void main(String[] args) {

        //        Depositar com Conta Ativa
        Conta conta = new Conta();
        conta.ativar();
        conta.depositar(100.00);
        System.out.println("\nDeve Depositar com Conta Ativa");
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println();

//        Depositar com Conta Inativa
        Conta conta1 = new Conta();
        conta.inativar();
        conta.depositar(100.00);
        System.out.println("Não Deve Depositar com Conta Inativa");
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
