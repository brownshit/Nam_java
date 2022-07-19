public class TvTest4 {
    public static void main(String args[]){
        Tv[] tvarr = new Tv[3];

        //Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
        for(int i = 0; i<tvarr.length; i++){
            tvarr[i]= new Tv();
            tvarr[i].channel = i+10;
        }

        for(int i = 0; i<tvarr.length; i++){
            tvarr[i].channelUp();
            System.out.printf("tvarr[%d].channel = %d\n", i, tvarr[i].channel);
        }
    }
}
class Tv {
    String color;      //색상
    boolean power;  //전원상태
    int channel;    //채넣

    void power(){ power = !power;}//Tv를 켜거나 끄는 기능을 하는 매서드
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

