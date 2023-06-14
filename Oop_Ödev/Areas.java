package Oop_Ödev;

public class Areas {
	private int area_id;
	boolean isdirty;
	
	public Areas(int area_id, boolean isdirty) { //constructor for areas class
		super();
		this.area_id = area_id;
		this.isdirty = isdirty;
	}
	
	public int getArea_id() {  //getter setter methods
		return area_id;
	}
	
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}// end of getter setters
		public void IsCleaned(Areas x) {  // temizlik kontrol fonksiyonu
			if (x.isdirty == false) {
				System.out.println("Offices has cleaned");
			} else {
				System.out.println("Offices has not cleaned");
			}
		}

		public void Clean(Areas a) {  //temizle fonksiyonu
			a.isdirty = false;
		}
	
	public void JoinClassroom(Courses x,Student y) {   // öğrencinin derse girip girmediğini kontrol eden fonksiyon
		x.setCourse_grade(x.getCourse_grade()+1);  // eğer öğrenci derse girerse devamsızlık durumunu 1 artttır
		y.setIternal(y.getIternal()+1);             // ayrıca öğrenci notuna bir puan ekler.
	}
}
