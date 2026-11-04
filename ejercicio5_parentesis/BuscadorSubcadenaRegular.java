import java.util.Stack;

/** 
 * Problema: 3878. Paréntesis Regulares
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 02/11/2026 
 * Descripción: Lógica para calcular la mayor longitud de subcadena regular y su frecuencia.
 */
public class BuscadorSubcadenaRegular {

    /**
     * Encuentra la subcadena regular más larga y cuenta cuántas existen con esa misma longitud.
     * 
     * @param s Cadena con paréntesis.
     * @return Arreglo de 2 posiciones: [longitud_máxima, cantidad_subcadenas].
     */
    public static int[] encontrarMaximoYFrecuencia(String s) {
        int n = s.length();
        Stack<Integer> pilaIndices = new Stack<>();
        pilaIndices.push(-1); // Centinela base para rangos

        int longitudMaxima = 0;
        int cantidadSubcadenas = 1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                pilaIndices.push(i);
            } else {
                pilaIndices.pop();

                if (!pilaIndices.isEmpty()) {
                    int longitudActual = i - pilaIndices.peek();
                    if (longitudActual > longitudMaxima) {
                        longitudMaxima = longitudActual;
                        cantidadSubcadenas = 1; // Se resetea el contador al hallar un nuevo máximo
                    } else if (longitudActual == longitudMaxima && longitudActual > 0) {
                        cantidadSubcadenas++; // Se incrementa si vuelve a repetirse la longitud
                    }
                } else {
                    pilaIndices.push(i); // Actualiza la base para la siguiente subcadena
                }
            }
        }

        if (longitudMaxima == 0) {
            return new int[]{0, 1};
        }

        return new int[]{longitudMaxima, cantidadSubcadenas};
    }
}