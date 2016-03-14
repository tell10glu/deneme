package com.tll.mayintarlasibayraklari.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by abdullahtellioglu on 23/02/16.
 */
public class MineCells extends TextView{
    private int playernumber;//0 tiklanmamis.
    private int number; // -1 ise mayin var.
    private int row,column;

    public int getPlayernumber() {
        return playernumber;
    }

    public void setPlayernumber(int playernumber) {
        this.playernumber = playernumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

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

    public MineCells(Context context) {
        super(context);
    }

    public MineCells(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

}
