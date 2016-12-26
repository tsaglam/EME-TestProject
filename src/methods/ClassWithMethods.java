package methods;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class ClassWithMethods {
	public ClassWithMethods() {

	}
	
	public ClassWithMethods(int intParam) {

	}
	
	public int someMethod(boolean bool, String text) {
		return 7;
	}
	
	private ClassWithMethods privateMethod(ClassWithMethods instance) {
		return null;
	}
}
