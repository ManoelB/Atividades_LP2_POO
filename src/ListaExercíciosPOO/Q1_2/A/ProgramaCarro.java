package ListaExercíciosPOO.Q1_2.A;

import ListaExercíciosPOO.Q1_2.A.Carro;

public class ProgramaCarro {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.Cadastro(1, "BMW", "Verde", "420i Cabrio", 2022, 2, "Gasolina", 5, 420000.0, true);

        carro2.Cadastro(2, "BMW", "Azul", "i8", 2023, 2, "Híbrido", 3, 200000.0, true);

        System.out.println("Listando dados do carro 1: ");
        carro1.listar();

        System.out.println("Listando dados do carro 2: ");
        carro2.listar();

        carro1.Alterar(1, "CARRO BOM", "Cinza", "VKEE V2", 2018, 4, "Gasolina comun", 8, 74800, false);
        carro2.Alterar(2, "CARRO CARROS", "Branco", "PPTR", 2020, 4, "Gasolina", 10, 110530.02, true);

        System.out.println("Listando dados do carro 1 depois de editados: ");
        carro1.listar();

        System.out.println("Listando dados do carro 2 depois de editados: ");
        carro2.listar();
    }
}
