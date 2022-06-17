public class Student{
    private int roll;
    private String anme;
    private int marks;

    public int getRoll() {
        return roll;
    }

    public String getAnme() {
        return anme;
    }

    public int getMarks() {
        return marks;
    }

    public Student(int roll, String anme, int marks) {
        this.roll = roll;
        this.anme = anme;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", anme='" + anme + '\'' +
                ", marks=" + marks +
                '}';
    }
}
