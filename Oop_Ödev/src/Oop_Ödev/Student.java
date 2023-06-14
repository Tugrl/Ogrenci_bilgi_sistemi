package Oop_Ödev;
import java.util.ArrayList;
import java.util.List;

public class Student {

	private long id_number;
	private String name;
	private String surname;
	boolean isgraduate;
	private int year;
	private int iternal; // devamsızlık tutar
	

	private String degree; // lisans doktora yüksek lisans
	private double gpa;

	public List<Courses> courses = new ArrayList<>(); // öğrencinin aldığı derslerin listesi
	public List<String> mycommunities = new ArrayList<>(); // öğrencinin kayıt olduğu topluluklar

	public Student(String name, String surname, long idnumber, int year) { // constructor for student

		this.name = name;
		this.id_number = idnumber;
		this.year = year;
		
	}

	public void calculate_gpa() { // dersin kredisi ve alınan nota göre ortalama hesaplıyor

		double sum = 0, sumcredit = 0;
		for (int i = 0; i < this.courses.size(); i++) {

			sum += (this.courses.get(i).getCourse_grade() * this.courses.get(i).getCredit());
			sumcredit += this.courses.get(i).getCredit();
		}

		gpa = (sum / sumcredit) / 25; // ortalamayı 4lük listemde hesaplar

	}

	public void join_community(String community_name) { // öğrencinin bir topluluğa katılması

		this.mycommunities.add(community_name);

	}

	public void addcourse(Courses y) { // öğrencinin ders listesine ders ekler

		this.courses.add(y);

	}

	public long getId_number() {
		return id_number;
	}

	public int getYear() {
		return year;
	}

	public double getGpa() {
		return gpa;
	}

	public String getDegree() {
		return degree;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getIternal() { // getters and setters
		return iternal;
	}

	public void setIternal(int iternal) {
		this.iternal = iternal;
	}

}
