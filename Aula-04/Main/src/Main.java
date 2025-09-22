import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner((System.in));
        do {
            System.out.println("Digite 1 para Pix, Transferência ou Débito, 5% de desconto.");
            System.out.println("Digite 2 para Espécie e receber 5% de desconto.");
            System.out.println("Digite 3 para Crédito, parcelar em 3x sem juros.");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção 1 selecionada, Pix, Transferência ou Débito, 5% de desconto.");
                    break;
                case 2:
                    System.out.println("Opção 2, Espécie e receber 5% de desconto.");
                case 3:
                    System.out.println("Opção 3, Crédito, parcelar em 3x sem juros.");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
            System.out.println("Para ver novamente digite S");
            r = sc.next();
        }while (r.equalsIgnoreCase("S"));

    }
}