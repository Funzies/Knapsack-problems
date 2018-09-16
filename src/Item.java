/**
 * Represents an item for the knapsack problems
 * For simplicity, value and weight of items are both integers.
 */

public class Item{
    int value;
    int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public int getValue(){
        return value;
    }

    public int getWeight(){
        return weight;
    }

}
