package Estudodecaso1.Q2;
import java.util.Scanner;

public class TV_EC {
    private String marca;
    private float polegadas;
    private int volume, voltagem, canal;

    public TV_EC(String marca, float polegadas, int voltagem){
        this.marca=marca;
        this.polegadas=polegadas;
        this.volume=5;
        this.voltagem=voltagem;
        this.canal=0;
    }

    public void funtv(){
        Scanner scan = new Scanner(System.in);
        int func;
        do{
            System.out.println("(MENU)");
            System.out.println("Digite o número correspondente ao seu desejo:");
            System.out.println("[1] - Ligar");
            System.out.println("[2] - Desligar");
            System.out.println("[3] - Aumentar o Volume");
            System.out.println("[4] - Diminuir o Volume");
            System.out.println("[5] - Subir de Canal");
            System.out.println("[6] - Descer de Canal");
            System.out.println("[7] - Finalizar Tarefa");
            func = scan.nextInt();

            switch (func){
                case 1:
                    ligar();
                    break;
                case 2:
                    desligar();
                    break;
                case 3:
                    aumentarvolume();
                    break;
                case 4:
                    diminuirvolume();
                    break;
                case 5:
                    subircanal();
                    break;
                case 6:
                    descercanal();
                    break;
                case 7:
                    System.out.println("Tarefa finalizada.");
                    break;

                default:
                    System.out.println("Digite apenas um número dentre 1 - 7.");
            }
        } while (func!=7);

    }
    public void ligar(){
        float consumo = this.polegadas * this.voltagem;
        System.out.println("Tv Ligada!\n");
        System.out.println("O consumo da TV é: " + consumo);
    }
    public void desligar() {
        System.out.println("Tv Desligada!");
    }
    public void aumentarvolume(){
        if (this.volume < 10){
            ++this.volume;
            System.out.println("Volume aumentado.\n");
            System.out.println("Volume: " + this.volume);
        } else if (this.volume == 10) {
            System.out.println("O volume está no máximo.");
        }
    }
    public void diminuirvolume() {
        if (this.volume >= 1) {
            --this.volume;
            System.out.println("Volume diminuído.\n");
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("O volume está no mínimo.");
        }
    }
    public void subircanal() {
        if (this.canal<10){
            ++this.canal;
            System.out.println("Você subiu para o canal: " + this.canal);
        } else {
            System.out.println("Não tem como subir mais de canal.");
        }

    }
    public void descercanal() {
        if (this.canal!=0){
            --this.canal;
            System.out.println("Você desceu para o canal: " + this.canal);
        } else {
            System.out.println("Não tem como descer mais de canal.");
        }

    }

}
