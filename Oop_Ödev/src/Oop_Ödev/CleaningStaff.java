package Oop_Ödev;
public class CleaningStaff extends Staff {

    //constructor for cleaningstaff
    public CleaningStaff(int id_number, String name, String surname, String working_hours,double salary) {
        super(id_number, name, surname,salary);

    }

    public void IsCleaned(Areas x) {  // areanın temizlenip temizlenmediğinin kontrolü
        if (x.isdirty == false) {
            System.out.println("Offices has cleaned");
        } else {
            System.out.println("Offices has not cleaned");
        }
    }

    public void Clean(Areas a) {  // eğer temizlenmemişse , temizle fonksiyonu
        a.isdirty = false;
    }
}