import java.util.*;

public class MultiArrEx1 {
    public static void main(String[] args){
        final int Size = 10;
        int x = 0; int y = 0;

        char[][] board = new char[Size][Size];
        byte[][] shipboard = {
                {0,1,0,1,0,1,0,1,0,0},
                {0,1,0,0,0,0,0,1,0,0},
                {1,0,0,0,0,0,0,1,0,0},
                {0,1,0,1,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,0,1},
                {1,1,0,0,0,0,0,0,1,0},
                {0,1,0,1,0,0,0,1,0,0},
                {0,0,0,0,0,1,0,0,0,0},
                {0,0,0,1,0,1,0,0,0,0},
                {0,1,0,1,0,0,0,1,0,0}
        };
        for(int i =1; i<Size; i++){
            board[0][i] = board[i][0] = (char)(i+'0');
        }
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("좌표를 입력하세요.(종료는 00)>");
            String input = scanner.nextLine();

            if(input.length() == 2){
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                if(x == 0&&y==0) break;//x 와 y 가 모두 0인경우 종료
            }
            if(input.length()!=2 || x<=0||x>=Size||y<=0||y>=Size){
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }
            board[x][y] = shipboard[x-1][y-1] == 1? 'O':'X';

            for(int i = 0; i<Size; i++)
            {
                System.out.println(board[i]);
            }
            System.out.println();
        }
    }
}
