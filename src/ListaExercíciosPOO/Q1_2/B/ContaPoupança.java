package ListaExercíciosPOO.Q1_2.B;

public class ContaPoupança {
    private String nomeCorrentista;
    private String agencia;
    private int rg;
    private int cpf;
    private int num;
    private double saldo;

    public void Cadastro(String nomeCorrentista, int rg, int cpf, double saldo, int numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.num = num;
        this.agencia = agencia;
        System.out.println("Conta cadastrada!");
    }
    public void Alterar(String nomeCorrentista, int rg, int cpf, double saldo, int numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.num = num;
        this.agencia = agencia;
        System.out.println("Conta editada!");
    }
    public void imprimirSaldo() {
        System.out.println("Saldo do correntista " + nomeCorrentista + ": R$" + saldo);
    }
}