/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * kelas ini merupakan turunan dari kelas Board
 * kelas ini adalah implementasi dari papan permainan level 4
 * @author i13026 i13011
 */
public class BoardLevel4 extends Board {

    /**
     * constructor kelas BoardLevel4
     */
    public BoardLevel4() {
        chip = new Chip();
        chipLeft = 0;
        time = 100;
        floor = new Floor[15][11];
        for (int i = 0; i < floor.length; i++) {
            floor[i][0] = new Wall();
            floor[i][10] = new Wall();

        }
        for (int i = 0; i <= 10; i++) {
            floor[0][i] = new Wall();
            floor[14][i] = new Wall();
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
        floor[2][4] = new Wall();
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

        for (int i = 1; i <= 3; i++) {
            floor[i][5] = new PlainFloor();
        }
        floor[4][5] = new Wall();
        for (int i = 5; i <= 7; i++) {
            floor[i][5] = new PlainFloor();
        }
        floor[8][5] = new FireFloor();
        floor[9][5] = new FireFloor();
        floor[10][5] = new PlainFloor();
        floor[11][5] = new PlainFloor();
        floor[12][5] = new Wall();
        floor[13][5] = new PlainFloor();

        floor[1][6] = new Wall();
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
        floor[9][7] = new Wall();
        floor[1][8] = new PlainFloor();
        floor[2][8] = new Wall();
        floor[3][8] = new WaterFloor();
        floor[4][8] = new Wall();
        floor[5][8] = new WaterFloor();
        floor[6][8] = new Wall();
        floor[7][8] = new PlainFloor();
        floor[8][8] = new Wall();
        floor[9][8] = new FireFloor();
        floor[10][8] = new PlainFloor();
        floor[11][8] = new FireFloor();
        floor[12][8] = new Wall();
        floor[13][8] = new Barrier();
        
        floor[1][9] = new PlainFloor();
        floor[2][9] = new IntegratedCircuit();
        chipLeft++;
        floor[3][9] = new Wall();
        floor[4][9] = new PlainFloor();
        floor[5][9] = new PlainFloor();
        floor[6][9] = new PlainFloor();
        floor[7][9] = new PlainFloor();
        floor[8][9] = new Wall();
        floor[9][9] = new IntegratedCircuit();
        chipLeft++;
        floor[10][9] = new PlainFloor();
        floor[11][9] = new Wall();
        floor[12][9] = new FinishFloor();
        floor[13][9] = new PlainFloor();

    }

    /**
     * method override untuk mendapatkan waktu dari papan permainan level 4
     * @return waktu
     */
    @Override
    public int getTime() {
        return time;
    }
}
