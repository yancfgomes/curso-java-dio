package test.java.com.example.iphone;
import main.java.com.example.iphone.iPhone;

public class AparelhoTelefonicoTest {
    public static void testAparelhoTelefonico() {
        System.out.println("Testando o Aparelho Telefônico:");

        iPhone iphone = new iPhone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Adicione verificações de saída ou comportamento esperado conforme necessário
    }
}
