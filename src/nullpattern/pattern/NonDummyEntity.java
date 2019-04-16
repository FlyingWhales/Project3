package nullpattern.pattern;

public class NonDummyEntity  extends AncestorDummy implements DummyInterface{

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean isDummy() {
		return false;
	}

}
