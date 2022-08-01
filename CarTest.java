class Car{
    String color;   //색상
    String geartype;    //변속기 종류 auto, manual
    int door;   //문의 개수
    Car(){}
    Car(String c, String g, int d){
        color = c; geartype = g; door = d;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.geartype = "auto";
        c1.door = 4;

        Car c2 = new Car("black","manual",2);

        System.out.println("c1의 color : "+c1.color+"\n\tgeartype : "+c1.geartype+"\n\tdoor : "+c1.door+"\n");
        System.out.println("c2의 color : "+c2.color+"\n\tgeartype : "+c2.geartype+"\n\tdoor : "+c2.door);


    }
}
