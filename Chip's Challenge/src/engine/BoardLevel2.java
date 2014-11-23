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
public class BoardLevel2 extends Board{

    public BoardLevel2() {
        chip = new Chip();
        chipLeft = 0;
        time = 70;
        floor = new Floor[11][11];
        for (int i = 0; i < floor.length; i++) {
            floor[i][0] = new Wall();
            floor[i][10] = new Wall();
            if (i > 0 || i < 10) {
                floor[0][i] = new Wall();
                floor[10][i] = new Wall();
            }
        }
        floor[1][1] = new FireFloor();
        floor[2][1] = new PlainFloor();
        floor[3][1] = new PlainFloor();
        floor[4][1] = new PlainFloor();
        floor[5][1] = new FireFloor();
        floor[6][1] = new Wall();
        floor[7][1] = new IntegratedCircuit();
        chipLeft++;
        floor[8][1] = new FireFloor();
        floor[9][1] = new FireFloor();

        floor[1][2] = new PlainFloor();
        floor[2][2] = new PlainFloor();
        floor[3][2] = new FireFloor();
        floor[4][2] = new PlainFloor();
        floor[5][2] = new FireFloor();
        floor[6][2] = new Wall();
        floor[7][2] = new Wall();
        floor[8][2] = new Wall();
        floor[9][2] = new FireFloor();

        floor[1][3] = new PlainFloor();
        floor[2][3] = new Wall();
        floor[3][3] = new Wall();

        for (int i = 4; i < floor.length - 1; i++) {
            floor[i][3] = new PlainFloor();
        }
        floor[1][4] = new PlainFloor();
        floor[2][4] = new FireBoots();
        floor[3][4] = new Wall();
        floor[4][4] = new Wall();
        floor[5][4] = new Wall();
        floor[6][4] = new Wall();
        floor[7][4] = new PlainFloor();
        floor[8][4] = new Wall();
        floor[9][4] = new PlainFloor();

        floor[1][5] = new FireFloor();
        floor[2][5] = new IntegratedCircuit();
        chipLeft++;
        floor[3][5] = new Wall();
        floor[4][5] = new PlainFloor();
        floor[5][5] = new PlainFloor();
        floor[6][5] = new PlainFloor();
        floor[7][5] = new PlainFloor();
        floor[8][5] = new Wall();
        floor[9][5] = new FireFloor();

        floor[1][6] = new Wall();
        floor[2][6] = new Wall();
        floor[3][6] = new Wall();
        floor[4][6] = new PlainFloor();
        floor[5][6] = new PlainFloor();
        floor[6][6] = new PlainFloor();
        floor[7][6] = new Wall();
        floor[8][6] = new Wall();
        floor[9][6] = new FireFloor();

        for (int i = 1; i < 7; i++) {
            floor[i][7] = new PlainFloor();
        }
        floor[7][7] = new Wall();
        floor[8][7] = new FireFloor();
        floor[9][7] = new IntegratedCircuit();
        chipLeft++;

        floor[1][8] = new FireFloor();
        floor[2][8] = new Wall();
        floor[3][8] = new Wall();
        floor[4][8] = new Wall();
        floor[5][8] = new Barrier();
        for (int i = 6; i < floor.length - 1; i++) {
            floor[i][8] = new Wall();
        }

        floor[1][9] = new FireFloor();
        floor[2][9] = new FireFloor();
        floor[3][9] = new IntegratedCircuit();
        chipLeft++;
        floor[4][9] = new Wall();
        floor[5][9] = new PlainFloor();
        floor[6][9] = new FireFloor();
        floor[7][9] = new FireFloor();
        floor[8][9] = new FireFloor();
        floor[9][9] = new FinishFloor();
    }
    
    @Override
    public int getTime() {
        return time;
    }
}
