class Car_3{
    String color;
    String gearType;
    int door;

    Car_3(){
        this("white", "auto", 4);
    }
    Car_3(Car_3 c){     //복사생성자 매서드
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
    Car_3(String c, String g, int d){
        this.color = c;
        this.gearType = g;
        this.door = d;
    }
}
public class CarTest3 {
    public static void main(String[] args) {
        Car_3 c1 = new Car_3();
        Car_3 c2 = new Car_3(c1);
        //인자로서 c1을 넣어주었다.

        System.out.println("c1의 color : "+c1.color+"\n\tgeartype : "+c1.gearType+"\n\tdoor : "+c1.door+"\n");
        System.out.println("c2의 color : "+c2.color+"\n\tgeartype : "+c2.gearType+"\n\tdoor : "+c2.door);
        c1.door = 2;
        System.out.println("c1의 color : "+c1.color+"\n\tgeartype : "+c1.gearType+"\n\tdoor : "+c1.door+"\n");
        System.out.println("c2의 color : "+c2.color+"\n\tgeartype : "+c2.gearType+"\n\tdoor : "+c2.door);
    }


}
