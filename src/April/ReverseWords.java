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
public class ReverseWords {
    public String reverseWords(String s) {
        String result = "";
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                result += reverseStr(temp);
                temp = "";
                result += " ";
            }else{
                temp += String.valueOf(s.charAt(i));
                if(i == s.length() - 1){
                    result += reverseStr(temp);
                    temp = "";
                }
            }
        }
        return result;
    }
    
    private String reverseStr(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {  
              
            char c = str.charAt(i);  
              
            result += String.valueOf(c);
        } 
        return result;
    }

    
    public static void main(String[] args){
        String str = "Let's take LeetCode contest";
        ReverseWords r = new ReverseWords();
        System.out.println(r.reverseWords(str));
    }

}
