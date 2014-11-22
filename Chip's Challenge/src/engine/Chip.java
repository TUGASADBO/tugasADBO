/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 *
 * @author i13026 i13011
 */
public class Chip{

    private int direction;
    private boolean isWearFireBoot;
    private boolean isWearWaterBoot;
    private int positionX;
    private int positionY;

    public Chip() {
        this.direction = 1;
        positionX = 300;
        positionY = 300;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int newDirection) {
        this.direction = newDirection;
    }

    public boolean wearFireBoot() {
        return isWearFireBoot;
    }

    public boolean wearWaterBoot() {
        return isWearWaterBoot;
    }

    public void setWearFireBoot(boolean bool) {
        isWearFireBoot = bool;
    }

    public void setWearWaterBoot(boolean bool) {
        isWearWaterBoot = bool;
    }
    
    public int getPositionX(){
        return positionX;
    }
    
    public int getPositionY(){
        return positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    
    
}
