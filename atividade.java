import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Houve um reajuste de salario para todos os funcionarios da empresa, por favor digite seu salario no campo abaixo:");
        int num1 = sa.nextInt();
        double total = (num1 * 1.1);
        System.out.println("O numero digitado e: " + total);
        
}

}
