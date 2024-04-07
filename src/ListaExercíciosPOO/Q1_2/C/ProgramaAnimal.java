package ListaExercíciosPOO.Q1_2.C;

import ListaExercíciosPOO.Q1_2.C.Animal;

public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.Cadastro("Girafa", "11/09/2001","Girafales", "Xique-xique - BA", "69");
        animal2.Cadastro("Canguru", "09/04/2024", "Cangurúncio", "praça da matriz", "24");

        System.out.println("Listando dados do primeiro animal: ");
        animal1.Imprimir();

        System.out.println("Listando dados do segundo animal: ");
        animal2.Imprimir();

        animal1.Alterar("Girafa", "11/09/2001", "Girafales", "Casa das Primas", "58");
        animal2.Alterar("Canguru", "09/04/2024", "Cangurúncio", "Alaíde", "21");

        System.out.println("Listando dados do primeiro animal depois de editado: ");
        animal1.Imprimir();

        System.out.println("Listando dados do segundo animal depois de editado: ");
        animal2.Imprimir();    }
}
