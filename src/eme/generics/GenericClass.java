package eme.generics;

import java.util.List;
import java.util.Map;

import eme.types.SomeInterface;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class GenericClass<T, S extends List<String>, R extends Throwable & SomeInterface> {

    public R genericAttribute;

    public Map<T, S> mapMethod(Map<T, S> mapA, Map<T, S> mapB) throws R {
        return null;
    }

    public R someMethod(T myT, S myS) {
        return null;
    }
}
