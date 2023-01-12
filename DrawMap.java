

public class DrawMap {
    public static void mapPaint(int[][] array, int makeDigit) {
        String[][] arrayString = new String[14][14];
        String[] nameRowCoordinates = { "  ", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", "11", "  ",
                "  " };
        String[] nameColumnCoordinates = { "  ", "A", "B", "C", "D", "E", "F", "G", "E", "K", "L", "M", " " };
        String[] digitToString = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22" };
        int obstractle = -1;
        int emptySpace = 0;
        int arrayLen = array.length;
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[i].length; j++) {
                if (i < arrayLen & j < arrayLen) {
                    if (array[i][j] == obstractle) {
                        arrayString[i][j] = "WW";
                    } else if (array[i][j] == emptySpace) {
                        arrayString[i][j] = "  ";
                    } else if (array[i][j] == 100) {
                        arrayString[i][j] = " S";
                    } else if (array[i][j] == 200) {
                        arrayString[i][j] = " F";
                    } else if (array[i][j] == -2) {
                        arrayString[i][j] = " @";
                    } else if (makeDigit == 1) {
                        for (int j2 = 2; j2 < digitToString.length; j2++) {
                            if (array[i][j] == j2) {
                                arrayString[i][j] = digitToString[j2 - 1];
                            }
                        }
                    }
                    else arrayString[i][j]="  ";
                }
                if (j == arrayString.length - 1 & i < arrayString.length - 1) {
                    arrayString[i][j] = nameColumnCoordinates[i];
                }
                if (i == arrayString.length - 1 & j < arrayString.length) {
                    arrayString[i][j] = nameRowCoordinates[j];
                }
                System.out.printf("%S ", arrayString[i][j]);
            }
            System.out.println();
        }
    }
}