/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * kelas ini merupakan turunan dari kelas Board
 * kelas ini adalah implementasi dari papan permainan level 1
 * @author i13026 i13011
 */
public class BoardLevel1 extends Board {

    /**
     * constructor kelas BoardLevel1
    */
    public BoardLevel1() {
        chip = new Chip();
        chipLeft = 0;
        floor = new Floor[11][11];
        time = 50;
        for (int i = 0; i < floor.length; i++) {
            floor[i][0] = new Wall();
            floor[i][10] = new Wall();
            if (i > 0 || i < 10) {
                floor[0][i] = new Wall();
                floor[10][i] = new Wall();
            }
        }
        floor[1][1] = new PlainFloor();
        floor[2][1] = new PlainFloor();
        floor[3][1] = new PlainFloor();
        floor[4][1] = new IntegratedCircuit();
        chipLeft++;
        floor[5][1] = new Wall();
        floor[6][1] = new IntegratedCircuit();
        chipLeft++;
        floor[7][1] = new PlainFloor();
        floor[8][1] = new PlainFloor();
        floor[9][1] = new PlainFloor();

        floor[1][2] = new PlainFloor();
        floor[2][2] = new FireFloor();
        floor[3][2] = new FireFloor();
        floor[4][2] = new FireFloor();
        floor[5][2] = new Wall();
        floor[6][2] = new FireFloor();
        floor[7][2] = new FireFloor();
        floor[8][2] = new FireFloor();
        floor[9][2] = new PlainFloor();

        floor[1][3] = new PlainFloor();
        floor[2][3] = new PlainFloor();
        floor[3][3] = new PlainFloor();
        floor[4][3] = new PlainFloor();
        floor[5][3] = new Wall();
        floor[6][3] = new PlainFloor();
        floor[7][3] = new PlainFloor();
        floor[8][3] = new PlainFloor();
        floor[9][3] = new PlainFloor();
        for (int i = 1; i < floor.length - 1; i++) {
            floor[i][4] = new PlainFloor();
        }

        floor[1][5] = new FireFloor();
        floor[2][5] = new FireFloor();
        floor[3][5] = new PlainFloor();
        floor[4][5] = new PlainFloor();
        floor[5][5] = new PlainFloor();
        floor[6][5] = new PlainFloor();
        floor[7][5] = new PlainFloor();
        floor[8][5] = new FireFloor();
        floor[9][5] = new FireFloor();

        for (int i = 2; i < floor.length - 2; i++) {
            floor[i][6] = new PlainFloor();
        }
        floor[1][6] = new FireFloor();
        floor[9][6] = new FireFloor();

        floor[1][7] = new FireFloor();
        floor[2][7] = new PlainFloor();
        floor[3][7] = new Wall();
        floor[4][7] = new Wall();
        floor[5][7] = new Barrier();
        floor[6][7] = new Wall();
        floor[7][7] = new Wall();
        floor[8][7] = new PlainFloor();
        floor[9][7] = new FireFloor();

        floor[1][8] = new FireFloor();
        floor[2][8] = new PlainFloor();
        floor[3][8] = new Wall();
        floor[4][8] = new PlainFloor();
        floor[5][8] = new PlainFloor();
        floor[6][8] = new PlainFloor();
        floor[7][8] = new Wall();
        floor[8][8] = new PlainFloor();
        floor[9][8] = new FireFloor();

        floor[1][9] = new IntegratedCircuit();
        chipLeft++;
        floor[2][9] = new PlainFloor();
        floor[3][9] = new Wall();
        floor[4][9] = new PlainFloor();
        floor[5][9] = new FinishFloor();
        floor[6][9] = new PlainFloor();
        floor[7][9] = new Wall();
        floor[8][9] = new PlainFloor();
        floor[9][9] = new IntegratedCircuit();
        chipLeft++;
    }

    /**
     * method override untuk mendapatkan waktu dari papan permainan level 1
     * @return waktu
     */
    @Override
    public int getTime() {
        return time;
    }
}
