package Oop_Ödev;

import java.util.ArrayList;
import java.util.List;
public class Lecturer extends Member {
private int academic_point;
   public List<Courses> courses1 = new ArrayList<>();
   public void assign_grades(Student x, Courses courses1){
   }
    public Lecturer(int id_number,String name,String surname,int academic_point) {  // constructor burada test ediyorum.
          super(id_number,name,surname);
this.academic_point=academic_point;
    }
    
    public void akademikSorgu(Member eks){
    	if(academic_point>0 && academic_point<=245) {
    		System.out.println(eks.getName()+ " Akademic degree : Doctoral Lecturer");
    	}
    	else if(academic_point>245 && academic_point<=455 ) {
    		System.out.println(eks.getName()+ " Akademic degree : Associate Professorship");
    	}
    	else if(academic_point>455) {
    		System.out.println(eks.getName() +" Akademic degree : Professor");
    	}
    	
    }
    
}

   