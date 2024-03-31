// Interface representing a student
interface Student {
    // Abstract method to study
    void study();

    // Abstract method to take exams
    void takeExams();
}

// Concrete class implementing Student interface
class CollegeStudent implements Student {
    // Implementing the study method for CollegeStudent
    @Override
    public void study() {
        System.out.println("College student is studying");
    }

    // Implementing the takeExams method for CollegeStudent
    @Override
    public void takeExams() {
        System.out.println("College student is taking exams");
    }
}

// Concrete class implementing Student interface
class SchoolStudent implements Student {
    // Implementing the study method for SchoolStudent
    @Override
    public void study() {
        System.out.println("School student is studying");
    }

    // Implementing the takeExams method for SchoolStudent
    @Override
    public void takeExams() {
        System.out.println("School student is taking exams");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Creating instances of CollegeStudent and SchoolStudent classes
        Student collegeStudent = new CollegeStudent();
        Student schoolStudent = new SchoolStudent();

        // Calling study and takeExams methods for CollegeStudent and SchoolStudent objects
        collegeStudent.study();
        collegeStudent.takeExams();

        schoolStudent.study();
        schoolStudent.takeExams();
    }
}