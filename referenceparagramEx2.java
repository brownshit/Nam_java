public class referenceparagramEx2 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = "+sumArr(arr));
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for(int i:arr)
            sum+=i;
        return sum;
    }

    static void sortArr(int[] arr) {
        for(int i  = 0; i<arr.length -1; i++)
            for(int j = i+1; j<arr.length;j++)
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            /*
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
             */
        for(int i : arr)
            System.out.print(i+",");
        System.out.println();
    }

    static void printArr(int[] arr) {
        /*
        for(int i = 0; i<arr.length; i++)
            System.out.printf("%d ", arr[i]);

         */
        //향상된 for문 사용
        for(int i : arr)
            System.out.print(i+",");
        System.out.println();
    }
}
