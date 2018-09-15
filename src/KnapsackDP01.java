/**
 * Jack Huang
 * Comp361 Assignment 3
 *
 * Implementation of the 0-1 Knapsack problem using dynamic programming
 */

import java.util.ArrayList;
public class KnapsackDP01 {
    int capacity;
    ArrayList items;


    public KnapsackDP01(ArrayList<Item> items, int capacity){
        this.capacity = capacity;
        this.items = items;
    }

    /**
     * Uses dynamic programming to find the optimal set of items
     */
    public void findOptimal(){
        int[][] table = new int[items.size()][capacity];
        for (int i = 0; i < items.size(); i++ ){
            table[i][0] = GAPCOST * i;
        }
        for (int i = 0; i < capacity; i++ ){
            table[0][i] = GAPCOST * i;
        }
        for (int i = 1; i < table.length; i++){
            for (int j = 1; j < table[0].length; j++){
                table[i][j] = findMax(table, x, y, i, j);
            }
        }

    }


}
