class Data_1 {int x;}

public class referencereturnEx {
    public static void main(String[] args) {
        Data_1 d = new Data_1();
        d.x = 10;
        Data_1 d2 = copy(d);
        System.out.println("d.x = "+d.x);
        System.out.println("d2.x = "+d2.x);
    }

    static Data_1 copy(Data_1 d) {// 참조형
        Data_1 tmp = new Data_1();
        tmp.x = d.x;

        return tmp;
    }
}
