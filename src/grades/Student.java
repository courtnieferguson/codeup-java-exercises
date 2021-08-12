import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returning student name
    public String getName() {
        return this.name;
    }

    // add grade grades prop
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // return average of grades
    public double getGradeAverage() {
        double sum = 0;
        double length = this.grades.size();

        for (int index = 0; index < this.grades.size(); index++) {
            sum += this.grades.get(index);
        }
        double result = sum / length;
        return result;
    }


    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public static void main(String[] args) {

        Student james = new Student("sam");

        System.out.println(james.getName());

        james.addGrade(4);
        james.addGrade(4);
        james.addGrade(4);
        james.addGrade(4);
        james.addGrade(4);
        james.addGrade(4);


        System.out.println(james.getGrades());
        System.out.println(james.getGradeAverage());

    }

}