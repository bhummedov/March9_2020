package March9_2020;

public class RowsColumnsArray {
    public static void main(String[] args) {
/*int [][] arr ={{1,2,9}, {3,4,8}, {4,5,7}};
int[][] result = resultArray(arr);
for (int row []:result){
    for (int number:row){
        System.out.println();
    }
}

    }

    public static int[] rowsColumnsArray(int[][] rows){
        int[][]resultArray = new int[rows.length][rows[0].length];
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length; j++) {
                resultArray[i][j] = rows[j][i];
            }
        }
        return resultArray;
    }
    }*/
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = transposeArray(arr);
        for(int row[]:result){
            for(int number:row){
                System.out.print("\t"+number);
            }
            System.out.println();
        }
    }
    public static int[][] transposeArray(int [][] numbers){
        int[][] transposed = new int[numbers.length][numbers[0].length];
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                transposed[j][i]=numbers[i][j];
            }
        }
        return transposed;
    }
}

