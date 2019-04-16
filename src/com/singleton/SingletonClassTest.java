package com.singleton;

public class SingletonClassTest {

	public static void main(String[] args) {
		
		SingletonClass s1 = SingletonClass.getInstance();
		
		System.out.println(s1.getCounter());
		
		s1.setCounter(0);
		
		System.out.println(s1.getCounter());
		
		SingletonClass s2 = s1;
		
		s2.setCounter(15);
		
		
		System.out.println(s1.getCounter());
		System.out.println(s2.getCounter());
		
		SingletonClass s3 = null;
		try {
			
			// Class cast - Sağ taraftan object gelir
			// Bu yüzden değer cast edilmelidir
			// ifadenin soluna parantez içinde class yazılarak bu sağlanır
			
			s3 = (SingletonClass) s2.clone(); 
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		
		s3.setCounter(100);
		
		System.out.println(s1.getCounter());
		System.out.println(s2.getCounter());
		System.out.println(s3.getCounter());

	}

}
