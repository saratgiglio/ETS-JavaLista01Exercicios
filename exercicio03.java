import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Querido cliente, qual o valor de compra do produto:");
        double valorCompra = scanner.nextDouble();

        // não deixa dar erro no double
        scanner.nextLine();

        double valorRepresentante = 20.0 / 100.0;
        double calcRep = valorCompra * valorRepresentante;
        double valorFinalRep = valorCompra + calcRep;


        double valorImpostos = 30.0 / 100.0;
        double calcImp = valorCompra * valorImpostos;
        double valorFinalImp = valorCompra + calcImp;



        System.out.println("\nvalor da compra do produto: " + valorCompra);

        System.out.println("Porcentagem do representante: " + valorFinalRep);

        System.out.println("Porcentagem dos impostos: " + valorFinalImp);



    }
}
