class MultiArrEx3 {
    public static void main(String[] args){
        int [][] m1 = {{1,2,3},{4,5,6}};

        int [][] m2 = {{1,2},{3,4},{5,6}};

        final int ROW = m1.length; //m1의 행길이
        final int COL = m2[0].length; //m2[0]의 열길이
        final int M2_ROW = m2.length;

        int [][] m3 = new int[ROW][COL];

        //행렬곱 m1*m2를 m3에 저장.
        for(int i = 0; i<ROW; i++)
        {
            for(int j = 0; j<COL; j++)
            {
                for(int k = 0; k<M2_ROW; k++)
                {
                    m3[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }

        for(int i = 0; i<ROW; i++)
        {
            for(int j = 0; j<COL; j++)
            {
                //m3[i][j]
                System.out.printf("%3d", m3[i][j]);//3칸을 띄기위해서 %3d를 함
            }
            System.out.println();//개행
        }
        //printf, println의 차이를 정확히 알아야한다.
    }

}
