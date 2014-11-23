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
    protected int chipLeft;
    protected int time;

    public Board() {
        
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

    public int getHeight() {
        return this.floor[0].length;
    }
    
    public int getChipLeft() {
        return this.chipLeft;
    }

    public void setChipLeft() {
        this.chipLeft--;
    }

    public Chip getChip() {
        return this.chip;
    }
    
    public int getTime(){
        return time;
    }
}
