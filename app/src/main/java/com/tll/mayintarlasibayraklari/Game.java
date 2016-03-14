package com.tll.mayintarlasibayraklari;

import java.util.Stack;

/**
 * Created by abdullahtellioglu on 23/02/16.
 */
public class Game {
    private int row,column;
    private int[][] matrix;
    private int[][] visibility;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getVisibility() {
        return visibility;
    }

    public void setVisibility(int[][] visibility) {
        this.visibility = visibility;
    }

    public CellKind clickCell(int row,int column){
        if(matrix[row][column]==-1){
            visibility[row][column] = 1;
            return CellKind.MINE;
        }else{
            if(matrix[row][column]==0){
                Stack<Integer> rows = new Stack<>();
                Stack<Integer> columns = new Stack<>();
                rows.add(row);
                columns.add(column);
                while(!rows.empty()){

                }
                return CellKind.EMPTY;
            }else{

                return CellKind.NUMBER;
            }


        }
    }
}
