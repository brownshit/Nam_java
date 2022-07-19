class Tv {
    String Tv;      //색상
    boolean power;  //전원상태
    int channel;    //채넣

    void power(){ power = !power;}//Tv를 켜거나 끄는 기능을 하는 매서드
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}
class TvTest{
    public static void main(String[] args){
        Tv t1 = new Tv(); Tv t2 = new Tv();
        System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
        System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");

        t1.channel= 7;
        System.out.println("t1의 채널값을 "+t1.channel+"로 변경했습니다.");

        System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
        System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");

    }
}
