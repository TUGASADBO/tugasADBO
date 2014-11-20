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
public class WaterFloor extends Floor{

    public void setGameOver(){
        
    }
    
    @Override
    public boolean isCanMove() {
        return true;
    }

    @Override
    public boolean isKill() {
        return true;
    }
}
