public class TechnicalStaff extends Staff {

    public TechnicalStaff(int id_number, String name, String surname, double salary) // constructor
    {
        super(id_number, name, surname, salary);
    }

    void promosyon(){  // aylık promosyon alıyor
        this.setSalary(this.getSalary()+100);
    }
}
