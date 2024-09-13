import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean dadosCorretos = false;

        while (!dadosCorretos) {

            System.out.print("Seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Sua data de nascimento: ");
            String dataNasc = scanner.nextLine();

            System.out.print("Pretensão salarial: ");
            double pretSal = scanner.nextDouble();

            // não deixa dar erro no double
            scanner.nextLine();

            System.out.print("Grau de instrução: ");
            String grauInst = scanner.nextLine();

            System.out.print("Possui carteira B? s/n: ");
            String cartB = scanner.nextLine();


            System.out.println("\nEstes dados estão corretos?");
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Data de nascimento: " + dataNasc);
            System.out.println("Pretensão salarial: " + pretSal);
            System.out.println("Grau de instrução: " + grauInst);
            System.out.println("Carteira de motorista B: " + cartB);

            System.out.println("\nDigite:");
            System.out.println("[1] Dados corretos");
            System.out.println("[2] Dados incorretos");

            int verif = scanner.nextInt();

            switch (verif) {
                case 1:
                    System.out.println("Dados corretos! Cadastro confirmado.");
                    dadosCorretos = true;
                    break;
                case 2:
                    System.out.println("Dados incorretos. Por favor, tente novamente.");
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    scanner.nextLine();
                    break;
            }
        }

        scanner.close();
    }
}
