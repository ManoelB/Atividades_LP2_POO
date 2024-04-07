package ListaExercíciosPOO.Q1_2.C;

public class Animal {
    private String especie, nascimento, nome, localnascimento, registro;

    public void Cadastro(String especie, String nascimento, String nome, String localnascimento, String registro){
        this.especie=especie;
        this.nome=nome;
        this.nascimento=nascimento;
        this.localnascimento=localnascimento;
        this.registro=registro;
        System.out.println("Registro realizado!");
    }
    public void Alterar(String especie, String nascimento, String nome, String localnascimento, String registro){
        this.especie=especie;
        this.nome=nome;
        this.nascimento=nascimento;
        this.localnascimento=localnascimento;
        this.registro=registro;
        System.out.println("Alteração realizada!");
    }
    public void Imprimir(){
        System.out.println("Especie: " + especie);
        System.out.println("Data de Nascimento: " + nascimento);
        System.out.println("Nome do animal: " + nome);
        System.out.println("Local de Nascimento: " + localnascimento);
        System.out.println("Registro do animal: : " + registro);

    }
}
