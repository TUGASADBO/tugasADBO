package engine;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * kelas ini merupakan turunan dari kelas Floor
 * kelas ini merepresentasikan sebuah object IC
 * @author i13026 i13011
 */
public class IntegratedCircuit extends Floor{

    /**
     * constructor kelas IntegratedCircuit
     */
    public IntegratedCircuit() {
        
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
     * @return false
     */
    @Override
    public boolean isKill() {
        return false;
    }
}
