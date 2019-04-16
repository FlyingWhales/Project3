package nullpattern;

public class DummyNullPattern {

	
	public boolean isOpen = false;
	
	public DummyEntity getEntity() {
		
		DummyEntity result = null;
		
		// business logic
		//...
		//...
		
		if (isOpen) {
			result= new DummyEntity();
		}
		
		return result;
	}	
	
	
}
