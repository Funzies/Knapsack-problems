import java.util.ArrayList;

/**
 * Jack Huang
 * 300343247
 * COMP361 Assignment 3
 * Brute force implementation of the 0N knapsack problem
 */

public class KnapsackBF0N {

    private int capacity;
    private ArrayList<Item> items;

    public KnapsackBF0N(int capacity, ArrayList<Item> items){
        this.capacity = capacity;
        this.items = items;
        solve();
    }

    public void solve(){
        int maxValue;
        ArrayList<Integer> bestSolutionSet = new ArrayList<>();

    }
}
