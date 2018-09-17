/**
 * Represents an item for the knapsack problems
 * For simplicity, value and weight of items are both integers.
 */

public class Item{
    int value;
    int weight;
    int count;

    //constructor for 0-1 representation
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    //constructor for 0-n representation
    public Item(int value, int weight, int count) {
        this.value = value;
        this.weight = weight;
        this.count = count;
    }

    public int getValue(){
        return value;
    }

    public int getWeight(){
        return weight;
    }
    public int getCount(){
        return count;
    }


}
