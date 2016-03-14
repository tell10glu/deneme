package com.tll.mayintarlasibayraklari.components;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.tll.mayintarlasibayraklari.Game;
import com.tll.mayintarlasibayraklari.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdullahtellioglu on 23/02/16.
 */
public class MineSweeperGrid extends GridView {
    private Game game;
    private List<MineCells> cells;
    private Context context;
    public MineSweeperGrid(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public MineSweeperGrid(Context context) {
        super(context);
        this.context = context;

    }
    public List<MineCells> getCells(){
        return cells;
    }
    public void setGame(Game game){
        this.game = game;
        this.cells = new ArrayList<>();
        for(int i = 0;i<game.getRow();i++){
            for(int j = 0;j<game.getColumn();j++){
                MineCells tmpCell = new MineCells(context);
                tmpCell.setRow(i);
                tmpCell.setColumn(j);
                tmpCell.setPlayernumber(this.game.getVisibility()[i][j]);
                cells.add(tmpCell);
            }
        }
        setNumColumns(game.getColumn());
        GridViewAdapter adapter = new GridViewAdapter();
        setAdapter(adapter);
    }
    private class GridViewAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return cells.size();
        }

        @Override
        public Object getItem(int i) {
            return cells.get(i);
        }

        @Override
        public long getItemId(int i) {
            return cells.get(i).hashCode();
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            MineCells cells;
            if(view==null){
                cells = new MineCells(context);
                cells.setBackgroundColor(getResources().getColor(R.color.cell_default));
                DisplayMetrics metrics = context.getResources().getDisplayMetrics();
                int width = metrics.widthPixels / 3;
                int height = metrics.heightPixels / 3;
                cells.setLayoutParams(new GridView.LayoutParams(width,height));
            }else{
                cells = (MineCells)view;
            }
            int r = cells.getRow();
            int c = cells.getColumn();
            int visibility = game.getVisibility()[r][c];
            if(visibility!=0){
                if(game.getMatrix()[r][c]==-1){
                    // mayin
                }else{
                    if(game.getMatrix()[r][c]!=0){
                        cells.setAlpha(0.8f);
                    }else{
                        cells.setAlpha(0.8f);
                        cells.setText(String.valueOf(game.getMatrix()[r][c]));
                    }
                }
            }
            return cells;
        }
    }
}
