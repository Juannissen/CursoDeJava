
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String Nombre;
    int Edad;
    double Salario;
    boolean Carnet;

    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese su nombre.");
    Nombre = s.nextLine();

    System.out.println("Ingrese su edad.");
    Edad = s.nextInt();

    System.out.println("Ingrese lo que le gustaría ganar por mes, y que sea con centavos.");
    Salario = s.nextDouble();

    System.out.println("¿Posee usted un carnet?.\n * Ingrese (true) si posee un carnet.\n * Ingrese (false) si no posee un carnet.");
    Carnet = s.nextBoolean();


        if (Carnet == true)
        {
            System.out.println("* Su nombre es: " + Nombre);
            System.out.println("* Su edad es: " + Edad);
            System.out.println("* Su salario deseado es: " + Salario);
            System.out.println("* Usted posee un Carnet valido");
        }
        else if (Carnet)
        {
            System.out.println("Usted no posee un carnet");

        }
    }
}