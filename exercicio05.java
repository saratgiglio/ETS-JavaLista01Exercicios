import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite que horas são (separadamente): ");
        int hora = scanner.nextInt();

        System.out.print("Digite que minutos são (separadamente): ");
        int minuto = scanner.nextInt();

        System.out.print("Digite que segundos são (separadamente): ");
        int segundos = scanner.nextInt();

        int contaHora = hora * 3600;
        int contaMin = minuto * 3600;

        System.out.println("Horário normal:" + hora + ":" + minuto + ":" + segundos);
        System.out.println("Horário em segundos:" + contaHora + contaMin  + segundos);



    }
}
