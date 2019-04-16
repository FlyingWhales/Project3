package nullpattern.pattern;

public class DummyEntity extends AncestorDummy implements DummyInterface {

	@Override
	public String getName() {
		return "Bu kayıt bulunamadı! - Dummy";
	}

	@Override
	public boolean isDummy() {
		return true;
	}

}
