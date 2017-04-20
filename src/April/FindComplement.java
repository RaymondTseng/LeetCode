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
public class FindComplement {
    
    public int findComplement(int num) {
        int e = (int) (Math.log(num) / Math.log(2));
        int other_num = 0;
        while(e >= 0){
            other_num += Math.pow(2, e);
            e--;
        }
        return other_num ^ num;
    }
    
    public static void main(String[] args){
        int num = 1;
        FindComplement f = new FindComplement();
        System.out.println(f.findComplement(num));
    }
}
