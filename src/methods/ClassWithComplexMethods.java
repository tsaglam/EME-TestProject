package methods;

import java.util.List;
import java.util.Map;

import classifierPackage.SomeClass;
import classifierPackage.SomeEnum;
import classifierPackage.SomeInterface;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class ClassWithComplexMethods {

    public ClassWithComplexMethods() {
    }

    public ClassWithComplexMethods(int number, char character, String text) {
    }

    public char[] arrayMethod(int[][] intArray2D, double[][][] doubleArray3D) {
        return null;
    }

    public SomeClass customClassMethod(SomeInterface someInterface, SomeEnum someEnum) {
        return null;
    }

    public List<String> listMethod(List<String> listA, List<String> listB) {
        return null;
    }

    public Map<Integer, String> mapMethod(Map<Integer, String> listA, Map<Integer, String> listB) {
        return null;
    }
}