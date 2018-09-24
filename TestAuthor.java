package authors;
package com.company;
public class TestAuthor {
	public static void main(String[] args) {
		Author author1 = new Author ("denis", "watch@.com", "m");
		System.out.println(author1.toString());
		author1.setEmail("ramb@.com");
		System.out.println(author1.toString());
	}
}