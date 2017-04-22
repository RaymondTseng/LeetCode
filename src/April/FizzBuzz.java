/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raymondtseng
 */
public class FizzBuzz {
    
    public static void main(String[] args){
        FizzBuzz f = new FizzBuzz();
        List<String> result = f.fizzBuzz(15);
        for(String s : result){
            System.out.println(s);
        }
    }
    
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String temp = "";
            if(i % 3 == 0)
                temp += "Fizz";
            if(i % 5 == 0)
                temp += "Buzz";
            if(temp == "")
                temp = Integer.toString(i);
            result.add(temp);
        }
        return result;
    }
}
