public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno " + (x+1) + " é " + alunos[x]);
        }

        System.out.println("\nUsando o for each:\n");

        for(String aluno : alunos) {
            System.out.println(aluno);
        }
    
    }
}
