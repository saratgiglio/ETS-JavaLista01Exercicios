import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int salario = 3500;
        int comissao = 350;
        double comsValorTotal = 0.01 / 100.0;

        System.out.print("Seu nome: ");
        String vendedor = scanner.nextLine();

        System.out.print("Mês: ");
        String mes = scanner.nextLine();

        System.out.print("quantidade de carro que você vendeu no mês: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Valor total vendido na companhia:");
        double valorVendTotal = scanner.nextDouble();



        scanner.nextLine();

        int comissaoCarroVend = comissao * carrosVendidos;

        double comissaoTotal = valorVendTotal * comsValorTotal;

        double valorTotalReceber = comissaoCarroVend + comissaoTotal + salario;

                System.out.println("dados do Mês: " + mes + " - do vendedor: \n" + vendedor + ":");

        System.out.println("salário fixo: " + salario);
        System.out.println("comissão por carro vendido: " + comissaoCarroVend);
        System.out.println("valor a receber referente a comissão total de vendas da empresa: " + comissaoTotal);
        System.out.println("valor total a receber no mês: " + mes + ":\nR$ " + valorTotalReceber );

    }
}
