public class ExemploBreakContinue {
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue; //pula a execução do código e vai para a próxima iteração
            else if(numero==5)
                break; //interrompe a execução do laço    
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ?
    
        }    
}
