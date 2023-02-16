package aplicacion;

import dominio.Ejercicio3;
import java.util.Scanner;
public class Principal {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int base;
        int exponente;
        System.out.println("Introduzca un exponente");
        exponente=sc.nextInt();
        System.out.print("Introduzca el numero del que quiera calcular la base");
        base=sc.nextInt();
        System.out.print(Ejercicio3.potencia(base,exponente));
    }
}
