import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StatisticsCalculator scalc = new StatisticsCalculator();
        System.out.println("Sum of integers: " + sum(scanner.nextInt(),scanner.nextInt()));
        System.out.println("Sum of doubles: " + sum(scanner.nextDouble(),scanner.nextDouble()));
        System.out.println("Sum of varargs: " + scalc.add(java.util.Arrays.stream(scanner.nextLine().trim().split(" ")).skip(1).mapToInt(Integer::parseInt).toArray()));        System.out.println("Total Operations: " + StatisticsCalculator.totalOperationCount());
        System.out.println("Total Operations: " + StatisticsCalculator.totalOperationCount());
        scanner.close();
    }
}