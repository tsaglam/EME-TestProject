package attributes;

/**
 * This is a enum for testing purposes of the Ecore metamodel extraction.
 */
public enum EnumWithAttributes {
    AA, BB, CC;
    static int staticAttribute;
    int defaultAttribute;
    @SuppressWarnings("unused")
    private int privateAttribute;
    protected int protectedAttribute;
    public int publicAttribute;
}
