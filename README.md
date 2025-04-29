# Lista Encadeada Circular em Java

Este projeto implementa uma estrutura de **lista encadeada circular** em Java, com funcionalidades de **inserção**, **remoção** e **exibição** dos elementos. O programa é interativo via console e oferece um menu simples para manipulação da lista.

## Funcionalidades

- Inserir elementos inteiros no final da lista.
- Remover elementos inteiros da lista.
- Exibir todos os elementos da lista.

## O que é uma Lista Encadeada Circular?

É uma variação da lista encadeada tradicional onde:
- O último nó aponta para o primeiro, formando um ciclo.
- Não há `null` no ponteiro do último elemento.

## Exemplo de uso

Boas-vindas!

Lista: 20 21 35

Escolha sua opção:
[ 1 ] Remover um número
[ 2 ] Adicionar um número
[ 3 ] Sair
Sua opção: 2
Digite o número a ser adicionado: 42s

Lista: 20 21 35 42

## Implementação

Classe `ListaEncadeadaCircular` contém:

- Uma classe interna `No`, representando os nós da lista.
- Métodos:
  - `insere(int dado)` – adiciona um novo nó ao final da lista.
  - `remove(int numero)` – remove a primeira ocorrência do número especificado.
  - `imprime()` – exibe todos os elementos da lista circular.
  - `vazia()` – verifica se a lista está vazia.
