package test.java.com.example.iphone;
import main.java.com.example.iphone.iPhone;

public class ReprodutorMusicalTest {
    public static void testReprodutorMusical() {
        System.out.println("Testando o Reprodutor Musical:");

        iPhone iphone = new iPhone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Summer over the rainbow");

        // Adicione verificações de saída ou comportamento esperado conforme necessário
    }
}
