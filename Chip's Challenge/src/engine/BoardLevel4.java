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
public class BoardLevel4 extends Board {
    
    public BoardLevel4() {
        chip = new Chip();
        chipLeft = 0;
        time = 100;
        floor = new Floor[15][15];
        for (int i = 0; i < floor.length; i++) {
            floor[i][0] = new Wall();
            floor[i][14] = new Wall();
            if (i > 0 || i < 14) {
                floor[0][i] = new Wall();
                floor[14][i] = new Wall();
            }
        }
        floor[1][1] = new IntegratedCircuit();
        chipLeft++;
        floor[2][1] = new WaterFloor();
        floor[3][1] = new WaterFloor();
        floor[4][1] = new FireBoots();
        floor[5][1] = new PlainFloor();
        floor[6][1] = new PlainFloor();
        floor[7][1] = new PlainFloor();
        floor[8][1] = new Wall();
        floor[9][1] = new PlainFloor();
        floor[10][1] = new FireFloor();
        floor[11][1] = new PlainFloor();
        floor[12][1] = new FireFloor();
        floor[13][1] = new WaterBoots();

        floor[1][2] = new Wall();
        floor[2][2] = new PlainFloor();
        floor[3][2] = new WaterFloor();
        floor[4][2] = new WaterFloor();
        floor[5][2] = new WaterFloor();
        floor[6][2] = new WaterFloor();
        floor[7][2] = new PlainFloor();
        floor[8][2] = new FireFloor();
        floor[9][2] = new PlainFloor();
        floor[10][2] = new PlainFloor();
        floor[11][2] = new Wall();
        floor[12][2] = new IntegratedCircuit();
        chipLeft++;
        floor[13][2] = new FireFloor();

        floor[1][3] = new WaterFloor();
        floor[2][3] = new WaterFloor();
        floor[3][3] = new Wall();
        floor[4][3] = new PlainFloor();
        floor[5][3] = new WaterFloor();
        for (int i = 6; i <= 11; i++) {
            floor[i][3] = new PlainFloor();
        }

        floor[12][3] = new Wall();
        floor[13][3] = new PlainFloor();

        floor[1][4] = new WaterFloor();
        floor[2][4] = new PlainFloor();
        floor[3][4] = new WaterFloor();
        floor[4][4] = new FireFloor();
        floor[5][4] = new PlainFloor();
        floor[6][4] = new PlainFloor();
        floor[7][4] = new Wall();
        floor[8][4] = new Wall();
        floor[9][4] = new PlainFloor();
        floor[10][4] = new Wall();
        floor[11][4] = new PlainFloor();
        floor[12][4] = new PlainFloor();
        floor[13][4] = new PlainFloor();

        for (int i = 1; i <= 7; i++) {
            floor[i][5] = new PlainFloor();
        }

        floor[8][5] = new FireFloor();
        floor[9][5] = new FireFloor();
        floor[10][5] = new PlainFloor();
        floor[11][5] = new PlainFloor();
        floor[12][5] = new Wall();
        floor[13][5] = new PlainFloor();

        floor[1][6] = new PlainFloor();
        floor[2][6] = new Wall();
        floor[3][6] = new FireFloor();
        floor[4][6] = new Wall();
        floor[5][6] = new FireFloor();
        floor[6][6] = new Wall();
        floor[7][6] = new PlainFloor();
        floor[8][6] = new Wall();
        floor[9][6] = new WaterFloor();
        floor[10][6] = new Wall();
        floor[11][6] = new WaterFloor();
        floor[12][6] = new Wall();
        floor[13][6] = new PlainFloor();

        for (int i = 1; i <= 13; i++) {
            floor[i][7] = new PlainFloor();
        }
        floor[1][8] = new PlainFloor();
        floor[2][8] = new Wall();
        floor[3][8] = new WaterFloor();
        floor[4][8] = new Wall();
        floor[5][8] = new WaterFloor();
        floor[6][8] = new Wall();
        floor[7][8] = new PlainFloor();
        floor[8][8] = new Wall();
        floor[9][8] = new FireFloor();
        floor[10][8] = new Wall();
        floor[11][8] = new FireFloor();
        floor[12][8] = new Wall();
        floor[13][8] = new PlainFloor();

        floor[7][8] = new PlainFloor();
        for (int i = 8; i <= 12; i++) {
            floor[i][8] = new Wall();
        }
        floor[13][8] = new PlainFloor();

        for (int i = 1; i <= 5; i++) {
            floor[i][9] = new PlainFloor();
        }

        floor[6][9] = new Wall();
        floor[7][9] = new PlainFloor();
        floor[8][9] = new Wall();
        floor[9][9] = new PlainFloor();
        floor[10][9] = new PlainFloor();
        floor[11][9] = new Wall();
        floor[12][9] = new PlainFloor();
        floor[13][9] = new PlainFloor();

        floor[1][10] = new Wall();
        floor[2][10] = new FireFloor();
        floor[3][10] = new FireFloor();
        floor[4][10] = new PlainFloor();
        floor[5][10] = new Wall();
        floor[6][10] = new WaterFloor();
        floor[7][10] = new PlainFloor();
        floor[8][10] = new Wall();
        floor[9][10] = new FireFloor();
        floor[10][10] = new FireFloor();
        floor[11][10] = new FireFloor();
        floor[12][10] = new FireFloor();
        floor[13][10] = new Wall();

        for (int i = 1; i <= 5; i++) {
            floor[i][11] = new PlainFloor();
        }

        floor[6][11] = new Wall();
        floor[7][11] = new PlainFloor();
    
        for (int i = 8; i <= 11; i++) {
            floor[i][11] = new WaterFloor();
        }

        floor[12][11] = new Wall();
        floor[13][11] = new PlainFloor();

        floor[1][12] = new PlainFloor();
        floor[2][12] = new Wall();
        floor[3][12] = new Wall();
        floor[4][12] = new Wall();
        floor[5][12] = new FireFloor();
        floor[6][12] = new Wall();
        floor[7][12] = new PlainFloor();
        floor[8][12] = new Wall();
        floor[9][12] = new PlainFloor();
        floor[10][12] = new Wall();
        floor[11][12] = new Wall();
        floor[12][12] = new PlainFloor();
        floor[13][12] = new Wall();

        floor[1][13] = new IntegratedCircuit();
        chipLeft++;
        floor[2][13] = new Wall();
        floor[3][13] = new IntegratedCircuit();
        chipLeft++;
        floor[4][13] = new PlainFloor();
        floor[5][13] = new FireFloor();
        floor[6][13] = new FireFloor();
        floor[7][13] = new PlainFloor();
        floor[8][13] = new Wall();
        floor[9][13] = new PlainFloor();
        floor[10][13] = new PlainFloor();
        floor[11][13] = new Barrier();
        floor[12][13] = new PlainFloor();
        floor[13][13] = new FinishFloor();

    }
    
    @Override
    public int getTime() {
        return time;
    }
}
