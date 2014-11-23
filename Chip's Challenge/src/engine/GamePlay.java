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
    protected int score;
    protected boolean win;
    protected boolean isFinish;
    protected int chipLeft;
    protected boolean isGameOver;
    protected int time;

    public GamePlay() {
        this.level = 1;
        this.score = 0;
        isGameOver = false;
        isFinish = false;
        chipLeft = 0;
        board = new ArrayList<Board>();
        board.add(new BoardLevel1());
        board.add(new BoardLevel2());
        board.add(new BoardLevel3());
        board.add(new BoardLevel4());
    }

    public ArrayList<Board> getListBoard() {
        return this.board;
    }

    public Board getBoard() {
        this.chipLeft = 0;
        return board.get(level - 1);
    }

    public int getLevel() {
        return level;
    }

    public void addLevel() {
        level++;
    }

    public void setWin(boolean isWin) {
        this.win = isWin;
    }

    public boolean isWin() {
        return this.win;
    }

    public boolean getIsFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public boolean getIsGameOver() {
        return isGameOver;
    }

    public void setIsGameOver(boolean over) {
        isGameOver = over;
    }
    
    public void setScore(int score){
        this.score=score;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public int getTime(){
        return time;
    }
    
    public void setTime(int time){
        this.time = time;
    }
}
