package Oop_Ödev;

public class main {
    public static void main(String[] args) {
        Lecturer huseyin=new Lecturer(111,"HÜSEYİN","TEMUÇİN",500);

        huseyin.setName("HÜSEYİN");

        Secretary helin = new Secretary(411,"helin","yulali",1000);

        System.out.println(helin.uraz.courses1);

        Courses bm101 =new Courses(101,"programlama",5);

        Student a= new Student(1234,"Tuğrul","Alparslan",2020);

        helin.addcoursetolecturer(bm101,huseyin);

        a.doInternship();
        a.doInternship();
        huseyin.akademikSorgu(huseyin);
       
        a.courses.add(bm101);
        a.courses.get(0).setCourse_grade(15);
        System.out.println(a.courses.get(0).getCourse_grade());
        System.out.println(bm101.getCourse_lecturer().getName());

    }
}
