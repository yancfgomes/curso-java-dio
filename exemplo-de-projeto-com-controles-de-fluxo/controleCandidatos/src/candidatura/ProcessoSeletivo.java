import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatosSelecionados = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};

        // Inicia o processo de contatar os candidatos selecionados
        for (String candidato : candidatosSelecionados) {
            contatarCandidato(candidato);
        }
    }

    // Método para contatar o candidato
    static void contatarCandidato(String candidato) {
        int tentativasRealizadas = 0;
        boolean atendeu = false;

        // Tenta contatar o candidato até atender ou até 3 tentativas
        do {
            atendeu = atenderCandidato();
            tentativasRealizadas++;

            if (atendeu) {
                System.out.println("Contato realizado com sucesso com " + candidato + " após " + tentativasRealizadas + " tentativas.");
            } else if (tentativasRealizadas == 3) {
                System.out.println("Não foi possível contatar " + candidato + ". Número máximo de tentativas realizadas.");
            }
        } while (!atendeu && tentativasRealizadas < 3);
    }

    // Método simulando se o candidato atendeu ou não
    static boolean atenderCandidato() {
        return new Random().nextInt(3) == 1;
    }

    // Método para imprimir os candidatos selecionados
    static void imprimirSelecionados() {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};
        for (String candidato : candidatos) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
        }
    }

    // Método para seleção dos candidatos com base no salário pretendido
    static void selecaoCandidatos() {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Joana", "Paulo", "Luana"};
        int candidatosSelecionados = 0;
        double salarioBase = 2000.00;

        // Percorre a lista de candidatos
        for (String candidato : candidatos) {
            double salarioPretendido = gerarSalarioPretendido();

            // Imprime o salário pretendido do candidato
            System.out.println("O candidato " + candidato + " solicitou um salário de R$" + salarioPretendido);

            // Verifica se o salário pretendido está dentro do limite
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;

                // Verifica se já foram selecionados cinco candidatos
                if (candidatosSelecionados == 5) {
                    break;
                }
            }
        }
    }

    // Método para gerar salário pretendido de forma aleatória
    static double gerarSalarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
