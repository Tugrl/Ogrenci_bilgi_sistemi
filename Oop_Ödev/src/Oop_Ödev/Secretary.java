package Oop_Ödev;
import java.util.ArrayList;
import java.util.List;


public  class Secretary extends Staff {



    public static void addcoursetolecturer(Courses course, Lecturer lecturerx) {  // hocanın adını ve hangi dersi atayacağını parametre alıyor
        if (lecturerx.courses1.size() > 9) {
            System.out.println("This lecturer Access to max course number");
            return;
        } else {
            lecturerx.courses1.add( course);  // hocanın girdiği derslere bu kursu da ekliyor.
            course.setCourse_lecturer(lecturerx); // kursun hocasına hocayı ekliyor.
System.out.println("eklendi");
        }

    }


    public Secretary(int id_number, String name, String surname, double salary) { // constructor
        super(id_number, name, surname,salary);


    }




}
