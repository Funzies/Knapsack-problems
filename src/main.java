public class main {

    public static void main(String[] args){
        TestCaseGenerator01 tests = new TestCaseGenerator01();
        KnapsackDP01 DP01 = new KnapsackDP01();
        DP01.findOptimal(tests.test1, 10); //test with 4 items, 10 capacity
        DP01.findOptimal(tests.test2, 10); //test with 8 items, 10 capacity
        DP01.findOptimal(tests.test3, 10); //test with 16 items, 10 capacity

        DP01.findOptimal(tests.test1, 20); //test with 4 items, 20 capacity
        DP01.findOptimal(tests.test2, 20); //test with 8 items, 20 capacity
        DP01.findOptimal(tests.test3, 20); //test with 16 items, 20 capacity

        DP01.findOptimal(tests.test1, 30); //test with 4 items, 30 capacity
        DP01.findOptimal(tests.test2, 30); //test with 8 items, 30 capacity
        DP01.findOptimal(tests.test3, 30); //test with 16 items, 30 capacity
    }
}
