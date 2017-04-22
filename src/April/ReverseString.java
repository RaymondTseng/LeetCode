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
public class ReverseString {
    public String reverseString(String s) {
        char[] result = new char[s.length()];
        for(int i = s.length() - 1; i >= 0; i--){
            result[s.length() -1 - i] = s.charAt(i);
        }
        return String.valueOf(result);
    }
}
