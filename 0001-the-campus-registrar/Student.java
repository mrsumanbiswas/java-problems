
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student{
    private String name;
    private String rollNumber;
    private String date;

    Student(String name, String rollNumber, String date) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.date = date;
    }

    public void display() {
        System.out.println(this.name.toUpperCase());
        System.out.println(this.rollNumber.toUpperCase());
        
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(this.date, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate = date.format(outputFormatter);
        System.out.println(formattedDate);
        System.out.println(this.name.split(" ")[0].length());
    }
}