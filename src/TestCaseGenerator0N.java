import java.util.ArrayList;
import java.util.Random;

public class TestCaseGenerator0N {

    public ArrayList<Item> test1 = generateTestCases(3, 3);
    public ArrayList<Item> test2 = generateTestCases(4, 3);


    public ArrayList<Item> generateTestCases(int size, int maxCount){
        ArrayList<Item> items = new ArrayList<Item>();
        Random rand = new Random();
        for (int i=0; i<size; i++) {
            int n = rand.nextInt(10) + 1;
            items.add(new Item(n*(rand.nextInt(8)+2), n,rand.nextInt(maxCount)+1, i));
        }
        return items;
    }
}
