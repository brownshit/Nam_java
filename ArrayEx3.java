class ArrayEx3 {
    public static void main(String[] args) {
    int [] arr = new int [5];

    //배열 arr에 1~5를 저장한다.
        for(int i= 0;i<arr.length; i++)
        {
            arr[i]= i+1;
        }

        System.out.println("변경전 - arrlength : "+arr.length);
        for(int i = 0;i< arr.length;i++){
            System.out.println("arr["+i+"] : "+arr[i]);
        }
        int[] tmp = new int[arr.length*2];

        //배열 arr에 저장된 값들을 배열tmp에 복사한다.
        for(int i = 0; i< tmp.length; i++)
        {
            tmp[i] = arr[i%5];
        }

        arr = tmp;

        System.out.println("변경 후 - arr.length : "+arr.length);
        for(int i =0; i< arr.length; i++)
        {
            System.out.println("arr["+i+"] : "+arr[i]);
        }
    }//main
}//class
