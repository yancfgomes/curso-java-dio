package test.java.com.example.iphone;
import main.java.com.example.iphone.iPhone;

public class NavegadorNaInternetTest {
    public static void testNavegadorNaInternet() {
        System.out.println("Testando o Navegador na Internet:");

        iPhone iphone = new iPhone();
        iphone.exibirPagina("https://www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Adicione verificações de saída ou comportamento esperado conforme necessário
    }
}
