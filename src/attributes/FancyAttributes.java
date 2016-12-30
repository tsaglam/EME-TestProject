package attributes;

import java.util.List;
import java.util.Map;

import classifierPackage.SomeClass;
import classifierPackage.SomeInterface;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class FancyAttributes {
    public List<String> someList;
    public Map<Integer, String> someMap;
    public Integer intObject;
    public SomeClass someClass;
    public SomeInterface someInterface;
    public String someStringWithAVeryLongNameWhichIsAbsolutlyRidiculous;
    public int[] intArray;
    public char[][] charArray2D;
    public String[][][] stringArray3D;
}
