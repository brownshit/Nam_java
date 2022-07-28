class Data{int x;}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = "+d.x);

        change(d);
        System.out.println("After change(d.x)");
        System.out.println();
        System.out.println("main() : x = "+d.x);

    }

    //static void change(int x) {//기본형 매개변수 값을 읽어오는건 가능하지만 값 변경이 어렵다
    static void change(Data d) {//참조형 매개변수 값을 변경할수 있다. 메소드를 통해
        d.x = 1000;
        System.out.println("change() : x = "+d.x);

    }

}
