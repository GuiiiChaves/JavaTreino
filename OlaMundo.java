import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String guilherme = "GUILHERME";
    String nomeuser = sc.nextLine().toUpperCase();

    if (!nomeuser.equals(guilherme)) {
        
        System.out.println("Voce e safado");
    }else{
        System.out.println("Oi");

    }
    System.out.println("Seu nome e: " + nomeuser);
}
}
    