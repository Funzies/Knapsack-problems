import java.util.*;

/**
 * Jack Huang
 * 300343247
 * COMP361 Assignment 3
 * Brute force implementation of the 0N knapsack problem
 */

public class KnapsackBF0N {

    private List<Item> fullItemSet;
    private List<List<Item>> allCombinations;

    /**
     * Solves the 0N knapsack problem using brute force
     * @param capacity
     * @param items
     */
    public void solve(int capacity, ArrayList<Item> items){
        fullItemSet = new ArrayList<Item>();
        allCombinations = new ArrayList<List<Item>>();
        // converts the items into a 0-1 representation of each possible item.
        for (Item i: items){
            for (int x=0; x<i.getCount(); x++){
                fullItemSet.add(i);
            }
        }
        long startTime = System.nanoTime();

        enumerate(new ArrayList<Item>(), fullItemSet);

        int maxValue = 0;
        int currentWeight;
        int currentValue;
        List<Item> solutionSet = new ArrayList<Item>();
        //go through all the combinations and find the most valuable set which can fit into the knapsack
        for (List<Item> solution: allCombinations){
            currentWeight = 0;
            currentValue = 0;
            for (Item item : solution){
                currentWeight += item.getWeight();
                currentValue += item.getValue();
            }
            if (currentWeight <= capacity && currentValue > maxValue){
                solutionSet = solution;
                maxValue = currentValue;
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        printChoices(items);
        printSolution(solutionSet);
        System.out.println("Time taken: " + duration +"\n --------------------");
    }

    /**
     * Adds to the list of all possible combinations of solutions to the problem using recursion
     * @param solutions
     * @param items
     */
    private void enumerate(List<Item> solutions, List<Item> items) {
        allCombinations.add(solutions);
        //printSolution(solutions);
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

    /**
     * shows the choices to the knapsack problem
     */
    public void printChoices(List<Item> items){
        for (int i=0; i < items.size(); i++) {
            System.out.println("Item "+items.get(i).getID()+": value="+items.get(i).getValue()
                    +", weight="+items.get(i).getWeight() +", count="+items.get(i).getCount());
        }
    }

    /**
     * prints out the solution to the knapsack problem.
     */

    public void printSolution(List<Item> solutions){
        StringBuilder sb = new StringBuilder("Solution: ");
        Map<Integer, Integer> map = new HashMap<>();
        for (Item i : solutions) {
            Integer count = map.get(i.getID());
            if(count == null){
                map.put(i.getID(), 1);
            }
            else { map.put(i.getID(), count + 1); }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sb.append("Item: "+entry.getKey() + "*" + entry.getValue()+", ");
        }
        System.out.println(sb.toString());
    }
}
