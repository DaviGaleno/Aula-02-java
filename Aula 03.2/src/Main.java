import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Calc c = new Calc();
        Scanner sc = new Scanner((System.in));
        int n1,n2;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("digite o primeiro numero:");
        n1=sc.nextInt();
        System.out.println("digite o segundo numero: ");
        n2 = sc.nextInt();

        c.somar(n1,n2);

    }

}
