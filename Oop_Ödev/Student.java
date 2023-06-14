package Oop_Ödev;

import java.util.ArrayList;
import java.util.List;

public class Student extends Member {

	private int year;
	public String degree;
	private double gpa;
	public int getIternal() { // getters and setters
		return iternal;
	}

	public void setIternal(int iternal) {
		this.iternal = iternal;
	}
 
	private int internShipNumber = 0;  // variables for student class
	private int iternal;
	public List<Courses> courses = new ArrayList<>();
	public List<String> mycommunities = new ArrayList<>();

	public Student(int idnumber, String name, String surname, int year) { // constructor for student
		super(idnumber, name, surname);
		super.setName(name);
		super.setSurname(surname);
		super.setId_number(idnumber);
		this.year = year;
	}

	public void join_community(String community_name) { // öğrencinin bir topluluğa katılması

		this.mycommunities.add(community_name);

	}

	public void doInternship() { // staj durumu kontrolü 
		internShipNumber++;
		System.out.println(getName() + " " + getSurname() + " adlı öğrenci " + internShipNumber + " kere staj yaptı.");
	}

	public void addcourse(Courses y) {  // öğrenciye kurs atama fonksiyonu

		this.courses.add(y);
	}

}
