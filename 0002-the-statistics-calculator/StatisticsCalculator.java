public class StatisticsCalculator {
    private static int totalOperations = 0;

    public int add(int a, int b) {
        totalOperations++;
        return a + b;
    }

    public double add(double a, double b) {
        totalOperations++;
        return a + b;
    }

    public int add(int... numbers) {
        totalOperations++;
        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }

        return sum;
    }

    public static int totalOperationCount() {
        return totalOperations;
    }
}