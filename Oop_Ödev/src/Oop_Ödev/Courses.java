package Oop_Ödev;
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;

public class Courses {

    private int course_code;

    private double course_grade;
    private String course_name;
    private String course_category;
    private int credit;  // değiştirilemez  set edemesin
    private String course_department;
    private Lecturer course_lecturer;   // kursu veren hoca bir objedir.

    public List<Student> students = new ArrayList<>(); // kursu alan öğrencilerin tc tutuyor fonk yaz

    public Courses(int code,String name, int credit){

        course_code=code;
        course_name=name;
        this.credit=credit;
    }

    public void addStudent(Student x){   // add course ??

        if(this.course_category!=x.getDegree()){
            System.out.println("This student id of "+x.getId_number()+" cannot take this course");
            return;
        }

        this.students.add(x);

        x.addcourse(this);  // call the function aynı zamanda o öğrencinin kurslarına bu kursu ekliyor
       

    }



   // getters and setters
    public Lecturer getCourse_lecturer() {
        return course_lecturer;
    }

    public void setCourse_lecturer(Lecturer course_lecturer) {
        this.course_lecturer = course_lecturer;
    }

    public int getCourse_code() {
        return course_code;
    }

    public void setCourse_code(int course_code) {
        this.course_code = course_code;
    }

    public double getCourse_grade() {
        return course_grade;
    }

    public void setCourse_grade(double course_grade) {
        this.course_grade = course_grade;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_category() {
        return course_category;
    }

    public void setCourse_category(String course_category) {
        this.course_category = course_category;
    }

    public int getCredit() {
        return credit;
    }


    public String getCourse_department() {
        return course_department;
    }

    public void setCourse_department(String course_department) {
        this.course_department = course_department;
    }






}
