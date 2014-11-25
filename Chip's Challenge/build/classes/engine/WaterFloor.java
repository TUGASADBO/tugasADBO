/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

/**
 * kelas ini merupakan turunan dari kelas Floor
 * kelas ini merepresentasikan sebuah object WaterFloor
 * @author i13026 i13011
 */
public class WaterFloor extends Floor{

    /**
     * constructor kelas WaterFloor
     */
    public WaterFloor(){
        
    }
    
    /**
     * method ini untuk mengetahui apakah orang tersebut bisa melangkah ke lantai ini atau tidak
     * @return true
     */
    @Override
    public boolean isCanMove() {
        return true;
    }

    /**
     * method ini untuk mengecek apakah seseorang akan mati jika menginjak lantai ini
     * @return true
     */
    @Override
    public boolean isKill() {
        return true;
    }
}
