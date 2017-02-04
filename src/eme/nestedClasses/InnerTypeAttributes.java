package eme.nestedClasses;

import java.util.Map;

import eme.nestedClasses.OuterClass.InnerClass;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class InnerTypeAttributes {
    public InnerClass innerClassAttribute;
    public LocalInnerClass LocalInnerClassAttribute;
    public Map.Entry<Integer, String> externalInnerType;

    public class LocalInnerClass {
    }
}
