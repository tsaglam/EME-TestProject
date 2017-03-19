package eme.generics;

import java.util.Date;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class TypeParameterOrder<A extends C, B, C extends B> {

    public <X extends Y, Y extends Z, Z extends Date> X genericMethod(Y myY) {
        return null;
    }
}
