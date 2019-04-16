package nullpattern.pattern;

public class NPTest {

	public static void main(String[] args) {
		
		System.out.println(get("Evrim").getName());
		System.out.println(get("Emre").getName());
		System.out.println(get("Uğur").getName());
		System.out.println(get("Ferhat").getName());
		System.out.println(get("Önder").getName());
		System.out.println(get("Sadet").getName());
		
		if (!get("Gülin").isDummy()) {
			System.out.println("Kayıt var");
		}
		
		
		if (get("Barış").isDummy()) {
			System.out.println("Kayıt yok");
		}

	}

	public static DummyInterface get(String name) {
		
		String[] kayitListesi = {"Evrim","Gülin","Emre","Sadet","Onur"};
		
		for(int i= 0; i<kayitListesi.length;i++) {
			if ( kayitListesi[i] == name ) {
				//kayit var demek
				NonDummyEntity e = new NonDummyEntity();
				e.name = name;
				return e;
			}
		}
		//kayit yok demek
		return new DummyEntity();
		
	}

}
