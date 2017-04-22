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
public class IslandPerimeter {

    public static void main(String[] args) {
        IslandPerimeter i = new IslandPerimeter();
//        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] grid = {{1}, {0}};
        i.islandPerimeter(grid);
    }

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    if(i - 1 < 0 || grid[i-1][j] == 0){
                        count ++;
                    }
                    if(i + 1 >= grid.length || grid[i+1][j] == 0){
                        count ++;
                    }
                    if(j - 1 < 0 || grid[i][j-1] == 0){
                        count ++;
                    }
                    if(j + 1 >= grid[i].length || grid[i][j+1] == 0){
                        count ++;
                    }
                }
            }
        }
        return count;
        
        
    }

    private int checkCell(int i, int j, int[][] grid, Queue queue) {
        int count = 0;
        if (i - 1 < 0 || grid[i - 1][j] == 0) {
            count++;
        }
        if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
            count++;
        }
        if (j - 1 < 0 || grid[i][j - 1] == 0) {
            count++;
        }
        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
            count++;
        }
        return count;
    }
    
    class QueueNode{
        int x;
        int y;
        QueueNode next;
        
        public QueueNode(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    class Queue{
        int size;
        QueueNode head;
        QueueNode tail;
        
        public Queue(){
            size = 0;
        }
        
        public void add(int x, int y){
            if(head == null){
                head = new QueueNode(x, y);
                tail = head;
            }else{
                tail.next = new QueueNode(x, y);
                tail = tail.next;
            }
            size++;
        }
        
        public QueueNode remove(){
            if(head == null){
                return null;
            }else{
                QueueNode temp = head;
                head = head.next;
                size--;
                return temp;
            }
        }
    }

}
