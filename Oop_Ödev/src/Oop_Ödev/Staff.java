package Oop_Ödev;
import java.util.ArrayList;
import java.util.List;

public   class Staff {

    private int id_number;  //variables of staff class
    private String name;
    private String surname;
    private String working_hours;
    private double salary;

    List<String> task_info=new ArrayList<>(); // görev bilgilerini tutuyor

    public Staff(int id_number, String name, String surname,double salary) { //constructor for staff class

        this.id_number = id_number;
        this.name = name;
        this.surname = surname;
        this.salary=salary;
        this.working_hours=working_hours;
    }



    public void CalculateRaise(Staff x) {// Zam hesaplama fonksiyonu.
        if(x.working_hours=="10.00") { //eğer günlük çalışma saaati 10 saatse maaşina yüzde 30 zam yapar.
            x.setSalary(x.getSalary()+((x.getSalary()*30)/100));// yüzde 30 zam yapar.
        }
    }

    public double getSalary() {   //getters and setters
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public String getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(String working_hours) {
        this.working_hours = working_hours;
    }

    public int getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }//end of getters setters

}





