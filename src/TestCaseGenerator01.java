import java.util.ArrayList;

public class TestCaseGenerator01 {

    public ArrayList<Item> test1 = test1();
    public ArrayList<Item> test2 = test2();
    public ArrayList<Item> test3 = test3();


    public ArrayList<Item> test1(){
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(49, 7));
        items.add(new Item(30, 5));
        items.add(new Item(25, 5));
        items.add(new Item(24, 4));
        return items;
    }

    public ArrayList<Item> test2(){
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(16, 3));
        items.add(new Item(25, 5));
        items.add(new Item(28, 6));
        items.add(new Item(34, 8));
        items.add(new Item(40, 9));
        items.add(new Item(11, 2));
        items.add(new Item(32, 7));
        items.add(new Item(10, 1));
        return items;
    }
    public ArrayList<Item> test3(){ //16 items
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(52, 10));
        items.add(new Item(10, 1));
        items.add(new Item(30, 5));
        items.add(new Item(11, 1));
        items.add(new Item(35, 6));
        items.add(new Item(14, 2));
        items.add(new Item(40, 7));
        items.add(new Item(50, 9));
        items.add(new Item(20, 3));
        items.add(new Item(29, 5));
        items.add(new Item(28, 4));
        items.add(new Item(34, 3));
        items.add(new Item(14, 2));
        items.add(new Item(44, 8));
        items.add(new Item(16, 2));
        items.add(new Item(37, 6));
        return items;
    }
}
