package eme.generics;

import java.util.List;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class WildcardClass {

    public void wildcardMethod(List<?> list) {
    }

    public void wildcardMethodLower(List<? super String> list) {
    }

    public void wildcardMethodUpper(List<? extends String> list) {
    }
}
