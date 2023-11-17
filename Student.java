public class Student {
    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Student{" +
               "roll number=" + rollno +
               ", name='" + name + '\'' +
               ", address='" + address + '\'' +
               '}';
    }
}
