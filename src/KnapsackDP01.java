/**
 * Jack Huang
 * Comp361 Assignment 3
 *
 * Implementation of the 0-1 Knapsack problem using dynamic programming
 */

import java.util.ArrayList;
public class KnapsackDP01 {
    int capacity;
    ArrayList<Item> items;


    public KnapsackDP01(ArrayList<Item> items, int capacity){
        this.capacity = capacity;
        this.items = items;
    }

    /**
     * Uses dynamic programming to find the optimal set of items
     */
    public void findOptimal(){
        int[][] table = new int[items.size()][capacity+1];
        //all values in column 0 equals 0 as capacity is 0
        for (int i = 0; i < items.size(); i++ ){
            table[i][0] = 0;
        }
        //when only 1 item is considered, as long as the weight is less than or equal to the capacity, you'll pick it up
        for (int i = 0; i < table[0].length; i++ ){
            if (items.get(0).getWeight() <= i) {
                table[0][i] = items.get(0).getValue();
            }
            else { table[0][i] = 0; }
        }
        for (int i = 1; i < table.length; i++){
            for (int j = 1; j < table[0].length; j++){
                table[i][j] = findMax(table, i, j);
            }
        }
        printTable(table);
    }


    public int findMax(int[][] table, int i, int j){
        Item candidate = items.get(i);
        if (j-candidate.getWeight() < 0){
            return table[i-1][j];
        }
        return Math.max(table[i-1][j], table[i-1][j-candidate.getWeight()] + candidate.getValue());
    }


    /**
     * testing purposes
     */
    public void printTable(int[][] table){
        for (int i = 0; i < table.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < table[0].length; j++) {
                sb.append(" "+Integer.toString(table[i][j])+" ");
            }
            System.out.println(sb.toString() + '\n');
        }
    }

}
