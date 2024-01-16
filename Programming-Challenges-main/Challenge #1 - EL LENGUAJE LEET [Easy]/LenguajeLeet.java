import java.util.Scanner;

public class LenguajeLeet {

    public static void main(String[] args) {
        String frase;
        StringBuilder leet = new StringBuilder("");

        Scanner scanner = new Scanner(System.in);

        String [] hack = {"4", "B", "<", "|)", "3", "|=", "6", "|-|", "1", "|", "X", "1", "^^", "И", "0", "|>", "Q", "|2", "5", "7", "|_|", "|/", "VV", "><", "Y", "2"};
        char [] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        System.out.println("Dime el texto que quieras que traduzca a leet");

        frase = scanner.next();

        frase = frase.toUpperCase();

        char[] sep = frase.toCharArray();

        for (int i = 0; i < frase.length(); i++){
            char temp = sep[i];
            for (int x = 0; x < abc.length; x++){
                if (temp == abc[x]){
                    leet.append(hack[x]);
                }
            }
        }
        System.out.println(leet);
    }
}
