class Product{
    static int count = 0;//전역변수 추가돼서 증가한다.
    int serialNo;//인스턴스 변수는 초기화를 하지 않으면 기본값으로 설정이 된다.

    {
        ++count;
        serialNo = count;
    }
    public Product() {}
}

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호는 "+p1.serialNo);
        System.out.println("p2의 제품번호는 "+p2.serialNo);
        System.out.println("p3의 제품번호는 "+p3.serialNo);

        System.out.println("생산된 제품의 수는 모두 "+Product.count);//count는 클래스변수!!
    }
}
