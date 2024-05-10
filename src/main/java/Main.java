/* 4.- Lea un valor entero positivo y compruebe si el número tiene la cifra 3 entre sus cifras. El codigo debe escribir ENCONTRADO, si contiene el 3 y NO ENCONTRADO en caso contrario.
Sacchetti Maria Giselle C2*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int numero = input.nextInt();

        boolean encontrado = false;

        
        while (numero > 0) {
            int digito = numero % 10;
            if (digito == 3) {
                encontrado = true;
                break; 
            }
            numero /= 10;
        }

        if (encontrado) {
            System.out.println("encontrado");
        } else {
            System.out.println("no encontrado");
        }

        input.close();
    }
}
