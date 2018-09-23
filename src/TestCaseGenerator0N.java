import java.util.ArrayList;
import java.util.Random;

public class TestCaseGenerator0N {

    public ArrayList<Item> test1 = test1();
    public ArrayList<Item> test2 = test2();
    public ArrayList<Item> test3 = test3();



    public ArrayList<Item> test1(){ //4 items total
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(49, 5, 2, 0));
        items.add(new Item(30, 3, 2, 1));
        return items;
    }

    public ArrayList<Item> test2(){ //7 items total
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(50, 7, 1, 0));
        items.add(new Item(35, 5, 2, 1));
        items.add(new Item(30, 4, 2, 2));
        items.add(new Item(24, 3, 2, 3));
        return items;
    }

    public ArrayList<Item> test3(){ //10 items total
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(49, 7, 2, 0));
        items.add(new Item(30, 5, 3, 1));
        items.add(new Item(25, 5, 2, 2));
        items.add(new Item(24, 4, 3, 3));
        return items;
    }

    public ArrayList<Item> generateRandomTestCases(int size, int maxCount){
        ArrayList<Item> items = new ArrayList<Item>();
        Random rand = new Random();
        for (int i=0; i<size; i++) {
            int n = rand.nextInt(10) + 1;
            items.add(new Item(n*(rand.nextInt(8)+2), n,rand.nextInt(maxCount)+1, i));
        }
        return items;
    }
}
