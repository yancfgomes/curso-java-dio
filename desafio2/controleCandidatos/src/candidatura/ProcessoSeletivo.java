import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
    }
     
  static void imprimirSelecionados(){
    String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};
    for (String candidato : candidatos) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
    }
  }
    


    static void selecaoCandidatos() {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Joana", "Paulo", "Luana"};
        int candidatosSelecionados = 0; // Contador de candidatos selecionados
        double salarioBase = 2000.00; // Salário base oferecido
    
        // Percorre a lista de candidatos
        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido(); // Gera o valor pretendido de forma aleatória
    
            // Imprime o nome do candidato e o salário pretendido
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$" + salarioPretendido);
    
            // Verifica se o salário pretendido do candidato está dentro do limite
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!"); // Candidato selecionado
                candidatosSelecionados++; // Incrementa o contador de candidatos selecionados
    
                // Verifica se já foram selecionados cinco candidatos
                if (candidatosSelecionados == 5) {
                    break; // Sai do loop caso tenha selecionado cinco candidatos
                }
            }
        }
    }
    
    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }
        
   static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.00;

    // Define o status com base na comparação entre o salário pretendido e o salário base
    String status;
    if (salarioBase > salarioPretendido) {
        status = "LIGAR PARA O CANDIDATO";
    } else if (salarioBase == salarioPretendido) {
        status = "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA";
    } else {
        status = "AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS";
    }

    // Imprime as informações do candidato e o status
    System.out.println("\n=====================================================");
    System.out.println("Salário: R$" + salarioPretendido);
    System.out.println("STATUS: " + status);
    System.out.println("=====================================================\n");
}

    
   
}
