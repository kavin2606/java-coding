public class matrix_rotation {
    public static void main(String args[])
    {
        int matrix[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(matrix[0]);
        matrot(matrix,5);
    }

    public static void matrot(int[][] matrix,int n)
    {
        int[][] op= new int[5][5];
        for(int i=0,j1=n-1;i<n;i++,j1--)
        {
            for(int j=0;j<n;j++)
            {
//                System.out.println(matrix[i][j]);
                op[j][j1]=matrix[i][j];
            }
        }
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(op[i][j]);
            }
        }

    }
}
