package eme.generics;

import java.util.List;

import eme.types.SomeInterface;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class GenericMethods<E> {

    public <M> M genericMethod() {
        return null;
    }

    public <M extends E> M genericMethod(E myE) {
        return null;
    }

    public <S extends List<String>, R extends Throwable & SomeInterface> S genericMethod(S myS) throws R {
        return null;
    }
}
