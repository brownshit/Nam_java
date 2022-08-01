class Car_2{
    String color;
    String gearType;
    int door;

    Car_2(){
        this("white", "auto", 4);
    }
    Car_2(String color){
        this(color, "auto",4);
    }
    Car_2(String c, String g, int d){
        this.color = c;
        this.gearType = g;
        this.door = d;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car_2 c1 = new Car_2();
        Car_2 c2 = new Car_2("blue");
        System.out.println("c1의 color : "+c1.color+"\n\tgeartype : "+c1.gearType+"\n\tdoor : "+c1.door+"\n");
        System.out.println("c2의 color : "+c2.color+"\n\tgeartype : "+c2.gearType+"\n\tdoor : "+c2.door);
    }
}
