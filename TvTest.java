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
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 "+t.channel+" 입니다.");
    }
}

