import java.util.ArrayList;
import java.util.List;

public class Instructor implements ITDepartment, LanguageDepartment{


    private String firstName;
    private String lastName;
    private String title;
    private int id;
    private String departmentName;
    private List<Student> studentList = new ArrayList<>();
    private String labName;
    private boolean isLabAvailable;

    public Instructor(){

    }

    public Instructor(String firstName, String lastName, String title, int id, String departmentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.id = id;
        this.departmentName = departmentName;
    }

    @Override
    public String departmentName() {
        return departmentName;
    }

    @Override
    public Instructor instructor() {
        return this;
    }

    @Override
    public Student student() {
        return null;
    }

    @Override
    public String labName() {
        return labName;
    }

    @Override
    public boolean isLabAvailable() {
        return isLabAvailable;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDemaprtmentName(String demaprtmentName) {
        this.departmentName = demaprtmentName;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public void setLabAvailable(boolean labAvailable) {
        isLabAvailable = labAvailable;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
