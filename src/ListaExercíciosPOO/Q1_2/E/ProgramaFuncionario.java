package ListaExercíciosPOO.Q1_2.E;

import ListaExercíciosPOO.Q1_2.E.Funcionario;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();

        func1.Cadastro("Bart Simpson", "01/04/1980", "29201919", "281923", "Hogwarts", "africana", 9201, "Garoto de programa - TI", "500", 123);
        func2.Cadastro("Lisa Simpson", "09/05/1982", "39139103", "283929", "Rua Sei Lá, Tomba - 123", "Nárnia", 22000, "Presidente", "2", 20292);

        System.out.println("Listando dados do primeiro funcionário: ");
        func1.Imprimir();

        System.out.println("Listando dados do segundo funcionário: ");
        func2.Imprimir();

        func1.Alterar("Bart Simpson", "01/04/1980", "29201919", "281923", "Wakanda", "africana", 9201, "Garoto de programa - TI", "500", 123);
        func2.Alterar("Lisa Simpson", "09/05/1982", "39139103", "283929", "Gotham City", "Nárnia", 22000, "Presidente", "2", 20292);

        System.out.println("Listando dados do primeiro funcionário depois de editado: ");
        func1.Imprimir();

        System.out.println("Listando dados do segundo funcionário depois de editado: ");
        func2.Imprimir();
    }
}
