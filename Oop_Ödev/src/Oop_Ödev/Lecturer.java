package Oop_Ödev;
import java.util.ArrayList;
import java.util.List;
public class Lecturer  {


    private double id_number;
    private int academic_point;
    private String name;
    private String surname;


    public Lecturer(double id_number, String name, String surname, int academic_point){

        this.id_number=id_number;
        this.name=name;
        this.surname=surname;
        this.academic_point=academic_point;



    }




    public List<Courses> courses1 = new ArrayList<>();


   // bu fomksiyonların oluğu bir package mi yapsak
   public void assign_grades(Student x, Courses course1, int grade){

       if(x.courses.contains(course1)){

           int i= x.courses.indexOf(course1);
           x.courses.get(i).setCourse_grade(grade);

       }





           // course değişkeni xin course array listinde var mı diye bakacağız

           // s1.setCourse_grade(course_grade);

   }


    public double getId_number() {
        return id_number;
    }

    public void setId_number(double id_number) {
        this.id_number = id_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAcademic_point() {
        return academic_point;
    }






}
