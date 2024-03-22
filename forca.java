import java.util.Scanner;

public class forca {
    private static final String[] PALAVRAS = {"JAVA", "PYTHON", "KOTLIN", "HTML", "CSS", "JAVASCRIPT"};
    private String palavraSecreta;
    private StringBuilder palavraAtual;
    private int tentativasRestantes;

    public forca() {
        palavraSecreta = PALAVRAS[(int) (Math.random() * PALAVRAS.length)].toUpperCase();
        palavraAtual = new StringBuilder("_".repeat(palavraSecreta.length()));
        tentativasRestantes = 6;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        while (tentativasRestantes > 0 && palavraAtual.indexOf("_") != -1) {
            System.out.println("Palavra atual: " + palavraAtual);
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite uma letra: ");
            String palpite = scanner.next().toUpperCase();
            if (palavraSecreta.contains(palpite)) {
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    if (palavraSecreta.charAt(i) == palpite.charAt(0)) {
                        palavraAtual.setCharAt(i, palpite.charAt(0));
                    }
                }
            } else {
                tentativasRestantes--;
                System.out.println("Letra incorreta. Tente novamente.");
            }
        }

        if (tentativasRestantes > 0) {
            System.out.println("Parabéns! Você acertou a palavra: " + palavraSecreta);
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        forca jogo = new forca();
        jogo.jogar();
    }
}


