public class main {

    public static void main(String[] args) {
        if (args[0].equals("DP01")) {
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
        else if (args[0].equals("BF0N")) {
            TestCaseGenerator0N tests = new TestCaseGenerator0N();
            KnapsackBF0N BF0N = new KnapsackBF0N();
            BF0N.solve(10, tests.test1); //test with 3 items with possible 3 count, 10 capacity
            BF0N.solve(10, tests.test2); //test with 4 items with possible 3 count, 10 capacity

            BF0N.solve(20, tests.test1); //test with 3 items with possible 3 count, 20 capacity
            BF0N.solve(20, tests.test2); //test with 4 items with possible 3 count, 20 capacity

            BF0N.solve(30, tests.test1); //test with 3 items with possible 3 count, 30 capacity
            BF0N.solve(30, tests.test2); //test with 4 items with possible 3 count, 30 capacity
        }
    }
}
