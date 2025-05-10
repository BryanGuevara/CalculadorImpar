package calculadora.impar;

import java.util.Scanner;

public class CalculadoraImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 1;

        System.out.println("==================================================================================================================");
        System.out.println("______                          _____                                 \n"
                + "| ___ \\                        |  __ \\                                \n"
                + "| |_/ /_ __ _   _  __ _ _ __   | |  \\/_   _  _____   ____ _ _ __ __ _ \n"
                + "| ___ \\ '__| | | |/ _` | '_ \\  | | __| | | |/ _ \\ \\ / / _` | '__/ _` |\n"
                + "| |_/ / |  | |_| | (_| | | | | | |_\\ \\ |_| |  __/\\ V / (_| | | | (_| |\n"
                + "\\____/|_|   \\__, |\\__,_|_| |_|  \\____/\\__,_|\\___| \\_/ \\__,_|_|  \\__,_|\n"
                + "             __/ |                                                    \n"
                + "            |___/                                                     ");
        System.out.println("=================================================== <[Entrada]> ===================================================");

        int calculo = 0;
        boolean valido = false;

        while (!valido) {
            System.out.println("Ingrese el número hasta el cual quiere listar los impares:");
            if (scan.hasNextInt()) {
                calculo = scan.nextInt();
                valido = true;
            } else {
                System.out.println("¡Error! Por favor ingrese un número entero válido.");
                scan.next();
            }
        }

        System.out.println("=================================================== <[Tabla de impares]> =========================================");

        while (numero <= calculo) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }

        System.out.println("\n==================================================================================================================");
    }
}
