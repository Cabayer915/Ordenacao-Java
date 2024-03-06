# Projeto Ordenação de Listas

Esse Projeto tem o simples intuito de realizar algumas consultas em elementos por Pesquisa Binária e alguns metódos de ordenação, sendo eles: `Bubble Sort`, `Selection Sort` e `Pesquisa Binária`.

## Funcionalidades

O projeto possui as seguintes funcionalidades básicas:

- **Bubble Sort**: A função de Bubble Sort ocorre na classe `BubbleSort`, onde ele armazena o maior valor encontrado e sobe ele comparando com o próximo indice da lista.
- **Selection Sort**: A função de Selection Sort ocorre na classe `Main`, onde ele compara os valores da lista em ordem sequencial pelo menor valor.
- **Insertion Sort**: A função de Insertion Sort ocorre na classe `InsertionSort`, onde ele divide os elementos em duas listas (ordenada e não ordenada), e ordena os elementos jogando seus indices para as listas que forem necessárias até completar a ordenação.
- **Pesquisa Binária**: A pesquisa binária ocorre na classe `PesquisaBinaria`, onde ele percorre a lista e retorna o valor definido pelo usuário.

## Tecnologias Utilizadas

- Java
- Maven

<div style="display: flex; gap: 3px;">

<img aling="center" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>

<img alt="center" src="https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white">

</div>

## Estrutura do Projeto

O projeto segue uma estrutura básica de uma aplicação Java:

- **`src/`**: Contém todo o código fonte da aplicação.
  - **`src/main/java/`**: Contém os pacotes Java da aplicação.
  - **`src/main/resources/`**: Contém os arquivos de configuração e recursos estáticos.
- **`src/main/test/`**: Contém os testes unitários e de integração.

## Como Executar

Para executar este projeto localmente, siga as etapas abaixo:

1. Certifique que Java JDK está instalado em sua máquina.

2. Certifique que o Maven está instalado em sua máquina.

3. Clone este repositório em seu ambiente local:
```Bash 
git clone https://github.com/Cabayer915/Ordenacao-Java
```

4. Navegue até o diretório raiz do projeto:
```Bash
cd /Ordenacao-Java/lista-ordenacao-sort/src/
```

5. Execute o comando mvn clean install para baixar as dependências e compilar o projeto:
```Bash
mvn clean install
```

6. (Opcional) Se você deseja executar testes de unidade, execute o comando mvn test:
```Bash 
mvn test
```

7. Para executar a classe principal do seu projeto, utilize o comando mvn exec:java:
```Bash
mvn exec:java -Dexec.mainClass=br.com.exemplo.Main
```
