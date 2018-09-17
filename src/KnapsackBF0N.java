import java.util.ArrayList;
import java.util.List;

/**
 * Jack Huang
 * 300343247
 * COMP361 Assignment 3
 * Brute force implementation of the 0N knapsack problem
 */

public class KnapsackBF0N {

    private int capacity;
    private List<Item> items;
    private List<Item> fullItemSet;

    private List<List<Item>> allCombinations;

    public KnapsackBF0N(int capacity, ArrayList<Item> items){
        this.capacity = capacity;
        this.items = items;
        fullItemSet = new ArrayList<Item>();
        allCombinations = new ArrayList<List<Item>>();
        // converts the representation into a 0-1 of each possible item.
        for (Item i: items){
            for (int x=0; x<i.getCount(); x++){
                fullItemSet.add(i);
            }
        }
        solve();
    }

    public void solve(){
        int maxValue;
        ArrayList<Item> solutionSet = new ArrayList<>();
        enumerate(new ArrayList<Item>(), fullItemSet);
    }


    private void enumerate(List<Item> solutions, List<Item> items) {
        allCombinations.add(solutions);
        printSolution(solutions);
        List<Item> tempList;
        List<Item> tempSolutions;
        if (!items.isEmpty()) {
            for (int i = 0; i < items.size(); i++) {
                tempList = new ArrayList<Item>(items);
                tempList.remove(i);
                tempSolutions = new ArrayList<Item>(solutions);
                tempSolutions.add(items.get(i));
                enumerate(tempSolutions, tempList);
            }
        }
    }

    public void printSolution(List<Item> solutions){
        StringBuilder sb = new StringBuilder("Solution: ");
        for (Item i : solutions) {
            sb.append(i.id+ " ");
        }
        System.out.println(sb.toString());
    }
}
