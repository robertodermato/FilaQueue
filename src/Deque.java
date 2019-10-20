        //Um Deque é uma estrutura de dados similar a uma fila que suporta inserção e remoção
        //tanto em seu final, quanto em seu início, e possui os métodos listados abaixo. Implemente
        //um deque usando duas pilhas como atributos para armazenar os seus elementos. Depois
        //teste se a sua implementação está correta instanciando e manipulando um deque.

        import java.util.ArrayList;

        public class Deque {

    int tamanho;
    ArrayStack cabeca;
    ArrayStack cauda;

    public Deque(){
        tamanho=0;
        cabeca = new ArrayStack();
        cauda = new ArrayStack();
    }
    //insere o elemento e no começo do deque.
    public void addFirst(Integer e){
        cabeca.push(e);
        tamanho++;
    }

    //insere o elemento e no final do deque.
    public void addLast(Integer e){
        cauda.push(e);
        tamanho++;
    }

    // remove e retorna o elemento e do início do deque, e ocorre um erro se o deque estiver vazio.
   // public Integer removeFirst(){}

    // remove e retorna o elemento e do final do deque, e ocorre um erro se o deque estiver vazio.
    //public Integer removeLast(){}

    // retorna, mas não remove, o primeiro elemento do deque, e ocorre um erro se o deque estiver vazio.
    //public Integer getFirst(){}

    // retorna, mas não remove, o último elemento do deque, e ocorre um erro se o deque estiver vazio.
    //public Integer getLast(){}

    //retorna o número de elementos da fila.
    public int size(){
        return tamanho;
    }

    //retorna true se a fila estiver vazia, e false caso contrário
    public boolean isEmpty(){
        return tamanho==0;
    }


}
