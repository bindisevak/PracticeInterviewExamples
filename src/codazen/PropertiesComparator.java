package codazen;

import java.util.Comparator;

public class PropertiesComparator implements Comparator<Student> {
	int ageCmp;
	
		public int compare(Student s1, Student s2) {
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
		else if(fnameCmp != 0 && lnameCmp == 0 && ageCmp == 0){
			return fnameCmp;
		}
		else if(fnameCmp == 0 && lnameCmp != 0 && ageCmp == 0){
			return lnameCmp;
		}
		else if(fnameCmp == 0 && lnameCmp == 0 && ageCmp != 0){
			return ageCmp;
		}
		else if(fnameCmp == 0 && lnameCmp != 0 && ageCmp != 0){
			return lnameCmp;
		}
		else {
			return fnameCmp;
		}
	}

}
