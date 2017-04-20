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
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int n = x^y;
        int count = 0;
        while(n > 0){
            ++ count;
            n = (n - 1) & n;
        }
        return count;
    }
    
    public static void main(String[] args){
        HammingDistance h = new HammingDistance();
        System.out.println(h.hammingDistance(1, 4));
    }
}
