//Luis Ernesto Silva Rocha 2024-1654U
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3]; // Creamos un array para almacenar los números ingresados

        // Pedimos al usuario que ingrese 3 números enteros
        for (int i = 0; i < 3; i++) {
            numeros[i] = obtenerEntero(scanner, i + 1);
        }

        // Calculamos la suma de los dos números pequeños
        int suma = sumaDosMenores(numeros);
        // Calculamos la diferencia entre los números grandes
        int diferencia = diferenciaDosMayores(numeros);
        // Buscamos el número mayor
        int mayor = mayorNumero(numeros);

        // Mostramos los resultados
        System.out.println("La suma de los numeros menores es: " + suma);
        System.out.println("La diferencia de los numeros mayores es: " + diferencia);
        System.out.println("Numero mayor: " + mayor);
    }

    // Método para obtener un número entero del usuario
    public static int obtenerEntero(Scanner scanner, int indice) {
        while (true) {
            try {
                System.out.print("Ingrese el número entero #" + indice + ": ");
                return scanner.nextInt();
            } catch (Exception e) {
                // Mensaje de error por si el usuario ingresa datos que no van de acuerdo y limpiamos
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.nextLine();
            }
        }
    }

    // Método para calcular la suma de los números pequeños
    public static int sumaDosMenores(int[] numeros) {
        Arrays.sort(numeros); // Ordenamos los números de menor a mayor
        return numeros[0] + numeros[1]; // Devolvemos la suma de los dos primeros números (los más pequeños)
    }

    // Método para calcular la diferencia entre los números más grandes
    public static int diferenciaDosMayores(int[] numeros) {
        Arrays.sort(numeros); // Ordenamos los números de menor a mayor
        return numeros[2] - numeros[1]; // Devolvemos la diferencia entre el último y el segundo número (los más grandes)
    }

    // Método para encontrar el número mayor
    public static int mayorNumero(int[] numeros) {
        int mayor = numeros[0];
        // Iteramos sobre los números en el array para encontrar el mayor
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor; // Devolvemos el número mayor encontrado
    }
}