/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import engine.Board;
import engine.BoardLevel1;
import engine.BoardLevel2;
import engine.BoardLevel3;
import engine.BoardLevel4;
import java.util.ArrayList;

/**
 * kelas ini merupakan controller dari permainan ini
 * @author i13026 i13011
 */
public class GamePlay {

    /**
     * atribut papan permainan yang bertipe ArrayList
     */
    private ArrayList<Board> board;
    
    /**
     * atribut level dari permainan tersebut
     */
    protected int level;
    
    /**
     * atribut score dari permainan tersebut
     */
    protected int score;
    
    /**
     * atribut win untuk mengetahui apakah player sudah memenangkan permainan atau belum
     */
    protected boolean win;
    
    /**
     * atribut finish untuk mengetahui apakah player sudah finish pada suatu level
     */
    protected boolean isFinish;

    /**
     * atribut gameOver untuk mengetahui apakah permainan sudah berakhir atau belum
     */
    protected boolean isGameOver;
    
    /**
     * atribut waktu yang tersisa dari suatu level permainan
     */
    protected int time;

    /**
     * constructor kelas GamePlay
     */
    public GamePlay() {
        this.level = 1;
        this.score = 0;
        isGameOver = false;
        isFinish = false;
        this.win = false;
        board = new ArrayList<Board>();
        board.add(new BoardLevel1());
        board.add(new BoardLevel2());
        board.add(new BoardLevel3());
        board.add(new BoardLevel4());
    }

    /**
     * method untuk mendapatkan arraylist dari papan permainan
     * @return atribut board
     */
    public ArrayList<Board> getListBoard() {
        return this.board;
    }

    /**
     * atribut untuk mendapatkan papan permainan dari suatu level
     * @return board index level-1
     */
    public Board getBoard() {
        return board.get(level - 1);
    }

    /**
     * method untuk mendapatkan level dari permainan tersebut
     * @return atribut level
     */
    public int getLevel() {
        return level;
    }

    /**
     * method untuk menambahkan level dari permainan jika sudah finish pada level sebelumnya
     */
    public void addLevel() {
        level++;
    }

    /**
     * method untuk mengeset apakah player sudah memenangkan permainan atau belum
     * @param isWin true jika sudah menang
     * false jika belum menang
     */
    public void setWin(boolean isWin) {
        this.win = isWin;
    }

    /**
     * method untuk mengetahui apakah player sudah memenangkan permainan atau belum
     * @return atribut win
     */
    public boolean isWin() {
        return this.win;
    }

    /**
     * method untuk mengetahui apakah permainan pada level tersebut sudah finish atau belum
     * @return atribut finish
     */
    public boolean getIsFinish() {
        return isFinish;
    }

    /**
     * method untuk mengeset finish atau tidak suatu level permainan
     * @param finish true jika sudah finish
     * false jika belum finish
     */
    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    /**
     * method untuk mengetahui apakah suatu permainan sudah berakhir atau belum
     * @return atribut isGameOver
     */
    public boolean getIsGameOver() {
        return isGameOver;
    }

    /**
     * method untuk mengeset permainan apakah permainan berakhir atau tidak
     * @param over true jika permainan berakhir
     * false jika permainan belum berakhir
     */
    public void setIsGameOver(boolean over) {
        isGameOver = over;
    }
    
    /**
     * method untuk mengeset skor permainan saat ini
     * @param score score yang ingin diset
     */
    public void setScore(int score){
        this.score=score;
    }
    
    /**
     * method untuk mendapatkan score permainan pada saat ini
     * @return atribut score
     */
    public int getScore(){
        return this.score;
    }
    
    /**
     * method untuk mendapatkan sisa waktu dari suatu level permainan
     * @return atribut time
     */
    public int getTime(){
        return time;
    }
    
    /**
     * method untuk mengeset waktu dari suatu level permainan
     * @param time waktu yang ingin di set
     */
    public void setTime(int time){
        this.time = time;
    }
}
