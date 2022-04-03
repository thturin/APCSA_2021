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
        int numRows =0;
        //precondition for rows
        for(int i=0;i<array2D.length;i++){
            check=false;
            for(int j=0;j<array2D[i].length;j++){
                if(array2D[i][j]==0){
                    check=true; // there is a zero in the row
                    break;
                }
            }
            if(check==false){//if there were no zeros in the row, you can
                numRows++;
            }
        }

        return numRows;
    }

    public static int[][] resize(int[][] array2D){
        int rows = numNonZeroRows(array2D);
        int[][] newArr = new int[rows][3];
        int currentRow = 0;
        boolean foundZero=false;
        //check for non zero rows

        if(rows==0){ //if there were no nonZero rows, you have to check for columns
            for(int i=0;i<array2D[0].length;i++){
                foundZero=false;
                for(int j=0;j<array2D.length;j++){
                    if(array2D[j][i]==0) {
                        foundZero = true;
                        break; //skip to next column
                    }
                }
                if(foundZero==false){ //no zero was found and you can exit out of the loop
                    break; //leave out of this for loop
                }
            }
            if(foundZero==true){ //no nonzero column was found so return -1000
                return newArr;
            }
        }

        //RESIZING METHOD

        for(int i=0;i<array2D.length;i++){
            foundZero = false;
            for(int j=0;j<array2D[i].length;j++){
                if(array2D[i][j]==0){
                    foundZero=true;
                    break;
                }
                if(foundZero==false){//nonzero row should be added to list
                    System.out.println("add this row here");
                    for(int k=0;k<array2D[i].length;k++){
                        System.out.println("newArr["+currentRow+"]["+k+"]="+array2D[i][k]);
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

        //System.out.println(ArrayResizer.numNonZeroRows(arr));
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
