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
public class Board {
    protected Floor[][] floor;
    protected Chip chip;
    protected boolean isFinish;
    protected int chipLeft;
    protected boolean isGameOver;

    public Board() {
        isGameOver = false;
        isFinish = false;
        chipLeft = 0;
    }

    public void setFloor(Floor flo, int x, int y) {
        this.floor[x][y] = flo;
    }

    public Floor[][] getFloor() {
        return this.floor;
    }

    public int getLength() {
        return this.floor.length;
    }
        
    public int getChipLeft(){
        return this.chipLeft;
    }
    
    public void setChipLeft(){
        this.chipLeft--;
    }
    
    public boolean getIsFinish(){
        return isFinish;
    }
    
    public void setFinish(){
        isFinish=true;
    }
    
    public boolean getIsGameOver(){
        return isGameOver;
    }
    
    public void setIsGameOver(){
        isGameOver=true;
    }

    public Chip getChip(){
        return this.chip;
    }
}
