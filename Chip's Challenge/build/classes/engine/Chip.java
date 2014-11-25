/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * kelas ini merupakan implementasi dari sebuah objek orang
 * @author i13026 i13011
 */
public class Chip{

    /**
     * atribut arah sekarang dari orang tersebut
     */
    private int direction;
    
    /**
     * atribut sepatu api
     */
    private boolean isWearFireBoot;
    
    /**
     * atribut sepatu air
     */
    private boolean isWearWaterBoot;
    
    /**
     * atribut posisi chip dalam koordinat x
     */
    private int positionX;
    
    /**
     * atribut posisi chip dalam koordinat y
     */
    private int positionY;

    /**
     * constructor kelas Chip
     */
    public Chip() {
        this.direction = 1;
        positionX = 300;
        positionY = 300;
    }

    /**
     * method untuk mendapatkan arah sekarang dari orabg tersebut
     * @return 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * method untuk mengeset arah sekarang dari orang tersebut
     * @param newDirection arah baru yang ingin diset
     */
    public void setDirection(int newDirection) {
        this.direction = newDirection;
    }

    /**
     * method untuk mendapatkan apakah orang tersebut memakai sepatu api atau tidak
     * @return atribut sepatu api
     */
    public boolean wearFireBoot() {
        return isWearFireBoot;
    }

    /**
     * method untuk mendapatkan apakah orang tersebut memakai sepatu air atau tidak
     * @return atribut sepatu air
     */
    public boolean wearWaterBoot() {
        return isWearWaterBoot;
    }

    /**
     * method untuk mengeset pemakaian sepatu api
     * @param bool true atau false
     */
    public void setWearFireBoot(boolean bool) {
        isWearFireBoot = bool;
    }

    /**
     * method untuk mengeset pemakaian sepatu air
     * @param bool true atau false
     */
    public void setWearWaterBoot(boolean bool) {
        isWearWaterBoot = bool;
    }
    
    /**
     * method untuk mendapatkan posisi saat ini dari orang tersebut dalam koordinat x
     * @return posisi x
     */
    public int getPositionX(){
        return positionX;
    }
    
    /**
     * method untuk mendapatkan posisi saat ini dari orang tersebut dalam koordinat y
     * @return posisi y
     */
    public int getPositionY(){
        return positionY;
    }

    /**
     * method untuk mengeset posisi orang dalam koordinat x
     * @param positionX posisi baru yang ingin diset
     */
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    /**
     * method untuk mengeset posisi orang dalam koordinat y
     * @param positionY posisi baru yang ingin diset
     */
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    
    
}
