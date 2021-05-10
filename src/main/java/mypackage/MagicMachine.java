package mypackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class MagicMachine{
    private static int maxNumBound = 9999;
    private static int minNumBound = 0;
    private static int [] verticeStatus = new int [10000];
    private static int [] verticeDistance = IntStream.generate(() -> 1).limit(10000).toArray();
    private static Queue<Integer> helperQueue = new LinkedList();

    public static int magicMachineSolution(int a, int b) {
        if(a == b) return 0;

        helperQueue.add(a);
        verticeStatus[a] = 2;

        while (!helperQueue.isEmpty()){
            int temp = helperQueue.element();
            helperQueue.remove();
            int currentEl = temp;
            currentEl *= 3;

            if(verticeStatus[currentEl] != 2) {
                if (currentEl == b){
                    return verticeDistance[temp];
                }
                else if (currentEl <= maxNumBound && currentEl>=minNumBound){
                    verticeDistance[currentEl] = 2;
                    helperQueue.add(currentEl);
                    verticeDistance[currentEl]=verticeDistance[temp]+1;
                }
            }

            currentEl=temp;
            currentEl += temp/1000 + (temp%1000-temp%100)/100 + (temp%100-temp%10)/10 + temp%10;

            if (verticeStatus[currentEl] != 2){
                if (currentEl == b){
                    return verticeDistance[temp];
                }
                else if (currentEl <= maxNumBound && currentEl >= minNumBound){
                    verticeStatus[currentEl] = 2;
                    verticeDistance[currentEl]=verticeDistance[temp]+1;
                    helperQueue.add(currentEl);
                }
            }

            currentEl=temp;
            currentEl -= 2;

            if (verticeStatus[currentEl] != 2){
                if (currentEl == b){
                    return verticeDistance[temp];
                }
                else if (currentEl <= maxNumBound && currentEl >= minNumBound){
                    verticeStatus[currentEl] = 2;
                    verticeDistance[currentEl]=verticeDistance[temp]+1;
                    helperQueue.add(currentEl);
                }
            }
        }
        return 0;
    }
}

