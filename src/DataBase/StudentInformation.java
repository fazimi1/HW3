package DataBase;

public class StudentInformation extends Student {
public static void main(String[] args) {
Student st1 = new Student();
st1.setId(01);
st1.setName("Fazli");
st1.setMajor("CIS");
st1.setPhoneNumber("7184445555");

System.out.println(st1.getId()+ " " + st1.getName()+ " " 
+ st1.getMajor() + " " + 
st1.getPhoneNumber());
}
}
