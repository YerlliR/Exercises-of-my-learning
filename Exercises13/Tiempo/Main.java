import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime cuantas horas tiene el tiempo que deseas");
        int horas = scanner.nextInt();
        System.out.println("Dime cuantos minutos tiene el tiempo que deseas");
        int minutos = scanner.nextInt();
        System.out.println("Dime cuantos segundos tiene el tiempo que desaeas");
        int segundos = scanner.nextInt();

        Tiempo tiempoPrincipal = new Tiempo(horas, minutos, segundos);

        while(true){
            System.out.println("Cual de estas opciones quieres realizar con el tiempo seleccionado");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            int eleccion = scanner.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println(sumar(tiempoPrincipal));
                    break;
                case 2:
                    System.out.println(restar(tiempoPrincipal));
                    break;
                default:
                    System.exit(0);
                    break;
            }

        }

    }

    public static Tiempo sumar(Tiempo principal){
        System.out.println("Dime cuantas horas tiene el tiempo que quieres sumar al tiempo principal");
        int horas = scanner.nextInt();
        System.out.println("Dime cuantos minutos tiene el tiempo que quieres sumar al tiempo principal");
        int minutos = scanner.nextInt();
        System.out.println("Dime cuantos segundos tiene el tiempo que quieres sumar al tiempo principal");
        int segundos = scanner.nextInt();

        Tiempo tiempoFinal = new Tiempo(principal.horas + horas,principal.minutos + minutos, principal.segundos + segundos);

        if (tiempoFinal.segundos >= 60){
            tiempoFinal.segundos = tiempoFinal.segundos - 60;
            tiempoFinal.minutos = tiempoFinal.minutos + 1;
        }

        if (tiempoFinal.minutos >= 60){
            tiempoFinal.minutos = tiempoFinal.minutos - 60;
            tiempoFinal.horas = tiempoFinal.horas + 1;
        }

        System.out.println("El tiempo sumado es: ");

        return tiempoFinal;
    }


    public static Tiempo restar(Tiempo principal){
        System.out.println("Dime cuantas horas tiene el tiempo que quieres  restar al tiempo principal");
        int horas = scanner.nextInt();
        System.out.println("Dime cuantos minutos tiene el tiempo que quieres  restar al tiempo principal");
        int minutos = scanner.nextInt();
        System.out.println("Dime cuantos segundos tiene el tiempo que quieres restar al tiempo principal");
        int segundos = scanner.nextInt();

        Tiempo tiempoFinal = new Tiempo(principal.horas - horas,principal.minutos - minutos, principal.segundos - segundos);

        if (horas > principal.horas){
            tiempoFinal.horas = 0;
            tiempoFinal.minutos = 0;
            tiempoFinal.segundos = 0;
        }

        if (minutos > principal.minutos){
            tiempoFinal.horas = tiempoFinal.horas - 1;
            tiempoFinal.minutos = 60 - (minutos - principal.minutos);

        }

        if (segundos > principal.segundos){
            tiempoFinal.minutos = tiempoFinal.minutos - 1;
            tiempoFinal.segundos = 60 - (segundos - principal.segundos);
        }

        return tiempoFinal;
    }


}
