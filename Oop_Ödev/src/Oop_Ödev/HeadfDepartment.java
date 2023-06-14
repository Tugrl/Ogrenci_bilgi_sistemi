package Oop_Ödev;

public class HeadfDepartment {
	public void graduatecontrol(Student x){

        if(x.getDegree()=="undergraduate"){

            if(x.courses.size()==40 && x.getGpa()>=2.0){

                x.isgraduate=true;   // bu değişken mezun olabilme durumunu tutar

            }
        }

        else if(x.getDegree()=="master"){

            if(x.courses.size()==7 && x.getGpa()>=2.5){

                x.isgraduate=true;

            }
        }

        else if(x.getDegree()=="doctorate"){

            if(x.courses.size()==8 && x.getGpa()>=3){

               x.isgraduate=true;

            }
        }

    }



   // burada eğitmen için derece belirliyor
    public void akademikSorgu(Lecturer x){
        if(x.getAcademic_point()>0 && x.getAcademic_point()<=245) {
            System.out.println(x.getName()+ " Akademic degree : Doctoral Lecturer");
        }
        else if(x.getAcademic_point()>245 && x.getAcademic_point()<=455 ) {
            System.out.println(x.getName()+ " Akademic degree : Associate Professorship");
        }
        else if(x.getAcademic_point()>455) {
            System.out.println(x.getName() +" Akademic degree : Professor");
        }

    }


    public void get_permission(Community x){  // burada topluluk etkinliği için bölüm başkanından izin alıyoruz

        x.permission=true;
    }
}
