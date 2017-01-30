package nestedClasses;

import java.util.Map;

import nestedClasses.OuterClass.InnerClass;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class Attributes {
    public InnerClass innerClassAttribute;
    public LocalInnerClass LocalInnerClassAttribute;
    public Map.Entry<Integer, String> externalInnerType;
    
    public class LocalInnerClass {
    }
}
