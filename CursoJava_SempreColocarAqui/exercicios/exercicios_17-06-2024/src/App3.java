import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dts1 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

        System.out.println("Digite dia aniversário: ");
        int dia = 5;
        System.out.println("Digite mes aniversário: ");
        int mes = 10;
        System.out.println("Digite ano aniversário: ");
        int ano = 2000;
        System.out.println("Hora / minuto/ segundo");
        int hora = 11;
        int minuto = 52;
        int segundo = 32;

        LocalDateTime date = LocalDateTime.of(ano, mes, dia, hora, minuto, segundo);
        LocalDateTime hoje = LocalDateTime.now();

        System.out.println(hoje.compareTo(date));
        System.out.println(hoje.format(dts1));

        Duration duration = Duration.between(date, hoje);
        long datarte = ChronoUnit.DAYS.between(date, hoje);

        sc.close();

    }
}
