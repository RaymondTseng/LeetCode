/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raymondtseng
 */
public class NextGreaterElement {
    public static void main(String[] args){
        NextGreaterElement n = new NextGreaterElement();
        int[] findNums = {4,1,2};
        int[] nums = {1,3,4,2};
        n.nextGreaterElement(findNums, nums);
        System.out.println("");
    }
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Stack stack = new Stack();
        Map<Integer, Integer> elementMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            while(stack.size != 0 && stack.peek().data < nums[i]){
                elementMap.put(stack.peek().data, nums[i]);
                stack.pop();
            }
            stack.push(nums[i]);
        }
        int[] result = new int[findNums.length];
        for(int i = 0; i < findNums.length; i++){
            result[i] = elementMap.getOrDefault(findNums[i], -1);
        }
        return result;
    }
    
    class Stack{
        private StackNode head;
        private int size;
        
        public Stack(){
            this.head = null;
            this.size = 0;
        }
        
        public void push(int data){
            if(head == null)
                head = new StackNode(data);
            else{
                StackNode node = new StackNode(data);
                node.next = head;
                head = node;
            }
            size++;
        }
        
        public StackNode pop(){
            if(head == null)
                return null;
            else{
                StackNode temp = head;
                head = head.next;
                size--;
                return temp;
            }
        }
        
        public StackNode peek(){
            return head;
        }
        
    }
    
    class StackNode{
        int data;
        StackNode next;
        
        public StackNode(int data){
            this.data = data;
        }
    }
}
