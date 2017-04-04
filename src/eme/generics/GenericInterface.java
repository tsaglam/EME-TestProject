package eme.generics;

import java.util.Map;

import eme.types.SomeClass;
import eme.types.SomeInterface;

/**
 * This is a interface for testing purposes of the Ecore metamodel extraction.
 */
public interface GenericInterface<T, S extends SomeClass, R extends Throwable & SomeInterface> {

    public Map<T, S> mapMethod(Map<T, S> mapA, Map<T, S> mapB) throws R;
    
    public R someMethod(T myT, S myS);
    
    public <M> M genericMethod();
}
