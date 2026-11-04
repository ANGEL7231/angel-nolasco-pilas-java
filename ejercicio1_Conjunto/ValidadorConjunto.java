/** 
 * Problema: 4086. Conjunto
 * Autor:Angel de Jesus Nolasco Rivera
 * Grupo: GTID244
 * Fecha: 01/11/2026 
 * Descripción: Clase encargada de validar la pertenencia al conjunto S.
 */
public class ValidadorConjunto {

    /**
     * Valida si una cadena cumple con los caracteres de S ('a'-'d') y paréntesis balanceados.
     * 
     * @param cadena Cadena de texto a evaluar.
     * @return true si la cadena pertenece a S, false en caso contrario.
     */
    public static boolean esValida(String cadena) {
        int contadorParentesis = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Caracteres 'a', 'b', 'c', 'd' son permitidos
            if (caracter >= 'a' && caracter <= 'd') {
                continue;
            } else if (caracter == '(') {
                contadorParentesis++; // Suma al encontrar paréntesis de apertura
            } else if (caracter == ')') {
                contadorParentesis--; // Resta al encontrar paréntesis de cierre
                if (contadorParentesis < 0) {
                    return false; // Cierre sin apertura correspondiente
                }
            } else {
                return false; // Carácter no válido
            }
        }

        return contadorParentesis == 0;
    }
}