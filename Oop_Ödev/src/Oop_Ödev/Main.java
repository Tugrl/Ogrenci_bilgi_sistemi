package Oop_Ödev;
public class main {
    public static void main(String[] args) {
    	
    	// Sekrete,Eğitmen,Öğrenci,Kurs nesneleri oluşturma
    	Staff temiz =new Staff(111,"ahmet","mehmet",1000);
    	 Secretary helin = new Secretary(411,"helin","yulali",8500);
    	 
    	 Lecturer uraz=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	 Lecturer ahmet=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	 Lecturer huseyin=new Lecturer(65875, "Hüseyin" ,"Temuçin", 150);
    	 Lecturer mehmet=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	 Lecturer mahmut=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	 Lecturer ali=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	 Lecturer veli=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	 Lecturer enes=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	 
    	 Lecturer tuğrul=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	 Lecturer furkan=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	 Lecturer yagi=new Lecturer(42688,"Uraz","Yavanoğlu",640);
    	
    	 Student hilal=new Student("Hilal","Ağtaş",1145515658,2020);
    	 hilal.setDegree("undergraduate");
    	 Student muhammed=new Student("Muhammed","Kurtar",229930631,2018);
    	 muhammed.setDegree("undergraduate");
    	 Student tugrul=new Student("Tuğrul","Alparslan",178456541,2021);
    	 tugrul.setDegree("graduate");
    	 Courses bm101= new Courses(101, "Programlama", 5);
    	 bm101.setCourse_category("undergraduate");
    	 Courses bm102= new Courses(102, "BM Giriş", 6);
    	 
    	 temiz.CalculateRaise();
    	 //Sekreter Ders ataması
    	 helin.addcoursetolecturer(bm101,huseyin);// Sekreter Hocaya ders atadı.
     	 helin.addcoursetolecturer(bm102,uraz);
     	helin.addcoursetolecturer(bm101,ahmet);
     	helin.addcoursetolecturer(bm101,mehmet);
     	helin.addcoursetolecturer(bm101,mahmut);
     	helin.addcoursetolecturer(bm101,ali);
     	helin.addcoursetolecturer(bm101,veli);
     	helin.addcoursetolecturer(bm101,furkan);
     	helin.addcoursetolecturer(bm101,enes);
     	helin.addcoursetolecturer(bm101,tuğrul);
     	helin.addcoursetolecturer(bm101,yagi);
    	 
    	
    	//..... Muhammed Kurtar sunum başlangıç
        //Derse öğrenci eklemesi
    	bm101.addStudent(tugrul); // öğrenci kursla aynı kategoride olmadığı için eklenmez.
        bm101.addStudent(hilal); // öğrenci aynı kategoride olduğu için eklendi.
        bm101.addStudent(muhammed);
        bm101.students.remove(hilal); // hilal öğrenciyi dersten sildik.
        
        // eklenen öğrencileri gösterme
        for(int i=0;i<bm101.students.size();i++) { // Course eklenenleri listeledik
        	 System.out.println("Kursa Eklenen "+bm101.students.get(i).getId_number() +" id numaralı öğrenci.");
        }
        
        //Akademik puan sorgu
        System.out.println(uraz.getName()+" " + uraz.getSurname() + " has a " + uraz.getAcademic_point() +" academic point");
        HeadfDepartment headOfDepartment=new HeadfDepartment();
        headOfDepartment.akademikSorgu(huseyin);
        headOfDepartment.akademikSorgu(uraz);
        //......... Muhammed Kurtar sunum son
  

    }
}