package ListaExercíciosPOO.Q3;
import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Calculadora calcular= new Calculadora();

        System.out.println("( Calculadora )");

        System.out.println("Digite o primeiro número: ");
        calcular.num1=scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        calcular.num2=scan.nextDouble();

        calcular.menu(calcular.num1,calcular.num2);
    }
}
