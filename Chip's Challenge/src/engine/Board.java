/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import java.util.ArrayList;

/**
 * kelas ini merupakan implementasi dari papan permainan
 * @author i13026 i13011
 */
public class Board {

    /**
     * atribut array dua dimensi bertipe Floor
     */
    protected Floor[][] floor;
    
    /**
     * atribut orang untuk permainan tersebut
     */
    protected Chip chip;
    
    /**
     * atribut chip yang tersisa
     */
    protected int chipLeft;
    
    /**
     * atribut waktu yang tersisa untuk permainan
     */
    protected int time;

    /**
     * constructor kelas Board
     */
    public Board() {
        
    }

    /**
     * method ini untuk mengeset floor pada koordinat x dan koordinat y
     * @param flo lantai jenis apa yang ingin diset
     * @param x koordinat x yang ingin diset
     * @param y koordinat y yang ingin diset
     */
    public void setFloor(Floor flo, int x, int y) {
        this.floor[x][y] = flo;
    }

    /**
     * method untuk mendapatkan array dua dimensi dari Floor
     * @return array dua dimensi floor
     */
    public Floor[][] getFloor() {
        return this.floor;
    }

    /**
     * method untuk mendapatkan panjang array dari atribut array dua dimensi
     * @return panjang array
     */
    public int getLength() {
        return this.floor.length;
    }

    /**
     * method untuk mendapatkan tinggi dari atribut array dua dimensi
     * @return tinggi array
     */
    public int getHeight() {
        return this.floor[0].length;
    }
    
    /**
     * method untuk mendapatkan jumlah chip yang tersisa
     * @return atribut chipLeft
     */
    public int getChipLeft() {
        return this.chipLeft;
    }

    /**
     * method untuk mengurangi jumlah chipLeft
     */
    public void setChipLeft() {
        this.chipLeft--;
    }

    /**
     * method ini untuk mendapatkan objek orang dari permainan ini
     * @return atribut chip
     */
    public Chip getChip() {
        return this.chip;
    }
    
    /**
     * method untuk mendapatkan waktu dari suatu papan permainan.
     * @return atribut time
     */
    public int getTime(){
        return time;
    }
}
