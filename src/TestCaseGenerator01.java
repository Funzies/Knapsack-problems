import java.util.ArrayList;

public class TestCaseGenerator01 {

    public ArrayList<Item> test1(){
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(49, 7));
        items.add(new Item(30, 5));
        items.add(new Item(25, 5));
        items.add(new Item(24, 4));
        return items;
    }
}
