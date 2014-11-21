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
public class WaterBoots extends Boots{

    @Override
    public void setWearBoots() {
        super.isWearWaterBoots = true;
    }

    @Override
    public boolean isCanMove() {
        return true;
    }

    @Override
    public boolean isKill() {
        return false;
    }
    
}
