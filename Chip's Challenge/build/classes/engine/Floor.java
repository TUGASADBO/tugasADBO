package engine;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * kelas ini merupakan kelas Parent
 * @author i13026 i13011
 */
public abstract class Floor{
    
    /**
     * constructor kelas Floor
     */
    public Floor(){
        
    }
    
    /**
     * method ini merupakan method abstract untuk mengetahui apakah orang tersebut bisa melangkah ke lantai ini atau tidak
     */
    public abstract boolean isCanMove();
    
    /**
     * method ini merupakan method abstract untuk mengecek apakah seseorang akan mati jika menginjak lantai ini
     */
    public abstract boolean isKill();

}
