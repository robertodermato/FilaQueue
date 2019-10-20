
public class App {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        LinkedQueue novaFila = queue.furaFila(queue, 1);

        while (!novaFila.isEmpty()) {
            Integer aux = novaFila.dequeue(); // remove da fila
            System.out.println(aux); // imprime
                    }

        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            System.out.println("oi");
            System.out.println(stack.pop());
        }


    }
}
