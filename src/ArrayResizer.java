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
        boolean check = false;
        //precondition for rows
        for(int i=0;i<array2D.length;i++){
            check=false;
            for(int j=0;j<array2D[i].length;j++){
                if(array2D[i][j]==0){
                    check=true; // there is a zero in the row
                }
            }
            if(check==false){//if there were no zeros in the row, you can
                break;
            }
        }

        for(int i=0;i<array2D.length;i++){
            check=false;
            for(int j=0;j<array2D.length;j++){
                if(array2D[j][i]==0){
                    check=true; // there is a 0 in the column
                }
            }
            if(check==false){//if there were no zeros in the column, you can break
                break;
            }
        }

        if(check==true){//the last state of check was true which mean code never broke for non-zero column or row so return
            return -1000;
        }

        int numRows = 0;
        for(int i=0;i< array2D.length;i++){
            boolean zeroFound=false;
            for(int j=0;j<array2D[i].length;j++){
                if(array2D[i][j]==0){
                    //System.out.println("["+i+"]["+j+"]="+array2D[i][j]);
                    zeroFound=true;
                    break;
                }
            }
            if(zeroFound==false){
                //System.out.println("~~~~~~~~~");
                numRows++;
            }
        }
        return numRows;
    }

    public static int[][] resize(int[][] array2D){
       // int rows = numNonZeroRows(array2D);
        int[][] newArr = new int[2][3];
        int currentRow = 0;
        //check for non zero rows

        for(int i=0;i<array2D.length;i++){
            boolean zeroFound = false;
            for(int j=0;j<array2D[i].length;j++){
                if(array2D[i][j]==0){
                    zeroFound=true;
                    break;
                }
                if(zeroFound==false){//nonzero row should be added to list
                    System.out.println("here");
                    for(int k=0;k<array2D[i].length;k++){
                        newArr[currentRow][k]=array2D[i][k];
                    }
                    currentRow++;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
      /*  int[][] arr = { {2,1,0},
                            {1,3,2},
                            {0,0,0},
                            {4,5,6}};

        int[][] arr2 = {
                {1,0,0},
                {1,0,0},
                {1,0,0}

        };*/

        int[][]arr = {
                {2,1,0},
                {1,3,2},
                {0,0,0},
                {4,5,6}
        };

        int[][] smaller = ArrayResizer.resize(arr);

        for(int i=0;i<smaller.length;i++){
            for(int j=0;j<smaller[i].length;j++){
                System.out.print(" "+smaller[i][j]+" ");
            }
            System.out.println("");
        }

       //System.out.println(ArrayResizer.isNonZeroRow(arr,3));
       // System.out.println(ArrayResizer.numNonZeroRows(arr2));

    }


}
