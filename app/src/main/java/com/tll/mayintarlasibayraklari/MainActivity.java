package com.tll.mayintarlasibayraklari;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.tll.mayintarlasibayraklari.components.MineCells;
import com.tll.mayintarlasibayraklari.components.MineSweeperGrid;


public class MainActivity extends Activity {
    private Game game;
    private MineSweeperGrid grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GameCreator creator = new GameCreator();
        game = new Game();
        game.setMatrix(creator.getArr());
        game.setVisibility(new int[GameCreator.ROW][GameCreator.COLUMN]);
        grid = (MineSweeperGrid)findViewById(R.id.game_grid);
        grid.setGame(game);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MineCells cell = grid.getCells().get(i);
                int row =cell.getRow();
                int colmn = cell.getColumn();
            }
        });
    }






}
