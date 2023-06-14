package Oop_Ödev;

abstract class Member {

	private int id_number;
	private String name;
	private String surname;

	public Member(int id_number, String name, String surname) {
		super();
		this.id_number = id_number;
		this.name = name;
		this.surname = surname;
	}

	// getter and setter metodlar değişkenler için
	public void setId_number(int id_number) {
		this.id_number = id_number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId_number() {
		return id_number;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
}
