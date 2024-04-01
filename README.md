# Calculadora de IMC

Esta é uma aplicação simples em Java para calcular o Índice de Massa Corporal (IMC) de uma pessoa e classificá-lo de acordo com os padrões comuns de classificação de IMC.

## Como usar

1. Clone este repositório:

```shell
git clone https://github.com/Bianca-Michels-Barcelos/calculadora-imc.git
```

2. Navegue até o diretório do projeto:

```shell
cd calculadora-imc
```

3. Compile os arquivos Java:

```shell
javac src/main/java/com/bianca/*.java
```

4. Navegue até o diretório que contém os arquivos compilados:

```shell
cd src/main/java
```

5. Execute o programa principal:

```shell
java com.bianca.Main
```

6. Siga as instruções fornecidas no terminal para inserir seu nome, altura e peso.

7. Após inserir os dados, o programa calculará o seu IMC e o classificará de acordo com os padrões estabelecidos.

## Estrutura do projeto

O projeto é composto por dois arquivos Java:

- `CalculadoraImc.java`: Contém a definição da classe `CalculadoraImc`, que é responsável por calcular o IMC com base no nome, altura e peso fornecidos.

- `Main.java`: Contém o método `main` que inicia a aplicação, solicitando ao usuário seu nome, altura e peso, e exibindo o resultado do IMC.

## Exemplo de Uso

Aqui está um exemplo de uso da aplicação:

```shell
Digite o seu nome: 
Maria
Digite a sua altura: 
1.60
Digite o seu peso: 
40
O IMC de Maria é: 15.625000.

Classificado no grau: 0 - Magreza.
```

Após inserir os dados solicitados, o programa exibirá o resultado do IMC e sua classificação.

## Autor

Esta aplicação foi desenvolvida por [Bianca Barcelos](https://github.com/Bianca-Michels-Barcelos).

## Finalidade

Projeto desenvolvido para a disciplina de Gerência de Configuração do curso de Engenharia de Software da Unigran, solicitado pelo professor André Martins Do Nascimento.
