import java.util.Scanner;

/** 
 * Problema: 3878. Paréntesis Regulares
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 02/11/2026  
 * Descripción: Clase ejecutable para mostrar la respuesta del problema Paréntesis Regulares.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNext()) return;

        String entrada = scanner.next();
        int[] resultado = BuscadorSubcadenaRegular.encontrarMaximoYFrecuencia(entrada);

        System.out.println(resultado[0] + " " + resultado[1]);
        scanner.close();
    }
}