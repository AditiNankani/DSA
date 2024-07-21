class Solution {
    public void setZeroes(int[][] matrix) {
       int n=matrix.length;
       int m=matrix[0].length;

       int row[]=new int[n];
       int col[]=new int[m];
/*If any cell (i,j) contains the value 0, we will mark ith index of row array i.e. row[i] and jth index of col array col[j] as 1. It signifies that all the elements in the ith row and jth column will be 0 in the final matrix.*/
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                row[i]=1;
                col[j]=1;
            }
        }
       }
       /*Finally, we will again traverse the entire matrix and we will put 0 into all the cells (i, j) for which either row[i] or col[j] is marked as 1.*/
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(row[i]==1 || col[j]==1){
                matrix[i][j]=0;
            }
        }
       }
    }
}
