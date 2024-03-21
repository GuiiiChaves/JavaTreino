import java.util.Locale;
import java.util.Scanner;

public class ativadee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sa = new Scanner(System.in);
        System.out.println("Digite ha quantos dias voce esta com o livro: ");
        int atraso = sa.nextInt();
        double valorMulta = atraso >= 14 ? 2.0 : 1.0;
        double atraso7 = (0.50 * atraso);


        if (atraso7 <= 7) {
            System.out.println("Você foi multado em R$" + atraso7);
        }

        else {
            System.out.println("Voce foi multado em: R$" + valorMulta);
        }
        sa.close();
    }
}
