import java.util.ArrayList;
import java.util.Random;

public class TestCaseGenerator0N {

    public ArrayList<Item> test1 = test1();
    public ArrayList<Item> test2 = generateTestCases(5);
    public ArrayList<Item> test3 = generateTestCases(10);
    public ArrayList<Item> test4 = generateTestCases(15);

    public ArrayList<Item> test1(){
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(49, 7, 1, 1));
        items.add(new Item(30, 5, 1, 2));
        items.add(new Item(25, 5, 1, 3));
        items.add(new Item(24, 4, 1, 4));
        return items;
    }

    public ArrayList<Item> generateTestCases(int size){
        ArrayList<Item> items = new ArrayList<Item>();
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        for (int i=0; i<size; i++) {
            items.add(new Item(n*(rand.nextInt(8)+2), n,rand.nextInt(5)+1, i));
        }
        return items;
    }
}
