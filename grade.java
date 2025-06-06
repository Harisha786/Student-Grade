public class Student {
    String name;
    int[] marks = new int[3]; // marks for 3 subjects
    double average;
    char grade;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateAverage();
        calculateGrade();
    }

    void calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        average = sum / 3.0;
    }

    void calculateGrade() {
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 40) grade = 'D';
        else grade = 'F';
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) System.out.print(mark + " ");
        System.out.println("\nAverage: " + average);
        System.out.println("Grade: " + grade);
    }
}
