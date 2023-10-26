import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        int nota = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("EJERCICIO TEST");

        String[] preguntas = {
                "1. Para que sirve la funcion for? \n a) Bucle \n b) Condicional",
                "2. Para que sirve la funcion if? \n a) Bucle \n b) Condicional",
                "3. Para que sirve la funcion while? \n a) Bucle \n b) Condicional",
                "4. De que tipo es una variable String? \n a) Enteros \n b) Caracteres",
                "5. De que tipo es una variable int? \n a) Enteros \n b) Decimales",
                "6. Que es necesario para importar una clase? \n a) import \n b) public class",
                "7. Con que sintaxis pones comentarios? \n a) // \n b) @",
                "8. Es obligatorio tener una clase en java para poder ejecutar el codigo ? \n a) Si \n b) No",
                "9. Cual es el error mas comun? \n a) No poner el ; \n b) No crear la clase main",
                "10. Quien es el creador de Google? \n a) James Gosling \n b) Mi padre ",

        };

        String[] respuestas = {
                "a",
                "b",
                "a",
                "b",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
        };

        for (int i = 0; i < 10; i++) {
            System.out.println(preguntas[i]);
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase(respuestas[i])) {
                nota++;
            }
        }

        System.out.println("Tu nota es: " + nota);
        
    }
}