import java.util.Stack;

/** 
 * Problema: 6818. Los Últimos Serán Los Primeros
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 02/11/2026 
 * Descripción: Estructura de apoyo que gestiona el orden de llegada mediante una pila.
 */
public class PilaNombres {
    private Stack<String> pila;

    /**
     * Constructor para inicializar la pila de nombres.
     */
    public PilaNombres() {
        this.pila = new Stack<>();
    }

    /**
     * Registra el nombre de un participante que cruza la meta.
     * 
     * @param nombre Nombre del competidor.
     */
    public void registrarLlegada(String nombre) {
        pila.push(nombre);
    }

    /**
     * Imprime los competidores desde el último que llegó hasta el primero.
     */
    public void mostrarGanadores() {
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}