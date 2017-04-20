/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author raymondtseng
 */
public class Codec {
    
    private String dict = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private HashMap<String, String> encodeMap;
    private HashMap<String, String> decodeMap;
    
    public Codec(){
        encodeMap = new HashMap<>();
        decodeMap = new HashMap<>();
    }
        // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(encodeMap.containsKey(longUrl)){
            return "http://tinyurl.com/" + encodeMap.get(longUrl);
        }
        String randomStr = randomStr();
        while(decodeMap.containsKey(randomStr)){
            randomStr = randomStr();
        }
        encodeMap.put(longUrl, randomStr);
        decodeMap.put(randomStr, longUrl);
        return "http://tinyurl.com/" + randomStr;
    }
    
    private String randomStr(){
        String str = "";
        Random random = new Random();
        for(int i = 0; i < 6; i++){
            int index = random.nextInt(dict.length());
            str += dict.charAt(index);
        }
        return str;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String temp = shortUrl.substring(shortUrl.lastIndexOf('/')+1);
        String longUrl = decodeMap.get(temp);
        return longUrl;
    }
    
    public static void main(String[] args){
        String s = "https://leetcode.com/problems/design-tinyurl";
        Codec c = new Codec();
        String t = c.encode(s);
        System.out.println(t);
        System.out.println(c.decode(t));
    }
}
