# learning-java

> Minha jornada pessoal aprendendo Java, um exercício por vez.

![Java](https://img.shields.io/badge/Java-learning-red?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20evolucao-blue?style=for-the-badge)
![Focus](https://img.shields.io/badge/foco-fundamentos%20%2B%20POO-green?style=for-the-badge)

Este repositório reúne pequenos projetos, exercícios de lógica e primeiros passos com programação orientada a objetos em Java. A ideia aqui é registrar a evolução de forma simples, prática e incremental: cada pasta representa uma etapa do aprendizado.

## Sumario

- [Sobre o repositório](#sobre-o-repositorio)
- [Projetos](#projetos)
- [Conceitos praticados](#conceitos-praticados)
- [Como executar](#como-executar)
- [Estrutura](#estrutura)
- [Proximos passos](#proximos-passos)

## Sobre o repositorio

Aqui você vai encontrar exemplos pequenos, feitos para treinar fundamentos importantes:

- entrada e saída de dados;
- variáveis, tipos primitivos e operadores;
- condicionais e laços de repetição;
- uso de `Scanner` e `JOptionPane`;
- geração de números aleatórios;
- criação de classes, atributos, métodos e construtores;
- encapsulamento com getters e setters;
- composição entre classes.

## Projetos

| Pasta | Tema | O que pratica |
| --- | --- | --- |
| [`Project1`](./Project1) | Primeiros programas | Soma de números, entrada pelo terminal e janelas com `JOptionPane` |
| [`Project2`](./Project2) | Jogo de dados | `Random`, laços, tentativas, validação e interação com o usuário |
| [`2-list-exercise`](./2-list-exercise) | Lista de exercícios | Condicionais, cálculos, conversões e pequenos problemas do dia a dia |
| [`Project3`](./Project3) | Conta bancária | POO, classes, objetos, construtores, getters, setters e relacionamento com `Client` |

## Conceitos praticados

```text
Fundamentos Java
├── Sintaxe básica
├── Variáveis e operadores
├── Entrada e saída
├── Condicionais
├── Repetição
├── Métodos
└── Programação Orientada a Objetos
    ├── Classes e objetos
    ├── Atributos privados
    ├── Construtores
    ├── Getters e setters
    ├── toString()
    └── Composição entre classes
```

## Como executar

Você precisa ter o Java instalado. Para verificar:

```bash
java -version
javac -version
```

Compile e execute um projeto específico:

```bash
javac -d /tmp/learning-java-classes Project3/src/*.java
java -cp /tmp/learning-java-classes App
```

Outro exemplo, executando o jogo de dados:

```bash
javac -d /tmp/learning-java-classes Project2/src/*.java
java -cp /tmp/learning-java-classes Jogo
```

> Alguns exercícios usam `JOptionPane`, então podem abrir janelas para receber dados.

## Estrutura

```text
learning-java/
├── Project1/
│   └── src/
│       ├── App.java
│       ├── App2.java
│       └── App3.java
├── Project2/
│   └── src/
│       └── Jogo.java
├── Project3/
│   └── src/
│       ├── App.java
│       ├── BankAccount.java
│       └── Client.java
├── 2-list-exercise/
│   └── src/
│       ├── ex1.java
│       ├── ex2.java
│       ├── ex3.java
│       └── ex4.java
└── README.md
```

## Proximos passos

- Melhorar a organização dos pacotes Java.
- Padronizar nomes de classes seguindo convenções Java, como `Ex1`, `Ex2`, `BankAccount`.
- Separar arquivos compilados dos arquivos fonte.
- Adicionar mais exercícios de POO.
- Criar pequenos testes para validar comportamentos.
- Evoluir o projeto bancário com saque, depósito, validações e histórico de transações.

---

Feito como registro de estudo, prática e evolução constante em Java.
