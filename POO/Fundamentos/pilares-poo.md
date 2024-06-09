# PILARES DO POO
- Os pilares da programação orientada a objetos são os princípios que regem a programação orientada a objetos.

## 1. Encapsulamento
-  Técnica que envolve a ocultação dos detalhes internos de uma classe, expondo apenas o que é necessário para a utilização de um objeto.
- Interfaces Claras: Provisão de métodos públicos (getters e setters) para interagir com os atributos privados de forma controlada.
- Segurança e Manutenção: Protege a integridade dos dados, evitando acesso direto e modificações indevidas, facilitando a manutenção e a evolução do código.

```
public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;

    // Construtor para inicializar os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Setter para a idade
    public void setIdade(int idade) {
        // Validação simples para demonstrar a utilidade de setters
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);

        // Acessando atributos através de getters
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Modificando atributos através de setters
        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        // Tentando definir uma idade inválida
        pessoa.setIdade(-5);

        // Acessando novamente para ver as mudanças
        System.out.println("Novo Nome: " + pessoa.getNome());
        System.out.println("Nova Idade: " + pessoa.getIdade());
    }
}


```
## 2. Herança
- Herança é o ato de criar uma nova classe a partir de uma classe já existente.

![herança](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-fd6c7fe52a162033db9766e99c07ec7735df2ebe%252Fimage%2520%2811%29%2520%281%29%2520%281%29%2520%281%29.png%3Falt%3Dmedia&width=400&dpr=2&quality=100&sign=e9dcbd41a1c3981aa284eb922375f971c2346b9e2488d0c0fcd4ed7a632e1b0b)

```
// Superclasse
public class Animal {
    // Atributos da superclasse
    private String nome;
    private int idade;

    // Construtor da superclasse
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos da superclasse
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }

    // Getters e Setters da superclasse
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
=======================================================
// Subclasse que herda de Animal
public class Cachorro extends Animal {
    // Atributo adicional da subclasse
    private String raca;

    // Construtor da subclasse
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor da superclasse
        this.raca = raca;
    }

    // Método adicional da subclasse
    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo");
    }

    // Sobrescrita do método da superclasse
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late: Au Au");
    }

    // Getter e Setter da subclasse
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Método principal para testar as classes
    public static void main(String[] args) {
        // Criando um objeto da superclasse
        Animal animal = new Animal("Animal Genérico", 5);
        animal.fazerSom();

        // Criando um objeto da subclasse
        Cachorro cachorro = new Cachorro("Rex", 3, "Labrador");
        cachorro.fazerSom(); // Método sobrescrito
        cachorro.abanarRabo();

        // Acessando atributos e métodos herdados
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade());
        System.out.println("Raça: " + cachorro.getRaca());
    }
}


```

## 3. Abstração
- Abstração é o ato de abstrair as características de um objeto, ou seja, pegar as características mais importantes e criar uma classe com base nelas.
- É muito difícil falar de abstraçãoe NÃO mencionar polimorfismo.
## 4. Polimorfismo
- São as inúmeras maneiras de se realizar uma mesma ação.
- Polimorfismo é o ato de criar métodos com o mesmo nome, mas com comportamentos diferentes.

### Tipos de Polimorfismo
![](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-346b134698ce593ffb76f72333bc79bfa04e6199%252Fimage%2520%289%29.png%3Falt%3Dmedia&width=400&dpr=2&quality=100&sign=8d55bf918ff095b6c097fd7c320b5da6901754f17a20e47be28364f5a7c14cfd)
- Para concluirmos a compreensão, Polimorfismo permite que as classes mais abstratas, determinem ações uniformes, para que cada classe filha concreta, implemente os comportamentos de forma específica. 
- Polimorfismo de sobrecarga
- Polimorfismo de sobreposição

## 5. Interface
- Nível maior que a abstração.
- Interface é o ato de criar um contrato que deve ser implementado por uma classe.

