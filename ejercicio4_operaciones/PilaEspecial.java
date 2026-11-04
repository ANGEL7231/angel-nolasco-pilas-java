import java.util.Stack;

/** 
 * Problema: 1019. Operaciones con una pila
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 02/11/2026 
 * Descripción: Pila personalizada que implementa las reglas mete(a) y saca(a).
 */
public class PilaEspecial {
    private Stack<Integer> pila;

    /**
     * Constructor que inicializa la pila.
     */
    public PilaEspecial() {
        this.pila = new Stack<>();
    }

    /**
     * Procesa un número aplicando 'mete(a)' si el tamaño es menor a 'a', o 'saca(a)' si es igual o mayor.
     * 
     * @param a Entero indicativo para realizar la regla.
     */
    public void procesarNumero(int a) {
        if (pila.size() < a) {
            pila.push(a); // Ejecuta mete(a)
        } else {
            // Ejecuta saca(a)
            for (int i = 0; i < a; i++) {
                if (!pila.isEmpty()) {
                    pila.pop();
                }
            }
        }
    }

    /**
     * Imprime el número total de elementos y su contenido en orden de extracción.
     */
    public void imprimirResultado() {
        System.out.println(pila.size());

        // Inversión mediante una pila auxiliar para imprimir en orden de salida
        Stack<Integer> auxiliar = new Stack<>();
        while (!pila.isEmpty()) {
            auxiliar.push(pila.pop());
        }

        while (!auxiliar.isEmpty()) {
            System.out.print(auxiliar.pop() + (auxiliar.isEmpty() ? "" : " "));
        }
        System.out.println();
    }
}