import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Informe seu nome: ");
            String nome = sc.next();

            System.out.print("Informe seu email: ");
            String mail = sc.next();

            System.out.print("Informe sua idade: ");
            int idade = sc.nextInt();

            System.out.print("Informe sua altura: ");
            Float altura = sc.nextFloat();

            System.out.println(nome);
            System.out.println(mail);
            System.out.println(idade);
            System.out.println(altura);
        }

    }

