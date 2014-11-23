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
public class BoardLevel3 extends Board {

    public BoardLevel3() {
        chip = new Chip();
        chipLeft = 0;
        time = 100;
        floor = new Floor[15][11];
        chip.setPositionX(400);
        chip.setPositionY(400);
        for (int i = 0; i < floor.length; i++) {
            floor[i][0] = new Wall();
            floor[i][10] = new Wall();
           
        }
        for(int i=0;i<=10;i++)
        {
            floor[0][i] = new Wall();
            floor[14][i] = new Wall();
        }
        floor[1][1] = new PlainFloor();
        floor[2][1] = new FireFloor();
        floor[3][1] = new PlainFloor();
        floor[4][1] = new FireFloor();
        floor[5][1] = new PlainFloor();
        floor[6][1] = new PlainFloor();
        floor[7][1] = new WaterFloor();
        floor[8][1] = new PlainFloor();
        floor[9][1] = new FireFloor();
        floor[10][1] = new FireFloor();
        floor[11][1] = new FireFloor();
        floor[12][1] = new FireFloor();
        floor[13][1] = new IntegratedCircuit();
        chipLeft++;

        floor[1][2] = new FireFloor();
        floor[2][2] = new FireFloor();
        floor[3][2] = new Wall();
        floor[4][2] = new Wall();
        floor[5][2] = new PlainFloor();
        floor[6][2] = new WaterFloor();
        floor[7][2] = new PlainFloor();
        floor[8][2] = new PlainFloor();
        floor[9][2] = new Wall();
        floor[10][2] = new Wall();
        floor[11][2] = new FireFloor();
        floor[12][2] = new Wall();
        floor[13][2] = new Wall();

        floor[1][3] = new PlainFloor();
        floor[2][3] = new PlainFloor();
        floor[3][3] = new IntegratedCircuit();
        chipLeft++;
        floor[4][3] = new Wall();
        floor[10][3] = new Wall();
        floor[11][3] = new PlainFloor();
        floor[12][3] = new PlainFloor();
        floor[13][3] = new PlainFloor();

        for (int i = 5; i <= 9; i++) {
            floor[i][3] = new PlainFloor();
        }
        floor[1][4] = new FireFloor();
        floor[2][4] = new Wall();
        floor[3][4] = new Wall();
        floor[4][4] = new Wall();
        floor[5][4] = new WaterFloor();
        floor[6][4] = new Wall();
        floor[7][4] = new WaterFloor();
        floor[8][4] = new PlainFloor();
        floor[9][4] = new PlainFloor();
        floor[10][4] = new WaterFloor();
        floor[11][4] = new WaterFloor();
        floor[12][4] = new Wall();
        floor[13][4] = new PlainFloor();

        floor[6][5] = new FireFloor();
        floor[7][5] = new PlainFloor();
        floor[8][5] = new FireFloor();
        floor[9][5] = new Wall();
        floor[10][5] = new Wall();
        floor[11][5] = new Wall();
        floor[12][5] = new PlainFloor();
        floor[13][5] = new PlainFloor();

        for (int i = 1; i <= 5; i++) {
            floor[i][5] = new PlainFloor();
        }

        floor[9][6] = new WaterFloor();
        floor[10][6] = new WaterFloor();
        floor[11][6] = new Wall();
        floor[12][6] = new PlainFloor();
        floor[13][6] = new Wall();

        for (int i = 1; i <= 4; i++) {
            floor[i][6] = new Wall();
        }
        for (int i = 5; i <= 8; i++) {
            floor[i][6] = new PlainFloor();
        }
        floor[1][7] = new PlainFloor();
        floor[2][7] = new PlainFloor();
        floor[3][7] = new FireFloor();
        floor[4][7] = new FireFloor();
        floor[5][7] = new PlainFloor();
        floor[6][7] = new PlainFloor();
        floor[7][7] = new PlainFloor();
        floor[8][7] = new PlainFloor();
        floor[9][7] = new PlainFloor();
        floor[10][7] = new PlainFloor();
        floor[11][7] = new WaterFloor();
        floor[12][7] = new Barrier();
        floor[13][7] = new PlainFloor();

        floor[1][8] = new PlainFloor();
        floor[2][8] = new Wall();
        floor[3][8] = new Wall();
        floor[4][8] = new FireFloor();
        floor[5][8] = new WaterFloor();
        floor[6][8] = new Wall();
        floor[7][8] = new PlainFloor();
        floor[8][8] = new Wall();
        floor[9][8] = new FireFloor();
        floor[10][8] = new FireFloor();
        floor[11][8] = new FireFloor();
        floor[12][8] = new Wall();
        floor[13][8] = new PlainFloor();

        floor[1][9] = new PlainFloor();
        floor[2][9] = new IntegratedCircuit();
        chipLeft++;
        floor[3][9] = new Wall();
        floor[4][9] = new Wall();
        floor[5][9] = new WaterFloor();
        floor[6][9] = new FireBoots();
        floor[7][9] = new PlainFloor();
        floor[8][9] = new Wall();
        floor[9][9] = new PlainFloor();
        floor[10][9] = new FireFloor();
        floor[11][9] = new IntegratedCircuit();
        chipLeft++;
        floor[12][9] = new Wall();
        floor[13][9] = new FinishFloor();

     

    }
    
    @Override
    public int getTime() {
        return time;
    }
}
