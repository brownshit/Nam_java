public class FactorialTestEx {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    /*
    static int factorial(int i) {
        int result = 0;

        if(i == 0)
            result = 1;
        else
            result = i* factorial(i-1);

        return result;
    }
     */

    static int factorial(int i){
        if(i == 1) return 1;
        return i*factorial(i-1);
    }
}
