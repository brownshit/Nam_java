class mymath2{
    long a; long b;

    //인스턴스 변수를 사용했기에(선언된 변수) static을 사용할 수 없다.
    long add(){return a+b;}
    long subtract(){return a-b;}
    long multifly(){return a*b;}
    double divide(){return a/b;}

    //인스턴스 변수를 사용하지 않고, 매개변수만을 사용하였다.
    static long add(long a, long b){return a+b;}
    static long subtract(long a, long b){return a-b;}
    static long multifly(long a, long b){return a*b;}
    static double divide(double a, double b){return a/b;}

}
public class MyMathTest2 {
    public static void main(String[] args) {

        //클래스 매서드 호출_인스턴스를 생성하지 않아도 된다.
        System.out.println(mymath2.add(200L,100L));
        System.out.println(mymath2.subtract(200L,100L));
        System.out.println(mymath2.multifly(200L,100L));
        System.out.println(mymath2.divide(200.0,100.0));

        //인스턴스 생성
        mymath2 mm = new mymath2();
        mm.a = 200L; mm.b = 100L;

        //인스턴스 메서드를 통해서는 객체를 생성한 후에만 호출이 가능하다.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multifly());
        System.out.println(mm.divide());
    }

}
