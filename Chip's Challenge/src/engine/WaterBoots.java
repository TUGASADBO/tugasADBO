/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

/**
 * kelas ini merupakan turunan dari kelas Boots
 * kelas ini merepresentasikan sebuah object WaterBoots
 * @author i13026 i13011
 */
public class WaterBoots extends Boots{
    
    /**
     * constructor kelas WaterBoots
     */
    public WaterBoots(){
        
    }
    
    /**
     * method ini untuk mengetahui apakah orang tersebut bisa melangkah ke lantai ini atau tidak
     * @return false
     */
    @Override
    public boolean isCanMove() {
        return true;
    }

    /**
     * method ini untuk mengecek apakah seseorang akan mati jika menginjak lantai ini
     * @return false
     */
    @Override
    public boolean isKill() {
        return false;
    }  
}
