package Estudodecaso1.Q1;
import java.util.Scanner;

public class Carro_EC {
    private String modelo;
    private int marcha;
    private double velocidade, aceleração;
    private boolean ligado;

    public Carro_EC(String modelo, double acerelação){
        this.modelo = modelo;
        this.aceleração = acerelação;
        this.velocidade = 0;
        this.velocidade = 0;
        this.ligado = false;
    }

    public void funcoescarro(){
        Scanner scan=new Scanner(System.in);
        int func;

        do{
            System.out.println("(MENU)");
            System.out.println("Digite o número correspondente ao seu desejo:");
            System.out.println("[1] - Ligar");
            System.out.println("[2] - Desligar");
            System.out.println("[3] - Acelerar");
            System.out.println("[4] - Desacelerar");
            System.out.println("[5] - Virar /Esquerda");
            System.out.println("[6] - Virar /Direita");
            System.out.println("[7] - Subir /Marcha");
            System.out.println("[8] - Descer /Marcha");
            func = scan.nextInt();

            switch(func){
                case 1:
                    ligar();
                    break;
                case 2:
                    desligar();
                    break;
                case 3:
                    acelerar();
                    break;
                case 4:
                    desacelerar();
                    break;
                case 5:
                    VirarEsquerda();
                    break;
                case 6:
                    VirarDireita();
                    break;
                case 7:
                    SubirMarcha();
                    break;
                case 8:
                    Descermarcha();
                    break;
                default:
                    System.out.println("Digite apenas um número dentre 1 - 8.");
            }
        }while (func!=8);
    }
    public void ligar(){
        ligado=true;
            System.out.println("O carro está ligado.");
    }
    public void desligar(){
        ligado=false;
        System.out.println("O carro está desligado.");
        this.marcha=0;
    }
    public void acelerar(){
        if(ligado){
            velocidade += aceleração;
            System.out.println("O carro está acelerando. A velocidade atual é: " + velocidade + "Km/h.");
        } else {
            System.out.println("É necessário que o carro esteja ligado para poder acelerar.");
        }
    }
    public void desacelerar(){
        if(ligado){
            velocidade -= aceleração;
            if (velocidade < 0){
                velocidade = 0;
            }
            System.out.println("O carro está desacelerando. A velocidade atual é: " + velocidade + "Km/h.");
        } else {
            System.out.println("É necessário que o carro esteja ligado para poder desacelerar.");
        }
    }
    public void VirarEsquerda(){
        if (ligado) {
            System.out.println("O carro está virando à esquerda.");
        } else {
            System.out.println("É necessário que o carro esteja ligado para poder virar à esquerda.");
        }
    }
    public void VirarDireita(){
        if (ligado) {
            System.out.println("O carro está virando à direita.");
        } else {
            System.out.println("É necessário que o carro esteja ligado para poder virar à direita.");
        }
    }
    public void SubirMarcha(){
        if (ligado) {
            marcha++;
            System.out.println("Você aumentou para a marcha " + marcha);
        } else {
            System.out.println("É necessário que o carro esteja ligado para poder aumentar a marcha.");
        }
    }
    public void Descermarcha(){
        if (marcha > 0 && ligado) {
            marcha--;
            System.out.println("Você diminuiu para a marcha " + marcha);
        } else {
            System.out.println("É necessário que o carro esteja ligado para poder diminuir a marcha.");
        }
    }
}
