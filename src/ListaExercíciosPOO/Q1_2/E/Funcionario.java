package ListaExercíciosPOO.Q1_2.E;

public class Funcionario {
    private String nome, datanascimento, rg, cpf, endereco, naturalidade, profissao, grau;
    private int matricula;
    private double salario;

    public void Cadastro(String nome, String datanascimento, String rg, String cpf, String endereco, String naturalidade,
                         double salario, String profissao, String grau, int matricula) {
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grau = grau;
        this.matricula = matricula;
    }
    public void Alterar(String nome, String datanascimento, String rg, String cpf, String endereco, String naturalidade,
                       double salario, String profissao, String grau, int matricula) {
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grau = grau;
        this.matricula = matricula;
    }
    public void Imprimir(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Data de Nascimento: " + datanascimento);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Salário: " + salario);
        System.out.println("Profissão: " + profissao);
        System.out.println("Grau de Instrução: " + grau);
        System.out.println("Matrícula: " + matricula);

    }
}
