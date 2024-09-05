package collection.comparrator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int rollno;
	String name,address;
	public Employee(int rollno,String name,String address) {
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
}
class Sortbyname implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
class SortbyRollno implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.rollno - o2.rollno;
	}
	
}
class SortEmployeeByAddress implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.address.compareTo(o2.address);
	}
	
}

public class ComparatorExample1 {

	public static void main(String[] args) {
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(new Employee(1, "Vikash ", "Rajasthan"));
		al.add(new Employee(43, "Vishal ", "Muzaffarpur "));
		al.add(new Employee(54, "Saddam ", "Jaipur"));
		al.add(new Employee(32, "Mahendra ", "Kota"));
		al.add(new Employee(38, "zafar ", "Aligadh"));
		System.out.println("the unsorted employees: ");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("\n sorted employees by name:");
		Collections.sort(al, new Sortbyname());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("\n sorted employees by rollno:");
		Collections.sort(al, new SortbyRollno());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("\n sorted employees by address:");
		Collections.sort(al, new SortEmployeeByAddress());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}


	}

}