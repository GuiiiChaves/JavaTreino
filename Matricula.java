import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Matricula {
    public static void main(String[] args) {
        // Configurando o local para os Estados Unidos
        Locale.setDefault(Locale.US);
        
        // Pegando a data e hora atual dos EUA
        ZonedDateTime currentDateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        
        // Formatando a data e hora atual
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        
        // Exibindo a data e hora atual
        System.out.println("Data e hora atual em SP: " + formattedDateTime);

        Scanner sa = new Scanner(System.in);
        System.out.println("Digite há quantos dias você está com o livro: ");
        int atraso = sa.nextInt();
        double valorMulta = atraso >= 14 ? 2.0 : 1.0;
        double atraso7 = (0.50 * atraso);

        if (atraso7 <= 7) {
            System.out.println("Você foi multado em R$" + atraso7);
        } else {
            System.out.println("Você foi multado em: R$" + valorMulta);
        }
        sa.close();
    }
}
