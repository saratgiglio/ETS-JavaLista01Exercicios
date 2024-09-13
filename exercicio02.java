import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro:");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro:");
        int num2 = scanner.nextInt();

        int soma = (num1 + num2);

        int subt = (num1 - num2);

        int mult = (num1 * num2);

        int div = (num1 / num2);

        int numElev = (int) Math.pow(num1, num2);

        int restoDiv =  num1 % num2;



        System.out.println("a soma dos dois números é:" + soma);
        System.out.println("a subtração dos dois números é:" + subt);
        System.out.println("a multiplicação dos dois números é:" + mult);

        if (num2 > 0){
            System.out.println("a divisão do primeiro número pelo segundo é:" + div);

        }
        else{
            System.out.println("a divisão não poderá ser realizada.");
        }

        System.out.println("o primeiro número elevado ao segundo número:" + numElev);
        System.out.println("o resto da divisão do primeiro número pelo segundo é:" + restoDiv);
    }
}
