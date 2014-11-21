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
    private boolean barrier;
    
    public Barrier(){
        
    }

    public boolean isBarrier(){
        return barrier;
    }
    
    public void setBarrier(){
        this.barrier = false;
    }

    @Override
    public boolean isCanMove() {
        if(barrier == true){
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
