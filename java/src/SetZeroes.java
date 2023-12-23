package java.src;

public class SetZeroes {

    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean tr=false;
        boolean tc=false;
        for(int i=0;i<m;i++){
            if(matrix[0][i]==0){
                tr=true;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                tc=true;
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(matrix[i][0]==0){
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                for(int i=0;i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }

        if(tc){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        if(tr){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
    }
}
