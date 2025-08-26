import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner((System.in));
        do {
            System.out.println("Digite 1 para café da manhã ou digite 2 para almoço");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção 1 selecionada, o café da manhã e das 6:00 até as 10:00.");
                    break;
                case 2:
                    System.out.println("Opção 2 , o almoço é das 11:00 até as 14:00.");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
            System.out.println("Para ver novamente digite S");
            r = sc.next();
        }while (r.equalsIgnoreCase("S"));

    }
}