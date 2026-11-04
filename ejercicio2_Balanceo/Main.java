import java.util.Scanner;

/** 
 * Problema: 5308. ()[]{}<>
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 01/11/2026 
 * Descripción: Clase principal para leer la cadena e imprimir los reemplazos necesarios.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNext()) return;

        String cadenaEntrada = scanner.next();
        int resultado = AnalizadorBalanceo.calcularMinimosReemplazos(cadenaEntrada);

        if (resultado == -1) {
            System.out.println("imposible");
        } else {
            System.out.println(resultado);
        }

        scanner.close();
    }
}