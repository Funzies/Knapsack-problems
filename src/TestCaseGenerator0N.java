import java.util.ArrayList;
import java.util.Random;

public class TestCaseGenerator0N {

    public ArrayList<Item> test1 = generateTestCases(5);
    public ArrayList<Item> test2 = generateTestCases(10);
    public ArrayList<Item> test3 = generateTestCases(15);


    public ArrayList<Item> generateTestCases(int size){
        ArrayList<Item> items = new ArrayList<Item>();
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        for (int i=0; i<size; i++) {
            items.add(new Item(n*(rand.nextInt(8)+2), n,rand.nextInt(5)+1));
        }
        return items;
    }
}
