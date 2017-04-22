/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author raymondtseng
 */
public class Stock {
    private static List<Integer> counts = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int limit = (n - 1) / 2;
        chooseStock(n, limit, 0);
        for(int i: counts){
            System.out.println(i);
        }
    }
    
    
    private static void chooseStock(int n, int limit, int count){
        if(n == 0 || limit == 0){
            counts.add(count);
            return;
        }else if(n <= limit){
            ++count;
            counts.add(count);
            return;
        }else{
            if(n < 2 * limit){
                limit = (n - 1) / 2;
            }
            while(limit > 0){
                count++;
                chooseStock(n-limit, limit, count);
                limit--;
                count--;
            }
        }

    }
}
