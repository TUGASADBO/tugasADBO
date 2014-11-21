/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

/**
 *
 * @author i13026 i13011
 */
public class Chip extends Floor{
    private int direction;
    
    public Chip(){
        this.direction = 1;
    }
    
    @Override
    public boolean isCanMove() {
        return true;
    }

    @Override
    public boolean isKill() {
        return false;
    }
    
    public int getDirection(){
        return direction;
    }
    
    public void setDirection(int newDirection){
        this.direction=newDirection;
    }
}
