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
public class CountBits {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for(int i = 0; i <= num; i++){
            result[i] = countOne(i);
        }
        return result;
    }
    
    private int countOne(int num){
        int count = 0;
        while(num > 0){
            count ++;
            num = (num - 1) & num;
        }
        return count;
    }
}
