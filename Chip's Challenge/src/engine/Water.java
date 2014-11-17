/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

/**
 *
 * @author RICKY
 */
public class Water extends Floor{

    public Water(){
        
    }
    
    public void setGameOver(){
        super.isGameOver=true;
    }
    
    public boolean isGameOver(){
        return super.isGameOver;
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
