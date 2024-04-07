package ListaExercíciosPOO.Q1_2.D;

public class Professor {
    private String nome, titulacao, formacao, descdic;
    private int cargahoraria;
    private double salario;

    public void Cadastro(String nome, String titulacao, String formacao, int cargahoraria, double salario, String descdic) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargahoraria = cargahoraria;
        this.salario = salario;
        this.descdic = descdic;
        System.out.println("Os dados do professor foram cadastrados!");
    }
    public void Alterar(String nome, String titulacao, String formacao, int cargahoraria, double salario, String descdic) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargahoraria = cargahoraria;
        this.salario = salario;
        this.descdic = descdic;
        System.out.println("Os dados do professor foram alterados!");
    }
    public void alterarDescricaoDisciplinas(String descdic) {
        this.descdic = descdic;
    }
    public void Imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga Horária: " + cargahoraria);
        System.out.println("Salário: " + salario);
        System.out.println("Disciplinas: " + descdic);
    }
}