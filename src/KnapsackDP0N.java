/**
 * Jack Huang
 * 300343247
 * Comp361 Assignment 3
 *
 * Implementation of the 0-N Knapsack problem using dynamic programming
 */
import java.util.ArrayList;


public class KnapsackDP0N {

    public void solve(int capacity, ArrayList<Item> items){
        ArrayList<Item> fullItemSet = new ArrayList<>();
        // converts the items into a 0-1 representation of each possible item.
        for (Item i: items){
            for (int x=0; x<i.getCount(); x++){
                fullItemSet.add(i);
            }
        }
        KnapsackDP01 DP01 = new KnapsackDP01();
        DP01.findOptimal(fullItemSet, capacity);
    }
}
