public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;//인스턴스 변수에 클래스 변수 넣기가 가능
    static int cv2 = new MemberCall().iv;

    static void staticMethod_1(){
        System.out.println(cv);
        //System.out.println(iv);     클래스메서드에서 인스턴스 변수 사용불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod_1(){
        System.out.println(cv);
        System.out.println(iv);//인스턴스 메서드에서는 인스턴스 변수를 바로 사용이 가능하다.
    }

    static void staticMethod_2(){
        staticMethod_1();//클래스 매서드
        //intstanceMethod_1();      클래스매서드에서는 인스턴스 매서드의 직접적인 선언이 불가하다. 객체를 생성해주는 과정필요.
        MemberCall c = new MemberCall();
        c.instanceMethod_1();
    }

    void instanceMethod_2(){
        staticMethod_1();
        instanceMethod_1();
    }

    public static void main(String[] args) {
        MemberCall m1 = new MemberCall();
        //인스턴스 메서드
        m1.instanceMethod_1();
        m1.instanceMethod_2();
        //클래스 매서드
        MemberCall.staticMethod_1();
        MemberCall.staticMethod_2();

    }
}
