import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        String numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el numero que quieres que te diga la longitud");
        numero = scanner.next();

        if (numero.length() > 6){
            System.out.println("Este numero tiene mas de 6 digitos");

        }else{
            System.out.println("Este numero tiene " + numero.length() + " digitos");
        }

    }

    }
}
