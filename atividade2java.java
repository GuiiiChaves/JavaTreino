import java.util.Locale;
import java.util.Scanner;

public class atividade2java {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Houve um reajuste na velocidade máxima da via, se o valor ultrapassar 80km/h você será multado em 5 reais.");
        Scanner sa = new Scanner(System.in);
        System.out.println("Digite a sua velocidade em km/h: ");
        double velocidade = sa.nextDouble();
        double valorMulta = velocidade > 100 ? 10.0 : 5.0;
        double multa = (velocidade - 80) * valorMulta;

        if (velocidade > 80) {
            System.out.println("Você foi multado em R$" + multa);
        } else {
            System.out.println("Você não ultrapassou o limite de velocidade.");
        }
        sa.close();
    }

}
