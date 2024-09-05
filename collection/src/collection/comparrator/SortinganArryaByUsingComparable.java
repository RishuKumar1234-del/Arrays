package collection.comparrator;

import java.util.Arrays;

class Book implements Comparable<Object>{
	int id;
	int price;
	String name;
	int pages;
	public Book(int id,int price,String name,int pages) {
		this.id=id;
		this.price=price;
		this.name=name;
		this.pages=pages;
		}
	

	@Override
	public int compareTo(Object o) {
		Book b= (Book)o;
		if(this.id==b.id) {
			return 0;
		}
		else if(this.id>b.id){
			return 1;
		}
		else {
			return -1;
		}
		
	}
	

public static class SortinganArryaByUsingComparable {
	public static void main(String[] args) {
		Book[] b =new Book[3];
		b[0]=new Book(1, 250, "English", 230);
		b[1]=new Book(2, 110, "mathematics key", 50);
		b[2]=new Book(1, 95, "physics key", 100);
		
		Arrays.sort(b);
		for(Book book:b) {
			System.out.println(book.id);
		}
	}
}
}

	


