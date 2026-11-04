import java.util.Scanner;

/** 
 * Problema: 8672. Sumando con pilas
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 02/11/2026 
 * Descripción: Clase ejecutable para procesar los comandos de la entrada estándar.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        PilaAritmetica pilaAritmetica = new PilaAritmetica();

        for (int i = 0; i < n; i++) {
            String operacion = scanner.next();

            if (operacion.equals("AGREGA")) {
                int valor = scanner.nextInt();
                pilaAritmetica.agrega(valor);
            } else if (operacion.equals("CONSUME")) {
                pilaAritmetica.consume();
            } else if (operacion.equals("IMPRIME")) {
                pilaAritmetica.imprime();
            }
        }

        scanner.close();
    }
}