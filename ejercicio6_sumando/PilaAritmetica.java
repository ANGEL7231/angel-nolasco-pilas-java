import java.util.Stack;

/** 
 * Problema: 8672. Sumando con pilas
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 02/11/2026 
 * Descripción: Modulo que administra las operaciones de adición, consumo e impresión.
 */
public class PilaAritmetica {
    private Stack<Integer> pila;

    /**
     * Constructor para inicializar la pila.
     */
    public PilaAritmetica() {
        this.pila = new Stack<>();
    }

    /**
     * Inserta un elemento entero al tope de la pila.
     * 
     * @param valor Número a agregar.
     */
    public void agrega(int valor) {
        pila.push(valor);
    }

    /**
     * Extrae los dos últimos elementos, calcula su suma y coloca el resultado en la pila.
     */
    public void consume() {
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
    }

    /**
     * Imprime en consola el último elemento en la pila sin removerlo.
     */
    public void imprime() {
        System.out.println(pila.peek());
    }
}