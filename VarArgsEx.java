public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "399"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("\t", "100", "200", "300"));

        System.out.println(concatenate("-",strArr));
        System.out.println(concatenate(",", new String[] {"1","2", "3"}));

        System.out.println(concatenate(",",new String[0]));
        System.out.println(concatenate(","));


    }

    static String concatenate(String delim, String...args){//가변인자를 인수로 넣기//매개변수로 배열들어가는것과의 차이점 비교
        String result = "";

        for(String str : args){//간소화된 for문
            result +=str + delim;
        }
        return result;
    }
    //아래와 같은 메소드도 사용이 가능하다
    /*
    static String concatenate(String ...args){
        return concatenate("", args);
    }
     */
}
