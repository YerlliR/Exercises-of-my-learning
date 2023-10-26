public class Ex4 {


    public static void main(String[] args) {

        int[][] marco;

        marco = new int[8][6];
        for (int i = 0; i < 8; i++){
            for (int x = 0;x < 6; x++){
                marco[i][x] = 0;
            }
        }

        marco[0][0] = 1;
        marco[0][5] = 1;
        marco[7][0] = 1;
        marco[7][5] = 1;

        System.out.println("-------------------------");
        for (int i = 0; i < 8; i++){
            System.out.print("| ");
            for (int x = 0;x < 6; x++){
                System.out.print(marco[i][x] + " | ");
            }
            System.out.println();
            System.out.println("-------------------------");
        }
    }
}



