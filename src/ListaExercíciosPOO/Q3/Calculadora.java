package ListaExercíciosPOO.Q3;

import java.util.Scanner;

public class Calculadora {
    double num1, num2;

    public void soma(double num1, double num2) {
        System.out.println("Somar os números: ");
        double soma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + soma);
    }

    public void subtrair(double num1, double num2) {
        System.out.println("Subtrair os números: ");
        double sub = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + sub);
    }

    public void multiplicar(double num1, double num2) {
        System.out.println("Multiplicar os números: ");
        double mult = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + mult);
    }

    public void dividir(double num1, double num2) {
        System.out.println("Dividir os números: ");
        double div = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + div);
    }
    public void menu(double num1, double num2){
        Scanner scan = new Scanner(System.in);
        int esc;
        do {
            System.out.println("(MENU)");
            System.out.println("Digite o número correspondente ao seu desejo:");
            System.out.println("[1] - Adição");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[5] - Voltar");
            esc = scan.nextInt();

            switch (esc) {
                case 1:
                    soma(num1, num2);
                    break;
                case 2:
                    subtrair(num1, num2);
                    break;
                case 3:
                    multiplicar(num1, num2);
                    break;
                case 4:
                    dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Digite apenas um número dentre 1 -5.");
                    return;

            }
        }while (esc!=5);
        scan.close();
    }
}

