import java.util.*;

class Data1{
    int value;
    void printingmethiod(){System.out.println("value [Data1]: "+value);}
}
class Data2{
    int value;
    Data2(int x){   //매개변수가 있는 생성자
        value = x;
    }
    void printingmethod(){
        System.out.println("value [Data2]: "+value);
    }

}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        d1.value = Integer.parseInt(input);
        //위의 라인은 String to int.
        d1.printingmethiod();


        Scanner scanner1 = new Scanner(System.in);
        Data2 d2 = new Data2(scanner1.nextInt());
        d2.printingmethod();
    }
}
