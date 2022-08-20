package org.ex;

public class Methods {
	public static void main(String [] args) {
		String s =" Bala TCS";
		String s1 =" bala tcs";
		int length = s.length();
		System.out.println(length);
		int indexOf = s.indexOf('a');
		System.out.println(indexOf);
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		String replace = s.replace( "a","@");
		System.out.println(replace);
		String replaceAll = s.replaceAll(s, "BALAJI");
		System.out.println(replaceAll);
		String trim = s.trim();
		System.out.println(trim);
		boolean equals = s.equals(s1);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
	}

}
