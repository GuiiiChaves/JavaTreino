import java.util.Scanner;

public class calculadorajav {

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Digite o numero um numero:");
        int num1 = sa.nextInt();
        System.out.println("digite outro numero");
        int num2 = sa.nextInt();
        int total = num1 + num2;
        System.out.println("O numero digitado e: " + total);
        
}
}
