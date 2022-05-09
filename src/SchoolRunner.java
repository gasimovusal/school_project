import java.util.ArrayList;
import java.util.List;

public class SchoolRunner {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Suleyman", "Alptekin", "Java", 10001, ITDepartment.DEPARTMENT_NAME);

        ITDepartment itStudent = new Student("Vusal", "Gasimov", 101, ITDepartment.DEPARTMENT_NAME, instructor);

        Student student1 = new Student();
        student1.setLabName("Firudin");
        student1.setLastName("Gasimov");
        student1.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student1.setInstructor(instructor);

        Student student2 = new Student();
        student2.setLabName("Ali");
        student2.setLastName("Mammadov");
        student2.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student2.setInstructor(instructor);

        Student student3 = new Student();
        student3.setLabName("Bahadur");
        student3.setLastName("Jabbarov");
        student3.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student3.setInstructor(instructor);

        Student student4 = new Student();
        student4.setLabName("Ali");
        student4.setLastName("Abdulhay");
        student4.setDepartmentName(LanguageDepartment.DEPARTMENT_NAME);
        student4.setInstructor(instructor);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);


        instructor.setStudentList(studentList);
        System.out.println(instructor);
        System.out.println(instructor.getStudentList());

        Instructor instructor1 = new Instructor("Ahmet", "Bayram", "Selenium", 10002, ITDepartment.DEPARTMENT_NAME);

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(instructor);
        instructorList.add(instructor1);


        Student student5 = new Student();
        student5.setFirstName("Polat");
        student5.setLastName("Alemdar");
        student5.setId(100001);
        student5.setDepartmentName(ITDepartment.DEPARTMENT_NAME);
        student5.setInstructorList(instructorList);
        System.out.println(student5);


    }
}
