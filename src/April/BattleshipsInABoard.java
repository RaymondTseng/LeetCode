/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April;

/**
 *
 * @author raymondtseng
 */
public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int count = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'X'){
                    if((i-1)<0 || board[i-1][j] != 'X'){
                        if((j-1)<0 || board[i][j-1] != 'X'){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        BattleshipsInABoard b = new BattleshipsInABoard();
        char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        System.out.println(b.countBattleships(board));
    }
}
