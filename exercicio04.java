import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numInt = scanner.nextInt();

        int numAnt = numInt - 1;
        int numSuc = numInt + 1;

        System.out.println("O número informado foi: " + numInt);
        System.out.println("Número sucessor: " + numSuc);
        System.out.println("Número antecessor: " + numAnt);


    }
}
