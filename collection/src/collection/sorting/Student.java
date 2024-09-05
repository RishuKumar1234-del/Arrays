package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
	int rollno;
	String name;
	String address;
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", " + (name != null ? "name=" + name + ", " : "")
				+ (address != null ? "address=" + address : "") + "]";
	}
	

}
class SortbyRollno implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getRollno()-s2.getRollno();
	}
	
}
class SortbyName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getName().compareTo(s2.getName()) ;
	}
	
}
class StudentDriver{
	public static void main(String[] args) {
		ArrayList<Student> ar= new ArrayList<Student>();
		ar.add(new Student(23, "vinit", "rampur"));
		ar.add(new Student(32, "rahul", "bairia"));
		ar.add(new Student(13, "shivkant", "fatehpur"));
		System.out.println("unosrted array: " );
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar, new SortbyRollno());
		System.out.println("\nSorted by Roll number " );
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("\nSorted by name: " );
		Collections.sort(ar, new SortbyName());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}
