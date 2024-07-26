public class TestaContaComComparacao {

    public static void main(String[] args) {

        //        Depositar com Conta Ativa
        Conta conta = new Conta();
        conta.ativar();
        conta.depositar(100.00);
        System.out.println("\nDeve Depositar com Conta Ativa");
        System.out.println("Saldo: " + conta.getSaldo());
        if (conta.getSaldo() == 100.00) {
            System.out.println("Funcionou!");
        } else {
            System.out.println("Falhou!");
        }
        System.out.println();

//        Depositar com Conta Inativa
        Conta conta1 = new Conta();
        conta.inativar();
        conta.depositar(100.00);
        System.out.println("\nNão Deve Depositar com Conta Inativa");
        System.out.println("Saldo: " + conta.getSaldo());
        if (conta.getSaldo() == 0.00) {
            System.out.println("Funcionou!");
        } else {
            System.out.println("Falhou!");
        }
    }
}
