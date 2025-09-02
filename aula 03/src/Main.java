import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String r;
      do {
          Scanner sc = new Scanner(System.in);
          Cliente c = new Cliente();

          System.out.print("Digite o nome do cliente: ");
          c.nome = sc.next();

          System.out.print("Digite o RG do cliente: ");
          c.rg = sc.next();

          System.out.print("Digite o número do cliente: ");
          c.num = sc.next();

          System.out.print("Digite o endereço do cliente: ");
          c.end = sc.next();

          System.out.print("Digite o peso do cliente: ");
          c.peso = sc.nextDouble();

          System.out.print("Digite a altura do cliente: ");
          c.alt = sc.nextDouble();

          System.out.println(c.nome);
          System.out.println(c.rg);
          System.out.println(c.num);
          System.out.println(c.end);

          if (c.IMC < 10.5) {
              System.out.println("Você está abaixo do peso!");
          } else if (c.IMC >= 10.5 && c.IMC < 25.0) {
              System.out.println("Você está com o peso normal.");
          } else if (c.IMC >= 25.0 && c.IMC < 30.0) {
              System.out.println("Você está com sobrepeso.");
          } else {
              System.out.println("Você está obeso.");
          }

          System.out.println("Quer se cadastrar novamente? Digite S");
          r = sc.next();
      }while (r.equalsIgnoreCase("S"));

    }
}

