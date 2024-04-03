package com.learning.core.day1session1;

public class D01P01 {
	
	private static Book book;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createBook("Java Programming", 350.00);
		showBook();

	}

	public static void createBook(String book_title, double book_price) {
		book = new Book();
		book.setBook_title(book_title);
		book.setBook_price(book_price);
	}

	public static void showBook() {
		System.out.print("Book Title: " + book.getBook_title() + " and Book Price: " + book.getBook_price());

	}

}
