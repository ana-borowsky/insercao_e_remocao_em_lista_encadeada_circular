package insercao_e_remocao_em_lista_encadeada_circular;
import java.util.Scanner;

public class ListaEncadeadaCircular {
    class No {
        int dado;
        No proximo;

        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    No inicio = null;

    public boolean vazia() {
        return inicio == null;
    }

    public void insere(int dado) {
        No novoNo = new No(dado);
        if (vazia()) {
            inicio = novoNo;
            inicio.proximo = inicio;
        } else {
            No atual = inicio;
            while (atual.proximo != inicio) { 
                atual = atual.proximo;
            }
            atual.proximo = novoNo;        
            novoNo.proximo = inicio;       
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Lista vazia!");
        } else {
            System.out.print("\nLista: ");
            No atual = inicio;
            do {                             
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            } while (atual != inicio);     
            System.out.println();
        }
    }

    public void remove(int numero) {
        if (!vazia()) {
            No atual = inicio;
            No anterior = null;

            do {
                if (atual.dado == numero) {
                    if (atual == inicio) {
                        if (inicio.proximo == inicio) { 
                            inicio = null;
                        } else {
                            No ultimo = inicio;
                            while (ultimo.proximo != inicio) { 
                                ultimo = ultimo.proximo;
                            }
                            inicio = inicio.proximo;     
                            ultimo.proximo = inicio;     
                        }
                    } else {
                        anterior.proximo = atual.proximo; 
                    }
                    return;
                }
                anterior = atual;
                atual = atual.proximo;
            } while (atual != inicio); 
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Boas-vindas!");

        boolean continuaPrograma = true;
        ListaEncadeadaCircular lista = new ListaEncadeadaCircular();
        lista.insere(20);
        lista.insere(21);
        lista.insere(35);

        while (continuaPrograma) {
            if (!lista.vazia()) lista.imprime();
            else System.out.println("A lista está vazia.");

            System.out.println("\nEscolha sua opção: ");
            System.out.println("[ 1 ] Remover um número");
            System.out.println("[ 2 ] Adicionar um número");
            System.out.println("[ 3 ] Sair");
            System.out.print("Sua opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número a ser removido: ");
                    int numeroParaRemover = Integer.parseInt(scanner.nextLine());
                    lista.remove(numeroParaRemover);
                    break;

                case 2:
                    System.out.print("Digite o número a ser adicionado: ");
                    int numeroParaAdicionar = Integer.parseInt(scanner.nextLine());
                    lista.insere(numeroParaAdicionar);
                    break;

                default:
                    System.out.println("Obrigada por usar o programa!");
                    continuaPrograma = false;
                    break;
            }
        }

        scanner.close();
    }
}