public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int col = 0; col < array2D[r].length; col ++){
            if (array2D[r][col] == 0){
                return false;
            }
        }
        return true;
    }

    public static int[][] resize(int[][] array2D) {
        int[][] newGrid = new int[numNonZeroRows(array2D)][array2D[0].length];
        int counter = 0;
        for (int i = 0; i < array2D.length; i ++){
            if (isNonZeroRow(array2D, i)){
                newGrid[counter] = array2D[i];
                counter ++;
            }
        }
        return newGrid;
    }

    // CODE BELOW ADDED TO ENABLE TESTING; NOT SHOWN IN ORIGINAL FRQ
    public static int numNonZeroRows(int[][] array2D) {
        int nonZeroRowCount = 0;
        for (int row = 0; row < array2D.length; row++) {
            boolean hasZeros = false;
            for (int col = 0; col < array2D[0].length; col++) {
                if (array2D[row][col] == 0) {
                    hasZeros = true;
                }
            }
            if (!hasZeros) {
                nonZeroRowCount++;
            }
        }
        return nonZeroRowCount;
    }
}