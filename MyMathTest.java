public class MyMathTest {
    public static void main(String[] args){

        MyMath mm = new MyMath();
        long[] result = new long[3];
        result[0] = mm.add(5L, 3L);
        result[1] = mm.substract(5L, 3L);
        result[2] = mm.multifly(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        for(int i = 0; i<3; i++){
            System.out.println(result[i]);
        }
        System.out.println(result4);

    }
}
class MyMath{
    long add(long a, long b){
        long result = a+b;
        return result;
    }
    long substract(long a, long b){
        long result = a-b;
        return a-b;
    }
    long multifly(long a, long b){
        return a*b;
    }
    double divide(double a, double b){
        return a/b;
    }
}