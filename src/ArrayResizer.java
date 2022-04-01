public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r){
        if (array2D.length-1>=r){ //if the row exists then the length or 2D should be greater or equal
            for(int i=0;i<array2D[r].length;i++){
                if(array2D[r][i]==0){
                    return false;
                }
            }
        }else{
            System.out.println("r is not a valid row");
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D){
        int numRows = 0;
        for(int i=0;i< array2D.length;i++){
            int counter=0;
            for(int j=0;j<array2D[i].length;j++){
                if(array2D[i][j]==0){
                    counter++;
                }
            }
            if(counter==array2D[i].length) { //if the whole row is 0's
                numRows++;
            }
        }
        return numRows;
    }

    public static int[][] resize(int[][] array2D){

    }


}
