package ListaExercíciosPOO.Q1_2.D;

import ListaExercíciosPOO.Q1_2.D.Professor;

public class ProgramaProfessor {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        Professor prof2 = new Professor();

        prof1.Cadastro("Cleberivis", "Doutor", "Harvard", 48, 58000, "TI");
        prof2.Cadastro("Fernandivis", "Mestre", "Oxford", 2, 1000000, "sinuca");

        System.out.println("Listando dados do primeiro professor: ");
        prof1.Imprimir();

        System.out.println("Listando dados do segundo professor: ");
        prof2.Imprimir();

        prof1.Alterar("Cleberivis", "Doutor", "Harvard", 48, 90000, "TI");
        prof2.Alterar("Fernandivis", "Mestre", "MIT", 3, 84292, "sinuquinha, bb");

        System.out.println("Listando dados do primeiro professor depois de editado: ");
        prof1.Imprimir();

        System.out.println("Listando dados do segundo professor depois de editado: ");
        prof2.Imprimir();
    }
}
