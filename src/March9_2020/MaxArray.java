package March9_2020;
public class MaxArray {
    public static void main(String[] args) {
        int[][] arr = {{-1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};
        System.out.print("Max value on each row:\n");
        printArrValue(maxValue(arr));
        System.out.print("Min value on each row:\n");
        printArrValue(minValue(arr));
        System.out.print("Difference of values on each row: ");
        printArrValue(diffValue(maxValue(arr),minValue(arr)));
    }

    // Find max values on each row:
    public static int[] maxValue(int[][] arr) {
        int max = 0;
        int min = 0;
        int[] outArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            outArray[i] = max;
        }
        return outArray;
    }

    //Find the min values on each row:
    public static int[] minValue(int[][] arr) {
        int max = 0;
        int min = 0;
        int[] outputArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            min = max;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            outputArray[i]=min;
        }
        return outputArray;
    }

    //the differences between values on each row:
    public static int[] diffValue(int[] num1, int[] num2) {
        int max = 0;
        int min = 0;
        int[] resultArray = new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            resultArray[i] = num1[i] - num2[i];
        }
        return resultArray;
    }

    //Print values on return resultArrays:
    public static void printArrValue(int[] resultArray){
       for (int i=0;i<resultArray.length;i++){
           System.out.print("\t"+resultArray[i]);
        }
        System.out.println();

    }
}
