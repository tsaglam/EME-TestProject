package eme.generics;

import java.util.Map;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class WildcardClass2<T> {

    public void wildcardMethod(Map<? extends String, ? super T> list) {
    }

}
