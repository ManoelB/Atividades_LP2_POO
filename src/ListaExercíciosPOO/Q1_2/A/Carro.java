package ListaExercíciosPOO.Q1_2.A;

public class Carro {
    private int codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoFabricacao;
    private int numeroPortas;
    private String tipoCombustivel;
    private int quantidadeDisponivel;
    private double preco;
    private boolean completo;

    public void Cadastro(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numeroPortas,
                         String tipoCombustivel, int quantidadeDisponivel, double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
        System.out.println("Veículo cadastrado!");

    }

    public void Alterar(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numeroPortas,
                        String tipoCombustivel, int quantidadeDisponivel, double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
        System.out.println("As informações do veículo foram modificadas!");
    }

    public void listar() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Quantidade Disponível: " + quantidadeDisponivel);
        System.out.println("Preço: " + preco);
        System.out.println("Completo: " + (completo ? "Sim" : "Não"));
    }
}
