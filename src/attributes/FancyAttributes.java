package attributes;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Exchanger;

import classifierPackage.SomeClass;
import classifierPackage.SomeInterface;
import utility.CustomGenericClass;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class FancyAttributes {
    public Set<Map<Object, List<String>>> bigBadSet;
    public char[][] charArray2D;
    public CustomGenericClass<String, SomeClass> complexReference;
    public int[] intArray;
    public Integer intObject;
    public List<Exchanger<String>> listOfExternal;
    public SomeClass someClass;
    public List<SomeClass> someClassList;
    public SomeInterface someInterface;
    public List<String> someList;
    public Map<Integer, String> someMap;
    public String someStringWithAVeryLongNameWhichIsAbsolutlyRidiculous;
    public Exchanger<String> someWeirdExternalDataType;
    public String[][][] stringArray3D;
}
