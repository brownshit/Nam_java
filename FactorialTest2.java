public class FactorialTest2 {
    static long factorial(int n){
        if(n<=0||n>20) return -1;//false값을 반환
        if(n<=1) return 1;
        return n*factorial(n-1);

    }

    public static void main(String[] args) {
        int n = 21;
        long result = 0;
        //더 많은 범위의 수를 표현하기 위해 long자료형을 사용하였다.
        for(int i = 1; i<=n; i++)
        {
            result = factorial(i);
            if(result == -1){
                System.out.println("Stack Overflow");
                break;
            }

            System.out.printf("%2d! = %20d\n", i, result);
        }
    }
}
