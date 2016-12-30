package methods;

/**
 * This is an enum for testing purposes of the Ecore metamodel extraction.
 */
public enum EnumWithMethods {
    A, B, C;

    public static void staticMethod() {
    }

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