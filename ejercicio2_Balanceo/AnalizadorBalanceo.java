import java.util.Stack;

/** 
 * Problema: 5308. ()[]{}<>
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 01/11/2026 
 * Descripción: Módulo que analiza el número mínimo de reemplazos para equilibrar la cadena agrupada.
 */
public class AnalizadorBalanceo {

    /**
     * Determina si el carácter dado es un símbolo de apertura.
     * 
     * @param c Carácter a verificar.
     * @return true si es símbolo de apertura.
     */
    public static boolean esApertura(char c) {
        return (c == '(' || c == '[' || c == '{' || c == '<');
    }

    /**
     * Verifica si una pareja de caracteres de apertura y cierre corresponden al mismo tipo.
     * 
     * @param apertura Símbolo de apertura.
     * @param cierre Símbolo de cierre.
     * @return true si hacen pareja correcta.
     */
    public static boolean coinciden(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '[' && cierre == ']') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '<' && cierre == '>');
    }

    /**
     * Calcula la cantidad mínima de reemplazos necesarios para balancear la cadena.
     * 
     * @param cadena Cadena de caracteres a analizar.
     * @return Número de reemplazos mínimos, o -1 si es imposible balancearla.
     */
    public static int calcularMinimosReemplazos(String cadena) {
        int n = cadena.length();
        if (n % 2 != 0) return -1; // Longitud impar no se puede balancear

        Stack<Character> pilaAperturas = new Stack<>();
        int cantidadReemplazos = 0;

        for (int i = 0; i < n; i++) {
            char c = cadena.charAt(i);

            if (esApertura(c)) {
                pilaAperturas.push(c);
            } else {
                if (pilaAperturas.isEmpty()) return -1;

                char aperturaTop = pilaAperturas.pop();
                // Si no corresponden al mismo tipo de paréntesis, se requiere un reemplazo
                if (!coinciden(aperturaTop, c)) {
                    cantidadReemplazos++;
                }
            }
        }

        return pilaAperturas.isEmpty() ? cantidadReemplazos : -1;
    }
}