package com.tll.mayintarlasibayraklari;

import java.util.Random;

/**
 * Created by abdullahtellioglu on 23/02/16.
 */
public class GameCreator {
    public static int ROW = 30;
    public static int COLUMN = 10;
    public static int MINE_COUNT =50;
    private int[][] arr;
    public int[][] getArr(){
        return arr;
    }

    public GameCreator() {
        arr = new int[ROW][COLUMN];
        int mineCount = MINE_COUNT;
        while(mineCount!=0){
            int rndx = new Random().nextInt(arr.length);
            int rndy = new Random().nextInt(arr[0].length);
            if(arr[rndx][rndy]==0){
                arr[rndx][rndy]=-1;
                mineCount--;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = getValue(arr, i, j);
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==-1)
                    System.out.print("* ");
                else
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private int getValue(int [][] arr , int x, int y){
        if(arr[x][y]==-1)
            return -1;
        int count =0;
        for(int i =x-1;i<=x+1;i++){
            for(int j=y-1;j<=y+1;j++){
                if(i!=-1 && i!= arr.length && j!=-1 && j!= arr[0].length){
                    if(arr[i][j]==-1)
                        count++;
                }
            }
        }
        return count;
    }

}
