import java.util.*;//scanner클래스를 이용하기 위한 구문 추가
public class scannerEx {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine(); //scanner 객체를 이용한 입력받는 메소드
        int num = Integer.parseInt(input);// 입력받은 문자열을 숫자로 변환

        System.out.println("입력내용 : "+input);//얘는 nextLine메소드를 이용하여 문자열을 받아온것
        System.out.printf("num = %d\n",num);//얘는 parseInt()메소드를 이용하여 정수로 변환한 것.
    }
}
