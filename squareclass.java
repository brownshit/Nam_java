import java.util.*;
public class squareclass {
    public static void main(String[] args)
    {
        String l1; int l2;
        int square;
        Scanner sc = new Scanner(System.in);
        System.out.print("두 변의 입력>");
        l1 = sc.nextLine();
        int num1 = Integer.parseInt(l1);
        l2 = sc.nextInt();
        square = num1*l2;
        System.out.printf("%d * %d = %d", num1, l2, square);
    }
}
