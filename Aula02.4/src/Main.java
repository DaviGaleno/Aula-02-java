import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner((System.in));
        do {
        System.out.print("Informe seu nome: ");
        String nome = sc.next();

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Seu cadastro atual é");
        System.out.println(nome);
        System.out.println(idade);

            System.out.println("Quer se cadastrar novamente? Digite S");
            r = sc.next();
        }while (r.equalsIgnoreCase("S"));

    }
}