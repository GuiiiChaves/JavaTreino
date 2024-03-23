import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = sa.nextLine().toUpperCase();
        int[] contagemLetras = new int[26]; // Array para contar as letras de A a Z
        
        // Contagem das letras na palavra
        for (char letra : palavra.toCharArray()) {
            if (letra >= 'A' && letra <= 'Z') {
                contagemLetras[letra - 'A']++;
            }
        }
        
        // Impressão da contagem de letras
        System.out.println("Contagem de letras na palavra:");
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            if (contagemLetras[letra - 'A'] > 0) {
                System.out.println(letra + ": " + contagemLetras[letra - 'A']);
            }
        }
    }
}
