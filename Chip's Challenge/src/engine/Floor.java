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
public abstract class Floor implements Obstacle{
    
    public Floor(){
        
    }
    
    public abstract boolean isCanMove();
    
    public abstract boolean isKill();

}
