import java.util.Scanner;

public class forca2 {
    private static final String[] PALAVRAS = {"JAVA", "PYTHON", "C++", "HTML", "CSS", "JAVASCRIPT"};
    private String palavraSecreta;
    private StringBuilder palavraAtual;
    private int tentativasRestantes;

    public forca2() {
        palavraSecreta = PALAVRAS[(int) (Math.random() * PALAVRAS.length)].toUpperCase();
        palavraAtual = new StringBuilder("_".repeat(palavraSecreta.length()));
        tentativasRestantes = 6;
    }
    
}
