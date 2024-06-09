
public class ProcessoSeletivo {
    public static void main(String[] args) {
        
    
    }
        
        
        static void analisarCandidato(double salarioPretendido){
            double salarioBase = 2000.00;
            if(salarioBase > salarioPretendido){
                System.out.println("\n=====================================================");
                System.out.println("Salário: R$"+salarioPretendido);
                System.out.println("STATUS: LIGAR PARA O CANDIDATO");
                System.out.println("=====================================================\n");
            } else if(salarioBase == salarioPretendido){
                System.out.println("\n=====================================================");
                System.out.println("Salário: R$"+salarioPretendido);
                System.out.println("STATUS: LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
                System.out.println("=====================================================\n");
            } else{
                System.out.println("\n=====================================================");
                System.out.println("Salário: R$"+salarioPretendido);
                System.out.println("STATUS: AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
                System.out.println("=====================================================\n");
            }
        }
    
    
}
