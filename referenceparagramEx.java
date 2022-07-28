public class referenceparagramEx {
    public static void main(String[] args) {
        int[] x = {10};
        //위와같이 선언하면 1의 크기를 가진 int형배열(참조형) x[0] = 10 이 선언된다.
        System.out.println("main : x = "+ x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main : x = "+ x[0]);

    }
    static void change(int[] x){
        x[0] = 1000;
        System.out.println("change() : x = "+x[0]);
    }
}
