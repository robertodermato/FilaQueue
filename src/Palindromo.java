//      Implemente um método chamado ehPalindromo que recebe uma String por parâmetro e,
//        obrigatoriamente, usa uma pilha para verificar se esta String é um palíndromo. Se for, o
//        método retorna verdadeiro, caso contrário retorna falso.

public class Palindromo
{
    public static void main(String[] args) {

        imprimeResultado("ADA");

        imprimeResultado("ABCD");

        imprimeResultado("ABCCBA");

        imprimeResultado("Maria");
    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra){

        ArrayStackChar pilha = new ArrayStackChar();

        for (int i=0; i<palavra.length(); i++){
            pilha.push(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.isEmpty()){
            palavraInversa += pilha.pop();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;
    }
}
