package DataBase;

public class Student {
	private int Id;
	private String Name;
	private String Major;
	private String phoneNumber;
	
	public Student() {}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Student(int Id, String Name, String Major, String phoneNumber) {
	this.Id = Id;
	this.Name = Name;
	this.Major = Major;
	this.phoneNumber = phoneNumber;
	
	
	
}
}

