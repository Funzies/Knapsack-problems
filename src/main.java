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
            BF0N.solve(10, tests.test1); //test with 4 items total, 10 capacity
            BF0N.solve(10, tests.test2); //test with 7 items total, 10 capacity
            BF0N.solve(10, tests.test3); //test with 10 items total, 10 capacity

            BF0N.solve(20, tests.test1); //test with 4 items total, 20 capacity
            BF0N.solve(20, tests.test2); //test with 7 items total, 20 capacity
            BF0N.solve(30, tests.test3); //test with 10 items total, 20 capacity

            BF0N.solve(30, tests.test1); //test with 4 items total, 30 capacity
            BF0N.solve(30, tests.test2); //test with 7 items total, 30 capacity
            BF0N.solve(30, tests.test3); //test with 10 items total, 30 capacity
        }
        else if (args[0].equals("DP0N")) {
            TestCaseGenerator0N tests = new TestCaseGenerator0N();
            KnapsackDP0N DP0N = new KnapsackDP0N();
            DP0N.solve(10, tests.test1); //test with 4 items total, 10 capacity
            DP0N.solve(10, tests.test2); //test with 7 items total, 10 capacity
            DP0N.solve(10, tests.test3); //test with 10 items total, 10 capacity

            DP0N.solve(20, tests.test1); //test with 4 items total, 20 capacity
            DP0N.solve(20, tests.test2); //test with 7 items total, 20 capacity
            DP0N.solve(30, tests.test3); //test with 10 items total, 20 capacity

            DP0N.solve(30, tests.test1); //test with 4 items total, 30 capacity
            DP0N.solve(30, tests.test2); //test with 7 items total, 30 capacity
            DP0N.solve(30, tests.test3); //test with 10 items total, 30 capacity
        }
        else if (args[0].equals("GS0N")) {
            TestCaseGenerator0N tests = new TestCaseGenerator0N();
            KnapsackGS0N GS0N = new KnapsackGS0N();
            GS0N.solve(10, tests.test1); //test with 4 items total, 10 capacity
            GS0N.solve(10, tests.test2); //test with 7 items total, 10 capacity
            GS0N.solve(10, tests.test3); //test with 10 items total, 10 capacity

            GS0N.solve(20, tests.test1); //test with 4 items total, 20 capacity
            GS0N.solve(20, tests.test2); //test with 7 items total, 20 capacity
            GS0N.solve(30, tests.test3); //test with 10 items total, 20 capacity

            GS0N.solve(30, tests.test1); //test with 4 items total, 30 capacity
            GS0N.solve(30, tests.test2); //test with 7 items total, 30 capacity
            GS0N.solve(30, tests.test3); //test with 10 items total, 30 capacity
        }
        else {
            System.out.println("Invalid argument - enter either 'DP01', 'BF0N', 'DP0N' or 'GS0N' as an argument");
        }
    }
}
