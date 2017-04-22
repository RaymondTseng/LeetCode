/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author raymondtseng
 */
public class FindWords {
    private List<Set> wordList;
    public FindWords(){
        wordList = new ArrayList<>();
        Set<Character> set1 = new HashSet<>();
        set1.add('q');
        set1.add('w');
        set1.add('e');
        set1.add('r');
        set1.add('t');
        set1.add('y');
        set1.add('u');
        set1.add('i');
        set1.add('o');
        set1.add('p');
        wordList.add(set1);
        Set<Character> set2 = new HashSet<>();
        set2.add('a');
        set2.add('s');
        set2.add('d');
        set2.add('f');
        set2.add('g');
        set2.add('h');
        set2.add('j');
        set2.add('k');
        set2.add('l');
        wordList.add(set2);
        Set<Character> set3 = new HashSet<>();
        set3.add('z');
        set3.add('x');
        set3.add('c');
        set3.add('v');
        set3.add('b');
        set3.add('n');
        set3.add('m');
        wordList.add(set3);
    }
    public String[] findWords(String[] words) {
        List<String> tempList = new ArrayList<>();
        int count = 0;
        for(String word : words){
            String temp = word.toLowerCase();
            int index = confirmIndex(temp.charAt(0));
            boolean state = true;
            for(int i = 1; i < temp.toCharArray().length; i++){
                if(!wordList.get(index).contains(temp.charAt(i))){
                    state = false;
                    break;
                }
            }
            if(state){
                tempList.add(word);
            }
        }
        String[] result = new String[tempList.size()];
        for(int i = 0; i < tempList.size(); i++){
            result[i] = tempList.get(i);
        }
        return result;
    }
    
    private int confirmIndex(char c){
        int tag = -1;
        for(int i = 0; i < wordList.size(); i++){
            Set<String> wordSet = wordList.get(i);
            if(wordSet.contains(c)){
                tag = i;
                break;
            }
        }
        return tag;
    }
}
