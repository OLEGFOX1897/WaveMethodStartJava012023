public class InitialMap {
    public static void main(String[] args) {
        DrawMap.mapPaint(DataBase.initialMap(),0);
        System.out.println("Вым представленна карта. Где WW - это стены.");   
        int [] coordinateStartFinish=InputStartFinish.startFinish();
        int [][] mapHaveStepStartFinish=CountMotion.countMotion(DataBase.initialMap(),coordinateStartFinish);
        System.out.println("Ниже представленна карта с количеством ходов относительно точки старта S");
        DrawMap.mapPaint(mapHaveStepStartFinish,1);
        System.out.println("Ниже представленна карта с отображением одного из наименьших количеств ходов, полученных (Волновым методом)");
        int [][] minWay=FindMinWay.countMotion(mapHaveStepStartFinish, coordinateStartFinish);
        DrawMap.mapPaint(minWay, 0);
    }
}
