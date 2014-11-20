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
public abstract class Boots extends Floor{
    
    protected boolean isWearFireBoots;
    protected boolean isWearWaterBoots;
     
    public Boots()
    {}
 
    public abstract void setWearBoots();
    
    public boolean getIsWearFireBoots(){
        return this.isWearFireBoots;
    }
    
    public boolean getIsWearWaterBoots(){
        return this.isWearWaterBoots;
    }
}
