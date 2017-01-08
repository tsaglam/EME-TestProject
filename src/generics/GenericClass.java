package generics;

import java.util.Map;

import classifierPackage.SomeClass;
import classifierPackage.SomeInterface;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class GenericClass<T, S extends SomeClass, R extends Throwable & SomeInterface> {

    public Map<T, S> mapMethod(Map<T, S> mapA, Map<T, S> mapB) throws R {
        return null;
    }
}
