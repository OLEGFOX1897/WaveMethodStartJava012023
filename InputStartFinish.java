import java.util.Arrays;
import java.util.Scanner;

public class InputStartFinish {
    public static int[] startFinish() {

        int[] translateStartFinishCoordinates = new int[4];
        String[] nameColumnMap = { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" };
        String[] nameRowMap = { " ", "A", "B", "C", "D", "E", "F", "G", "E", "K", "L", "M", };
        int outCycle = 0;
        String[] inputStartFinishCoordinates = new String[4];
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите ординату Старта");
            inputStartFinishCoordinates[0] = input.next();
            System.out.println("Введите абциссу Старта");
            inputStartFinishCoordinates[1] = input.next();
            System.out.println("Введите ординату Финиша");
            inputStartFinishCoordinates[2] = input.next();
            System.out.println("Введите абциссу Финиша");
            inputStartFinishCoordinates[3] = input.next();
            System.out.println(Arrays.toString(inputStartFinishCoordinates));

            translateStartFinishCoordinates[0] = transCoordinates(nameRowMap, inputStartFinishCoordinates[0]);
            translateStartFinishCoordinates[1] = transCoordinates(nameColumnMap, inputStartFinishCoordinates[1]);
            translateStartFinishCoordinates[2] = transCoordinates(nameRowMap, inputStartFinishCoordinates[2]);
            translateStartFinishCoordinates[3] = transCoordinates(nameColumnMap, inputStartFinishCoordinates[3]);
            // System.out.println(Arrays.toString(translateStartFinishCoordinates));
            outCycle = 0;
            for (int i = 0; i < translateStartFinishCoordinates.length; i++) {
                if (translateStartFinishCoordinates[i] == 20) {
                    System.out.println("Вы неправильно ввели координаты. Повторите ввод.");
                    i = translateStartFinishCoordinates.length;
                } else
                    outCycle += 1;
            }
            if (outCycle == 4) {
                int[][] map = DataBase.initialMap();
                int startRowCoordinate = translateStartFinishCoordinates[0];
                int startColumnCoordinate = translateStartFinishCoordinates[1];
                int finishRowCoordinate = translateStartFinishCoordinates[2];
                int finishColumnCoordinate = translateStartFinishCoordinates[3];
                if (map[startRowCoordinate][startColumnCoordinate] == -1
                        | map[finishRowCoordinate][finishColumnCoordinate] == -1) {
                    outCycle = 0;
                    System.out.println("Вы ввели координаты препятствия. Повторите ввод");
                }
                else input.close();

            }

        } while (outCycle < 4);

        return translateStartFinishCoordinates;

    }

    public static int transCoordinates(String[] array, String coordinat) {
        int transCoordinat = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i].equals(coordinat)) == true) {
                transCoordinat = i;
                break;
            } else
                transCoordinat = 20;
        }
        return transCoordinat;
    }

    public static String[] scannerMethod(String[] array) {

        return array;
    }
}

