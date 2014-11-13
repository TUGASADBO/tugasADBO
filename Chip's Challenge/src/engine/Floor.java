package engine;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i13026 i13011
 */
public abstract class Floor {
    protected Floor[][] floor;
    int panjang, lebar;
    protected boolean isFinish;
    protected int chipLeft;
    protected boolean isGameOver;
    
    public Floor(){
        floor = new Floor[panjang][lebar];
        isFinish = false;
        chipLeft = 4;
    }
    
    public abstract boolean isCanMove();
    
    public abstract boolean isKill();
    
    public void setFloor(Floor flo,int x, int y){
        this.floor[x][y]=flo;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
}
