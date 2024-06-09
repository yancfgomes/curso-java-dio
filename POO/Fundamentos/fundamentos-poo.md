# FUNDAMENTOS DE POO COM JAVA

## CONCEITO

- O Java é uma linguagem de alto nível, assim como JS, PY e C++
- Programação Estruturada ( procedimentos lineares ) VS. POO
- Enquanto a programação estruturada é voltada a procedimentos e funções, definidas pelo usuário, a programação orientada a objetos é voltada a conceitos, como o de classes e objetos.

## CLASSES
- toda a estrutura de código .java é denominado CLASSE

![](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-0c95c1d29336e1a2c8924f914cbab3dd38077990%252Fimage%2520%289%29%2520%281%29%2520%281%29%2520%281%29.png%3Falt%3Dmedia&width=400&dpr=2&quality=100&sign=3f83ee7303206c2f27bb92c3f9d585c03523ebc4df0d65f68da7cc9083dd3c3e)

### Seguindo algumas convenções, as nossas classes são classificadas como:

- **Classe de modelo (model)**: classes que representam estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.

- **Classe de serviço (service)**: classes que contém regras de negócio e validação de nosso sistema.

- **Classe de repositório (repository)**: classes que contém uma integração com banco de dados.

- **Classe de controle (controller)**: classes que possuem a finalidade de disponibilizar alguma comunicação externa, à nossa aplicação, como http web ou webservices.

- **Classe utilitária (util)**: classe que contém recursos comuns, à toda nossa aplicação.

![](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-2ce73deabfce2bcbe385e6fb4c19e9a510941778%252Fimage%2520%287%29%2520%281%29%2520%281%29.png%3Falt%3Dmedia&width=400&dpr=2&quality=100&sign=485026aaf1a8fe67c5f89268eef3287feba775ae4d3ef258f8d53c56e3e05272)

## PACOTES

Os pacotes são **subdiretórios**, a partir da pasta **src** do nosso projeto, onde estão localizadas, as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizadas no mercado.

### Nomenclatura de pacotes
Vamos imaginar, que sua empresa se chama Power Soft e ela está desenvolvendo software comercial, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:

- Comercial : com.powersoft;
- Governamental : gov.powersoft;
- Código aberto: org.powersoft.

### Identificação
Uma das características de uma classe é a sua **identificação**: Cliente, NotaFiscal, TituloPagar. 

Porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. 

O nome simples **(próprio nome)** e agora o nome qualificado **(endereçamento do pacote + nome)**, 

**Exemplo:** 

Considere a classe Usuario, que está endereçada no pacote ```com.controle.acesso.model``` , o nome qualificado desta classe é 
```com.controle.acesso.model.Usuario```

### Package versus Import
A localização de uma classe é definida pela palavra reservada ```package```, logo, uma classe só contém, uma definição de package no arquivo, sempre na **primeira linha do código**. Para a utilização de uma classe existente em outros pacotes, necessitamos realizar a importação das mesmas.


## VISIBILIDADE DOS RECURSOS
### Definição dos quatro tipos de visibilidade de atributos, métodos e até mesmo classes, no que se refere ao acesso por outras classes:

#### Public
- Como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote, poderá visualizar tais recursos.
- Não é recomendado a utilização de atributos públicos, pois fere o princípio de encapsulamento.
![public](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-11e169f025fbf09ce369a6166a354d12c7a2f794%252Flanchonete_1.png%3Falt%3Dmedia&width=400&dpr=2&quality=100&sign=96464960b690f023c20cc2106819cba854916d8c0f73d041edd3656fe98fe5e9)

#### Default
- Quando não definimos a visibilidade de um recurso, por padrão, ele é definido como default, ou seja, **visível apenas no mesmo pacote**.
![default](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-1fdf089ebb01ef7239344fbeae3dbf9ca71c1db0%252Fpacotes.png%3Falt%3Dmedia&width=400&dpr=2&quality=100&sign=62700f25ee79027f5cc0c161122c7e44cee300b12f9b5a7f0ec910706cfb19cb)
#### Private
- Quando definimos um recurso como privado, ele só é visível dentro da própria classe.
#### Protected
- Quando definimos um recurso como protegido, ele é visível para as classes do mesmo pacote e para as classes filhas (herança).

#### Em resumo:
- **Public**: visível em qualquer lugar;
- **Protected**: visível no mesmo pacote e para as classes filhas.
- **Default**: visível apenas no mesmo pacote;
- **Private**: visível apenas na própria classe;

