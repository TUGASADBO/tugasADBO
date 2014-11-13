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
public class Barrier extends Floor{
    private boolean isBarrier;
    
    public Barrier(){
        
    }
    
    public boolean isVisible(){
        if(super.chipLeft==0){
            return false;
        } else{
            return true;
        }
    }
    
    public boolean isBarrier(){
        return isBarrier;
    }
    
    public void setBarrier(){
        this.isBarrier = false;
    }

    @Override
    public boolean isCanMove() {
        if(isVisible() == true){
            return false;
        } else{
            return false;
        }
    }

    @Override
    public boolean isKill() {
        return false;
    }
}
