//        Expressões aritméticas podem conter vários pares de símbolos agrupados, e para cada
//        símbolo de abertura deve corresponder um símbolo de fechamento. Por exemplo:
//        ( ) { [ ( ) ] } [ ( ) ( ) ]. Implemente um método que recebe uma string que contém um grupo
//        de símbolos e, usando uma pilha, verifica se o grupo contém apenas símbolos “casados”
//        corretamente, isto é, para cada abertura há um fechamento. Se houver apenas símbolos
//        “casados”, o método retorna true, senão retorna false. Depois teste se a sua
//        implementação está correta chamando o método implementado enviando diferentes
//        parâmetros de entrada.


public class TestaSimbolosCasados {

    public static void main(String[] args) {

        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("{[()]}[](){()}");
        imprimeResultado("{[(]}[](){()}");
        imprimeResultado("A + B + C - D)");
    }

    public static void imprimeResultado(String expressao){
        System.out.println(expressao + " está balanceado? " +
                verificaSimbolosBalanceados(expressao));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificaSimbolosBalanceados(String expressao){

        ArrayStackChar pilha = new ArrayStackChar();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()){
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1){
                pilha.push(simbolo);

            } else if (FECHA.indexOf(simbolo) > -1){

                if (pilha.isEmpty()){
                    return false;
                } else {
                    topo = pilha.pop();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }

            index++;
        }

        return true;
    }
}
