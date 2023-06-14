package Oop_Ödev;
import java.util.ArrayList;
import java.util.List;


public  class Secretary extends Staff {

    List <String> task_info=new ArrayList<>();

    @Override
    public String getWorking_hours() { // getters and setters for variables
        return working_hours;
    }

    @Override
    public void setWorking_hours(String working_hours) {
        this.working_hours = working_hours;
    } // end of getters and setters

    private String working_hours="08.30-17.00";  // variable for secretary class


    Lecturer htemucin=new Lecturer(333,"HÜSEYİN","TEMUÇİN",250); //  //objects for staff class
    Lecturer uraz=new Lecturer(111,"URAZ","YAVANOĞLU",800);
    Lecturer oktay=new Lecturer(222,"OKTAY","YILDIZ",300);

    public static void addcoursetolecturer(Courses course, Lecturer lecturerx) {  // kursa eğitmen atama fonksiyonu
        if (lecturerx.courses1.size() >= 10) {
            System.out.println("This lecturer Access to max course number");
            return;
        } else {
            lecturerx.courses1.add( course); // hocanın girdiği derslere bu kursu da ekliyor.
            course.setCourse_lecturer(lecturerx);// kurs listesine hocayı ekliyor.

        }
    }
    public Secretary(int id_number, String name, String surname,double salary) { //constructor for secretary class
        super(id_number, name, surname,salary);

    }

}
