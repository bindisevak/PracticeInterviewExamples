package codazen;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CommonCourses {
	public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Lenght of course 1");
        int n = sc.nextInt();
        Student[] course1 = new Student[n];
        System.out.println("Enter Lenght of course 2");
        int m = sc.nextInt();
        Student[] course2 = new Student[m];
        PropertiesComparator comparator = new PropertiesComparator();
        
        System.out.println("Enter students belonging to course 1");
        for(int i=0; i<=course1.length-1; i++){
        	System.out.println("Enter First name");
        	String fname = sc.next();	
        	if( !Pattern.matches("^[a-zA-Z]+$", fname)){
        		throw new MyException("Only alphabets allowed");
        	}
        	
        	System.out.println("Enter last name");
        	String lname = sc.next();	
        	if(!Pattern.matches("^[a-zA-Z]+$", lname) ){
        		throw new MyException("Only alphabets allowed");
        	}
        	
        	System.out.println("Enter age");
        	int age = sc.nextInt(); 	
        	if(age <= 0){
        		throw new MyException("Only non-negative number allowed");
        	}
        	
        	//Student student = new Student(fname, lname, age);
        	course1[i]= new Student(fname, lname, age);
 
        }
        for(int j=0; j<course1.length; j++){
        	System.out.println("Name: " +course1[j].getFirstName());
        }
        Student[] copyOfCourse1 = new Student[course1.length];
        Student previous1 = course1[0];
        copyOfCourse1[0] = previous1;
        //System.out.println("Previous: " +previous);
        for(int j=1; j<course1.length; j++){
        	Student temp = course1[j];
        	 //System.out.println("temp: " +temp);
        	if(comparator.compare(previous1, temp) == 0){
        		throw new MyException("All properties of 2 students cannot be exactly same");
        	}
        	else {
        		copyOfCourse1[j] = temp;
        	}
        	previous1 = temp;
        }
        
        System.out.println("Enter students belonging to course 2");
        for(int i=0; i<=course2.length-1; i++){
        	System.out.println("Enter First name");
        	String fname = sc.next();
        	if( !Pattern.matches("^[a-zA-Z]+$", fname)){
        		throw new MyException("Only alphabets allowed");
        	}
        	
        	System.out.println("Enter last name");
        	String lname = sc.next();
        	if(!Pattern.matches("^[a-zA-Z]+$", lname) ){
        		throw new MyException("Only alphabets allowed");
        	}
        	
        	System.out.println("Enter age");
        	int age = sc.nextInt();
        	if(age <= 0){
        		throw new MyException("Only non-negative number allowed");
        	}

        	//Student student = new Student(fname, lname, age);
        	course2[i] = new Student(fname, lname, age);
        }
        
        Student[] copyOfCourse2 = new Student[m];
        Student previous2 = course2[0];
        copyOfCourse2[0] = previous2;
        
        for(int j=1; j<course2.length; j++){
        	Student temp = course2[j];
        	if(comparator.compare(previous2, temp) == 0){
        		throw new MyException("All properties of 2 students cannot be exactly same");
        	}
        	else {
        		copyOfCourse2[j] = temp;
        	}
        	previous2 = temp;;
        }
            int len1 = course1.length;
            int len2 = course2.length;
            int count =0;
        
            if(len1<len2){
            	
        		StudentSorting.sort(course1, new PropertiesComparator());
                for(int i=0; i<len2; i++){
                    int ans = binarySearch(course1, 0, len1-1, course2[i], new Student()); 
                    count = count + ans;                               
                }
            }
             else{
          
         		StudentSorting.sort(course2, new PropertiesComparator());
                for(int i=0; i<len1; i++){
                   int ans = binarySearch(course2, 0, len2-1, course1[i], new Student()); 
                    count = ans + count;             
                }
                 
             }

            System.out.println(count+ " students enrolled in both courses");
    } 
            
            public static <T> int binarySearch(Student[] course2, int l, int r, Student course1, Student student) 
            {
                if (r >= l) 
                {
                    int mid = l + (r - l) / 2;
                    int i = student.compare(course2[mid], course1);


                    if (i == 0){
                        return 1;
                    }

                    if (i > 0){
                    	return binarySearch(course2, l, mid - 1, course1, student);
                    }
                        
                    if (i < 0){
                    	return binarySearch(course2, mid + 1, r, course1, student);
                    }          
                }
         

                return 0;
            }

        
           
        
        
    }