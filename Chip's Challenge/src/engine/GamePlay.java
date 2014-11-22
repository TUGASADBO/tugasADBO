/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

import java.util.ArrayList;

/**
 *
 * @author i13026 i13011
 */
public class GamePlay {
    private ArrayList<Board> board;
    protected int level;
    
    public GamePlay(){
        this.level = 1;
        board = new ArrayList<Board>();
        board.add(new BoardLevel1());
        board.add(new BoardLevel2());
    }
    
    public Board getBoard(){
        return board.get(level-1);
    }
    
    public int getLevel(){
        return level;
    }
    
    public void addLevel(){
        level++;
    }
    
    public void resetGame(){
        new GamePlay();
    }
}
