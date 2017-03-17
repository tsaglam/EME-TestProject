package eme.generics;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class TypeParameterOrder<A extends C, B, C extends B> {

    public <X extends Z, Y, Z extends Y> X genericMethod(Y myY) {
        return null;
    }
}
