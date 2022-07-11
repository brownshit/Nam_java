import java.util.*;
public class Circleclass {
    public static void main(String[] args)
    {
        final double PI = 3.141592;
        double Circle;
        Scanner sc = new Scanner(System.in);
        System.out.printf("반지름 길이 : ");
        int r = sc.nextInt();
        Circle = PI*r*r;
        System.out.printf("원의 넓이 : %f\n", Circle);
    }
}
