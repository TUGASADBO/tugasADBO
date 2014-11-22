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
public class FinishFloor extends Floor{
    
    public FinishFloor(){
        
    }
    
    @Override
    public boolean isCanMove() {
        return true;
    }

    @Override
    public boolean isKill() {
        return false;
    }

    @Override
    public boolean isObstacles() {
        return false;
    }
}
