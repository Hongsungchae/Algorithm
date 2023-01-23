import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chess[] = {1, 1, 2, 2, 2, 8};
        int findChess[] = new int[chess.length];

        for(int i =0; i< chess.length; i++){
            findChess[i] = sc.nextInt();
        }

        for(int i =0; i < chess.length; i++){
            System.out.printf("%d ", chess[i]- findChess[i] );
        }
    }
}