![resumo](https://i.sstatic.net/vgiWa.png)
## GETTERS E SETTERS
- Os atributos precisam ter o modificador de acesso private, para que não sejam acessados diretamente por outras classes. Por isso a necessidade de métodos **Getters e Setters**.

- Os métodos **"Getters"** e **"Setters"** são utilizados para **buscar valores** de atributos ou **definir novos valores** de atributos, de instâncias de classes.

- O método Getter, **busca** o valor do atributo especificado.

- O método Setter, **edita** outro novo valor para o atributo especificado.

### Uso do this no método set
- O uso do **this** é uma referência ao próprio objeto, ou seja, ao objeto que está sendo instanciado.

- O uso do **this** é opcional, porém, é uma boa prática de programação, pois facilita a leitura e compreensão do código.

### Exemplo
```java
//arquivo Aluno.java
private String nome;

public void setNome(String nome) {
	this.nome = nome;
}
```

## CONSTRUTORES
- O construtor é um método especial, que é chamado no momento da instanciação de um objeto.

- O construtor é utilizado para inicializar os atributos de uma classe.

- O construtor é um método sem retorno, que possui o mesmo nome da classe.

- O construtor pode ser sobrecarregado, ou seja, podemos ter mais de um construtor na mesma classe, desde que tenham parâmetros diferentes.

![exemplo construtor](https://www.alura.com.br/artigos/assets/code/retorno-no-construtor-treino-para-a-certificacao-java.1717471099.png)

## ENUMS
- Enums são tipos de dados que consistem em um conjunto fixo de **constantes**.

- Enums são utilizados para representar valores fixos, como dias da semana, meses do ano, etc.

- Não confunda uma lista de constantes com enum. Uma lista de constantes é uma coleção de constantes, enquanto um enum é um **conjunto de objetos**.

```
// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão") ;
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}

```
### Boas práticas para criar objetos Enum

- As opções (objetos), devem ser descritos em caixa alta separados por underline (_), ex.: OPCAO_UM, OPCAO_DOIS;

- Após as opções, deve-se encerrar com ponto e vírgula ";" ;

- Um enum é como uma classe, logo, poderá ter atributos e métodos tranquilamente;

- Os valores dos atributos, devem já ser definidos após cada opção, dentro de parênteses como se fosse um new;

- O construtor deve ser privado;

- Não é comum um enum possuir o recurso setter(alteração de propriedade), somente os métodos getters correspondentes.

Agora NÃO precisaremos, criar objetos que representam cada estado, toda vez que precisarmos destas informações, basta usar o enum acima e escolher a opção (objeto), já pré-definido em qualquer parte do nosso sistema.

```
// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
		
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
	}
}

```

## UML (LINGUAGEM DE MODELAGEL UNIFICADA)
- A UML é uma linguagem de modelagem visual, que nos permite representar sistemas de software.

- É uma notação, que possibilita a representação gráfica do projeto.

### Diagramas 
As notações UML, são distribuídas em **duas categorias** de diagramas, a **estrutural** e **comportamental**

#### Estrutural
- **Diagrama de Classes**: representa a estrutura de um sistema, mostrando as classes, atributos, métodos e relacionamentos entre as classes.
- **Diagrama de Objetos**: representa a estrutura de um sistema, mostrando os objetos, atributos, métodos e relacionamentos entre os objetos.

### Relacionamentos
- **Associação**: é um relacionamento entre classes, onde uma classe está associada a outra.
- **Agregação**: é um relacionamento entre classes, onde uma classe é composta por outras classes.
- **Composição**: é um relacionamento entre classes, onde uma classe é composta por outras classes, porém, a classe composta não pode existir sem a classe que a compõe.

### Multiplicidade
 - 1.: Representa uma associação, contendo um elemento;

- *. : Representa uma associação, contendo uma lista de elementos;

- 0..1 :  Representa uma associação, contendo zero ou um elemento;

- 0..* : Representa uma associação, contendo zero ou uma lista de elementos;

- 1..* : Representa uma associação. contendo um ou uma lista de elementos.

### Visibilidade

Os atributos e métodos de uma classe, podem receber níveis de visibilidade, e na UML existem símbolos que representam cada um deles.

- (+) Visibilidade pública;
- (#) Visibilidade protegida (muito associada com herança);
- (-) Visibilidade privada.

![](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-b38fcec2347903449b3e5c98b2986f6f3cb96f4f%252Fimage%2520%286%29.png%3Falt%3Dmedia&width=400&dpr=2&quality=100&sign=2b2f602c7b4f7b3ad4f8803ee91b15b8eb12ab858376c8b596ffc636902911ba)

### Ferramentas
Existem inúmeras ferramentas de diagramação, tanto online, como pagas e gratuitas.
![](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-002403fbd6300dcfc3804ab04160d2e8f8d1cbec%252Fimage%2520%2817%29.png%3Falt%3Dmedia&width=400&dpr=2&quality=100&sign=9fce47bc1599fd0fba218c786c7c50694a10f5c57a3a8c1f2492ec80316849e1)