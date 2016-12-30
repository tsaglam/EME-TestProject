package attributes;

/**
 * This is a enum for testing purposes of the Ecore metamodel extraction.
 */
public enum EnumWithAttributes {
    AA, BB, CC;
    int defaultAttribute;
    public int publicAttribute;
    protected int protectedAttribute;
    @SuppressWarnings("unused")
    private int privateAttribute;
    static int staticAttribute;
}
