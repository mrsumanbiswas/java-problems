package p0003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();

        Runtime runtime = Runtime.getRuntime();

        System.out.println("Initial free memory: " + runtime.freeMemory());

        Resource[] resources = new Resource[n];
        for (int i = 0; i < n; i++) {
            resources[i] = new Resource(i, s);
        }

        System.out.println("Free memory after creating resources: " + runtime.freeMemory());

        for (int i = 0; i < n; i++) {
            resources[i] = null;
        }

        System.gc();

        try { Thread.sleep(100); } catch (InterruptedException e) { }

        System.out.println("Free memory after GC: " + runtime.freeMemory());

        scanner.close();
    }
}