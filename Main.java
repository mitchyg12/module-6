import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Alice", "Address1"));
        students.add(new Student(2, "Lilo", "Address1"));
        students.add(new Student(3, "Bula", "Address1"));
        students.add(new Student(4, "Steve", "Address1"));
        students.add(new Student(5, "Joe", "Address1"));
        students.add(new Student(6, "Smith", "Address1"));
        students.add(new Student(7, "Lily", "Address1"));
        students.add(new Student(8, "Alfanso", "Address1"));
        students.add(new Student(9, "Leon", "Address1"));
        students.add(new Student(10, "Mitch", "Address1"));
        
        System.out.println("Sorted by Name:");
        SelectionSort.sort(students, new SortByName());
        students.forEach(System.out::println);

        System.out.println("Sorted by Roll Number:");
        SelectionSort.sort(students, new SortByRoll());
        students.forEach(System.out::println);
    }
}