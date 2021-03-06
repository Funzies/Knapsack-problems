/**
 * Jack Huang
 * 300343247
 * Comp361 Assignment 3
 *
 * Implementation of the 0-1 Knapsack problem using dynamic programming
 */

import java.util.ArrayList;
public class KnapsackDP01 {
    private int capacity;
    private ArrayList<Item> items;

    /**
     * Uses dynamic programming to find the optimal set of items
     */
    public void findOptimal(ArrayList<Item> itemList, int capacity){
        this.capacity = capacity;
        this.items = itemList;
        long startTime = System.nanoTime();
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
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        printChoices();
        printTable(table);
        printSolution(table);
        System.out.println("Time taken: " + duration +"\n --------------------");
    }

    /**
     * Finds the maximum value of either picking up the item or not
     */
    public int findMax(int[][] table, int i, int j){
        Item candidate = items.get(i);
        if (j-candidate.getWeight() < 0){
            return table[i-1][j];
        }
        return Math.max(table[i-1][j], table[i-1][j-candidate.getWeight()] + candidate.getValue());
    }

    /**
     * Finds the solution to the knapsack problem, given the completed table
     */
    public void printSolution(int[][] table){
        int value = 0;
        ArrayList<Integer> solutions = new ArrayList<>();
        int i = table.length-1;
        int j = table[0].length-1;
        while (i > 0){
            if (table[i][j] > table[i-1][j]){ //this means we took the new item, i.
                solutions.add(i);
                value += items.get(i).getValue();
                j = j - items.get(i).getWeight();
                i = i-1;
            }
            else { //we did not take item i.
                i = i-1;
            }
        }
        //check for if we picked up item 0
        if(table[i][j] > 0){
            solutions.add(i);
            value += items.get(i).getValue();
        }
        //print solutions
        StringBuilder sb = new StringBuilder("Items to pick up are: ");
        for (int s : solutions){
            sb.append(s +", ");
        }
        sb.append("with value "+value+".");
        System.out.println(sb.toString());
    }

    /**
     * shows the choices to the knapsack problem
     */
    public void printChoices(){
        for (int i=0; i < items.size(); i++) {
            System.out.println("Item "+i+": value="+items.get(i).getValue()+", weight="+items.get(i).getWeight());
        }
    }


    /**
     * visualization purposes
     */
    public void printTable(int[][] table){
        for (int i = 0; i < table.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < table[0].length; j++) {
                sb.append(" "+Integer.toString(table[i][j]));
            }
            System.out.println(sb.toString());
        }
    }

}
