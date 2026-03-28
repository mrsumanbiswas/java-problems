import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] componets = input.split("\\|");
        Student student = new Student(componets[0], componets[1], componets[2]);
        student.display();
        scanner.close();
    }
}