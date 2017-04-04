package eme.generics;

import java.util.Date;

/**
 * IMPORTANT: EMF does not support a random order in a type parameter hierarchy.
 * This class tests a feature that is not supported by EMF. This is a class for
 * testing purposes of the Ecore metamodel extraction but will produce a
 * metamodel that will lead to the indication of errors. The Java language and
 * the EcoreMetamodelExtraction both support this feature.
 */
public class TypeParameterOrder<A extends C, B, C extends B> {

    public <X extends Y, Y extends Z, Z extends Date> X genericMethod(Y myY) {
        return null;
    }
}
