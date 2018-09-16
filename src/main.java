public class main {

    public static void main(String[] args){
        TestCaseGenerator01 tests = new TestCaseGenerator01();
        KnapsackDP01 DP01 = new KnapsackDP01(tests.test1(), 10);
        DP01.findOptimal();
    }
}
