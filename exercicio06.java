import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite sua outra nota:  ");
        int nota2 = scanner.nextInt();

        double peso1 = 40.0 / 100.0;
        double peso2 = 60.0 /100.0;

        double mediaPonderada = (nota1 * peso1) + (nota2 * peso2);

        System.out.println("a média ponderada é: " + mediaPonderada);


    }
}
