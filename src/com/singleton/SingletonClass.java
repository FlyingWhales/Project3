package com.singleton;

public class SingletonClass implements Cloneable {

	private static SingletonClass s = new SingletonClass();
	private int counter;

	private SingletonClass() {
		counter = 5;
	}

	public static SingletonClass getInstance() {
		return s;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Object clone() throws CloneNotSupportedException {
		//System.out.println("Klonlanıyorum");
		//return super.clone();
		throw new CloneNotSupportedException();
		
	}

}
