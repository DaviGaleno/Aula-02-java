import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        Double altura = sc.nextDouble();

        System.out.print("Informe seu peso: ");
        Double peso = sc.nextDouble();

        Double IMC = peso/(altura*altura);

        if(IMC < 10.5){
            System.out.println("Você está abaixo do peso!");
        }

        else if (IMC >= 10.5 && IMC <25.0) {
            System.out.println("Você está com o peso normal.");
        }

        else if (IMC >= 25.0 && IMC < 30.0){
            System.out.println("Você está com sobrepeso.");
        }

        else {
            System.out.println("Você está obeso.");
        }
    }

}
