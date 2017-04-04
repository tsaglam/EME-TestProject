package eme.generics;

import eme.types.SomeClass;
import eme.utility.CustomGenericClass;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class GenericSubClass<T extends SomeClass> extends CustomGenericClass<String, T> {
}
