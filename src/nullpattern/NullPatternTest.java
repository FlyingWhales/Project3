package nullpattern;

public class NullPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		//test2();
		test3();

	}

	public static void test1() {

		DummyNullPattern dnp = new DummyNullPattern();

		dnp.isOpen = true;
		DummyEntity de = dnp.getEntity();

		System.out.println(de.getProperty1());

	}

	public static void test2() {

		DummyNullPattern dnp = new DummyNullPattern();

		DummyEntity de = dnp.getEntity();

		System.out.println(de.getProperty1());

	}

	public static void test3() {

		DummyNullPattern dnp = new DummyNullPattern();

		DummyEntity de = dnp.getEntity();

		if (de != null) {
			System.out.println(de.getProperty1());
		} else {
			System.out.println("Aman ha!");
		}

	}

}
