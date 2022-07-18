public class ArraEx4 {
    public static void main(String[] args)
    {
        char[]abc = {'a','b','c'};
        char[] num = {'0','1','2','3'};
        System.out.println(abc);
        System.out.println(num);

        char[] addarr = new char[abc.length+num.length];
        System.out.println(addarr.length);

        System.arraycopy(abc,0,addarr,0, abc.length);
        System.arraycopy(num,0,addarr,abc.length, num.length);

        System.out.println(addarr);
    }
}
