public class CharToCode {
    public static void main(String[] args)
    {
        char ch = 'A';
        int code = (int)ch;//강제 형 변환시켜서 저장한다.
        System.out.printf("%c = %d(%#X)\n",ch,code,code);

        char hch = '가';
        System.out.printf("%c = %d(%#X)\n",hch,(int)hch,(int)hch);

        //유니코드를 이용한 출력.
    }
}
