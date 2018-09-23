/**
 * Jack Huang
 * 300343247
 * Comp361 Assignment 3
 *
 * Implementation of the 0-N Knapsack problem using graph search
 */
import java.util.ArrayList;
import java.util.List;

public class KnapsackGS0N {

    int capacity;
    List<Item> fullItemSet;
    int[] bestSolution;
    int maxValue;

    public void solve(int capacity, ArrayList<Item> items){
        maxValue = 0;
        this.capacity = capacity;
        fullItemSet = new ArrayList<>();
        // converts the items into a 0-1 representation of each possible item.
        for (Item i: items) {
            for (int x = 0; x < i.getCount(); x++) {
                fullItemSet.add(i);
            }
        }
        int[] solution = new int[fullItemSet.size()]; //binary array of solution
        graphSearch(0, 0, solution);
    }

    /**
     * Builds a binary tree
     */
    public void graphSearch(int depth, int currentValue, int[] currentSolution){
        if (depth == fullItemSet.size()){
            if (maxValue < currentValue && checkWeight(currentSolution)){
                maxValue = currentValue;
                bestSolution = currentSolution;
            }
        }
        else {
            //add item at depth to solution
            int[] tempSolution = currentSolution;
            tempSolution[depth] = 1;
            int tempValue = currentValue += fullItemSet.get(depth).getValue();
            graphSearch(depth+1, tempValue, tempSolution);

            //don't add item at depth to solution
            tempSolution = currentSolution;
            tempSolution[depth] = 0;
            graphSearch(depth+1, currentValue, tempSolution);
        }
    }

    /**
     * Checks if the given solution is below or equal to the capacity of the knapsack
     * Returns true if it is a viable solution.
     */

    public boolean checkWeight(int[] solution){
        int weight = 0;
        for (int i=0; i<fullItemSet.size(); i++){
            if (solution[i] == 1){
                weight += fullItemSet.get(i).getWeight();
            }
        }
        if (weight <= capacity){
            return true;
        }
        return false;
    }

}
