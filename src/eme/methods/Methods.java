package eme.methods;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Exchanger;

import eme.types.SomeClass;
import eme.types.SomeEnum;
import eme.types.SomeInterface;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class Methods {

    public Methods() {
    }

    public Methods(int number, char character, String text) {
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

    public Map<Integer, String> mapMethod(Map<Integer, String> mapA, Map<Integer, String> mapB) {
        return null;
    }

    public Exchanger<String> methodWithWeirdExternalDataTypes(Exchanger<String> someWeirdExternalDataType) {
        return null;
    }
}