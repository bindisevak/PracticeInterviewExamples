package codazen;

import java.util.Comparator;

public class Student implements Comparator<Student>  {
	
	private String firstName;
	private String lastName;
    private int age;
    
	public Student(String fname, String lname, int age2) {
		firstName = fname;
		lastName = lname;
		age = age2;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//@Override
	public int compare(Student s1, Student s2) {
		int ageCmp =0;
		int fnameCmp = s1.getFirstName().compareTo(s2.getFirstName());
		int lnameCmp = s1.getLastName().compareTo(s2.getLastName());
		
		if(s1.getAge() == s2.getAge()){
			 ageCmp = 0;
		}
		else if(s1.getAge() > s2.getAge()){
			 ageCmp = 1;
		}
		else if(s1.getAge() < s2.getAge()){
			 ageCmp = -1;
		}
		
		if(fnameCmp == 0 && lnameCmp == 0 && ageCmp == 0){
			return 0;
		}
		else if(fnameCmp != 0){
			return fnameCmp;
		}
		else if(lnameCmp != 0){
			return lnameCmp;
		}
		else {
			return ageCmp;
		}

	}
	

    
    
}
