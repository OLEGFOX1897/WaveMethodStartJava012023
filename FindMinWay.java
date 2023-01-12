import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FindMinWay {
    public static int [][] countMotion(int [][] arrayMap, int [] startFinish) {
        int [][] map=arrayMap;
        Deque<Integer> coordinatsStepsMap = new LinkedList<Integer>();
        System.out.println(Arrays.toString(startFinish));
        coordinatsStepsMap.add(startFinish[2]);
        coordinatsStepsMap.add(startFinish[3]);
        System.out.println(coordinatsStepsMap);
        map[startFinish[0]][startFinish[1]]=1;
        int rowStep=0;
        // System.out.println(rowStep);
        int columnStep=0;
        do {
            rowStep=coordinatsStepsMap.poll();
            columnStep=coordinatsStepsMap.poll();
            // System.out.println(rowStep);
            // System.out.println(columnStep);
            if (map[rowStep][columnStep-1]==map[rowStep][columnStep]-1) {
                coordinatsStepsMap.add(rowStep);
                coordinatsStepsMap.add(columnStep-1);
                map[rowStep][columnStep]=-2;
            }
            if (map[rowStep-1][columnStep]==map[rowStep][columnStep]-1) {
                coordinatsStepsMap.add(rowStep-1);
                coordinatsStepsMap.add(columnStep);
                map[rowStep][columnStep]=-2;
                
            }
            if (map[rowStep+1][columnStep]==map[rowStep][columnStep]-1) {
                coordinatsStepsMap.add(rowStep+1);
                coordinatsStepsMap.add(columnStep);
                map[rowStep][columnStep]=-2;
            }
            if (map[rowStep][columnStep+1]==map[rowStep][columnStep]-1) {
                    coordinatsStepsMap.add(rowStep);
                    coordinatsStepsMap.add(columnStep+1);
                    map[rowStep][columnStep]=-2;   
            }
            
            
        } while (coordinatsStepsMap.size()!=0);
        map[startFinish[0]][startFinish[1]]=100;
        map[startFinish[2]][startFinish[3]]=200;
        return map;
    }
}
