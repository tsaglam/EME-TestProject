package attributes;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class ClassWithAttributes {
    static int staticAttribute;
    int defaultAttribute;
    public int publicAttribute;
    protected int protectedAttribute;
    @SuppressWarnings("unused")
    private int privateAttribute;
}
