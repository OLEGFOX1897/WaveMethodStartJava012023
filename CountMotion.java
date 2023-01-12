// import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class CountMotion {
    // public static void main(String[] args) {
    //     int [] startFinishCoordinat={1,2};
    //     int [][] arrayOut=countMotion(DataBase.initialMap(), startFinishCoordinat);
    //     System.out.println(arrayOut[1][2]);
    //     DrawMap.mapPaint(countMotion(DataBase.initialMap(), startFinishCoordinat));
    // }
    public static int [][] countMotion(int [][] arrayMap, int [] startFinish) {
        int [][] map=arrayMap;
        Deque<Integer> coordinatStepMap = new LinkedList<Integer>();
        coordinatStepMap.add(startFinish[0]);
        coordinatStepMap.add(startFinish[1]);
        map[startFinish[0]][startFinish[1]]=1;
        int rowStep=0;
        int columnStep=0;
        do {
            rowStep=coordinatStepMap.poll();
            columnStep=coordinatStepMap.poll();
            
            if (map[rowStep-1][columnStep]==0) {
                map[rowStep-1][columnStep]=map[rowStep][columnStep]+1;
                coordinatStepMap.add(rowStep-1);
                coordinatStepMap.add(columnStep);
            }
            if (map[rowStep][columnStep+1]==0) {
                map[rowStep][columnStep+1]=map[rowStep][columnStep]+1;
                coordinatStepMap.add(rowStep);
                coordinatStepMap.add(columnStep+1);               
            }
            if (map[rowStep+1][columnStep]==0) {
                map[rowStep+1][columnStep]=map[rowStep][columnStep]+1;
                coordinatStepMap.add(rowStep+1);
                coordinatStepMap.add(columnStep);
                
            }
            if (map[rowStep][columnStep-1]==0) {
                map[rowStep][columnStep-1]=map[rowStep][columnStep]+1;
                coordinatStepMap.add(rowStep);
                coordinatStepMap.add(columnStep-1);
            }
        } while (coordinatStepMap.size()!=0);
        map[startFinish[0]][startFinish[1]]=100;
        return map;
    }
    
    
}
