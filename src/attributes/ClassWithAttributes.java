package attributes;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class ClassWithAttributes {
    static int staticAttribute;
    int defaultAttribute;
    @SuppressWarnings("unused")
    private int privateAttribute;
    protected int protectedAttribute;
    public int publicAttribute;
}
