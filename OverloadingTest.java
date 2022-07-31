public class OverloadingTest {
    public static void main(String[] args) {
        mymath3 mm = new mymath3();
        System.out.println(mm.add(3,3));
        System.out.println(mm.add(3,3L));
        System.out.println(mm.add(3L,3));
        System.out.println(mm.add(3L,3L));
        int[] a = {100, 200, 399};
        System.out.println(mm.add(a));
    }
}

class mymath3{
    //인자가 들어가고 메서드 내에서 인스턴스변수의 선언이 없다면 (기본연산만 진행한다면) 클래스 메서드로 간주가 가능하다
    static int add(int a, int b){
        System.out.println("int add(int a, int b) : ");
        return a+b;
    }
    static long add(int a, long b){
        System.out.println("int add(int a, long b) : ");
        return a+b;
    }
    static long add(long a,int b){
        System.out.println("int add(long a, int b) : ");
        return a+b;
    }
    static long add(long a,long b){
        System.out.println("int add(long a, long b) : ");
        return a+b;
    }
    //아래의 메서드는 인스턴스 메서드이다
    int add(int[] a){
        System.out.println("int add(int[] a) : ");
        int result = 0;
        for(int i =0; i<a.length;i++){
            result +=a[i];
        }
        return result;
    }
}//class end.
