import java.util.HashMap;


public class GradesApp {




    public static void main(String[] args) {


        HashMap <String, Student> students = new HashMap<>();

        Student jim = new Student("Jim");

        jim.addGrade(90);
        jim.addGrade(70);
        jim.addGrade(90);

        Student tanner = new Student("Tanner");

        tanner.addGrade(40);
        tanner.addGrade(60);
        tanner.addGrade(90);

        Student jake = new Student("Jake");

        jake.addGrade(80);
        jake.addGrade(80);
        jake.addGrade(70);

        Student conner = new Student("Conner");

        conner.addGrade(50);
        conner.addGrade(90);
        conner.addGrade(80);


        students.put("jim123", jim);
        students.put("tanner789", tanner);
        students.put("jake456", jake);
        students.put("conner123", conner);


        System.out.println(students);

    }


}