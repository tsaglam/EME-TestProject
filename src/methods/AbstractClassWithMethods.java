package methods;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public abstract class AbstractClassWithMethods {
    public static void staticMethod() {
    }

    public AbstractClassWithMethods() {
    }

    public AbstractClassWithMethods(int intParam) {
    }

    public abstract void abstractMethod();

    void defaultMethod() {
    }

    @SuppressWarnings("unused")
    private void privateMethod() {
    }

    protected void protectedMethod() {
    }

    public void publicMethod() {
    }
}