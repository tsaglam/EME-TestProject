package attributes;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Exchanger;

import classifierPackage.SomeClass;
import classifierPackage.SomeInterface;
import utility.CustomGenericClass;
import nestedClasses.OuterClass.InnerClass;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class FancyAttributes {
    public InnerClass innerClassAttribute;
    public LocalInnerClass LocalInnerClassAttribute;
    public Exchanger<String> someWeirdExternalDataType;
    public CustomGenericClass<String, SomeClass> complexReference;
    public List<String> someList;
    public List<Exchanger<String>> listOfExternal;
    public List<SomeClass> someClassList;
    public Map<Integer, String> someMap;
    public Integer intObject;
    public SomeClass someClass;
    public SomeInterface someInterface;
    public String someStringWithAVeryLongNameWhichIsAbsolutlyRidiculous;
    public int[] intArray;
    public char[][] charArray2D;
    public String[][][] stringArray3D;
    public Set<Map<Object, List<String>>> bigBadSet;
    
    private class LocalInnerClass {
        
    }
}
