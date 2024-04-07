package ListaExercíciosPOO.Q1_2.B;

import ListaExercíciosPOO.Q1_2.B.ContaPoupança;

public class ProgramaContaPoupança {
    public static void main(String[] args) {
        ContaPoupança conta1 = new ContaPoupança();
        ContaPoupança conta2 = new ContaPoupança();

        conta1.Cadastro("fulaninho rico", 123456789, 1238901, 1100.12, 58, "9");
        conta2.Cadastro("ciclaninho pobre", 987654321, 1354321, 12.31, 21, "2");

        System.out.println("Listando dados da conta 1: ");
        conta1.imprimirSaldo();

        System.out.println("Listando dados da conta 2: ");
        conta2.imprimirSaldo();

        conta1.Alterar("fulaninho rico", 123456789, 1234578901, 91900.00, 58, "0");
        conta2.Alterar("ciclaninho pobre", 987654321, 1097654321, 14.32, 21, "1");

        System.out.println("Listando dados da conta 1 depois de editada: ");
        conta1.imprimirSaldo();

        System.out.println("Listando dados da conta 2 depois de editada: ");
        conta2.imprimirSaldo();
    }
}
