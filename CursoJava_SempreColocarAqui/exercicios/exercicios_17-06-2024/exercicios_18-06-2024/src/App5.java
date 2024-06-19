import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {

        // TABUADA magica...

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dts1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite sua data de nascimento da seguinte maneira: dia/mes/ano---02/10/2002");
        String dataString = sc.nextLine();
        LocalDate dataLocalDate = LocalDate.parse(dataString, dts1);
        System.out.println(dataLocalDate);
        LocalDate now = LocalDate.now();

        long diferencaDays = ChronoUnit.DAYS.between(dataLocalDate, now);
        long diferencaMonths = ChronoUnit.MONTHS.between(dataLocalDate, now);
        long diferencaYears = ChronoUnit.YEARS.between(dataLocalDate, now);

        System.out.println(diferencaDays + " " + diferencaMonths + " " + diferencaYears);

        Period period = Period.between(dataLocalDate, now);
        System.out.println(period);

        sc.close();
    }
}
