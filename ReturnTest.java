public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3,5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3,5,result2);
        System.out.println(result2[0]);
    }

    //메소드의 오버로딩
    int add(int i1, int i2) {
        return i1 + i2;
    }
    void add(int i1, int i2, int[] result_add2){
        result_add2[0] = i1+i2;
        //매개변수로 전달받은 배열에 연산 결과를 저장한다,
    }
}
