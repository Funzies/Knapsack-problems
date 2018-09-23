/**
 * Jack Huang
 * 300343247
 * Comp361 Assignment 3
 *
 * Implementation of the 0-N Knapsack problem using graph search
 */
import java.util.ArrayList;
import java.util.Arrays;
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
        long startTime = System.nanoTime();
        int[] solution = new int[fullItemSet.size()]; //binary array of solution
        graphSearch(0, 0, solution);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        printChoices();
        printSolution();
        System.out.println("Time taken: " + duration +"\n --------------------");
    }

    /**
     * Builds a binary tree
     */
    public void graphSearch(int depth, int currentValue, int[] currentSolution){
        if (depth == fullItemSet.size()){
            if (maxValue < currentValue && checkWeight(currentSolution)){
                maxValue = currentValue;
                bestSolution = Arrays.copyOf(currentSolution, currentSolution.length);
            }
        }
        else {
            //add item at depth to solution
            int[] tempSolution = currentSolution;
            tempSolution[depth] = 1;
            int tempValue = currentValue;
            tempValue += fullItemSet.get(depth).getValue();
            graphSearch(depth + 1, tempValue, tempSolution);

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

    /**
     * shows the choices to the knapsack problem
     */
    public void printChoices(){
        for (int i=0; i < fullItemSet.size(); i++) {
            System.out.println("Item "+i+": value="+fullItemSet.get(i).getValue()+", weight="+fullItemSet.get(i).getWeight());
        }
    }

    /**
     * Print solution to the knapsack problem
     */
    public void printSolution(){
        StringBuilder sb = new StringBuilder("Items to take are: ");
        for (int i=0; i<fullItemSet.size(); i++){
            if (bestSolution[i] == 1){
                sb.append("item "+i+", ");
            }
        }
        sb.append("with value "+maxValue+".");
        System.out.println(sb.toString());
    }

}
