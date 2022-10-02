import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner e = new Scanner(System.in);

       System.out.println("Digite o primeiro numero: ");
        double a = e.nextInt();
       System.out.println("Digite o segundo numero: ");
       double b = e.nextInt();

        double c = a + b;
        System.out.println("resultado: " + c);
    }
}
