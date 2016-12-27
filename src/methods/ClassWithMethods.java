package methods;

import java.util.List;

import classifierPackage.SomeAbstractClass;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class ClassWithMethods {
    public ClassWithMethods() {

    }

    public ClassWithMethods(int intParam) {

    }

    public int someMethod(boolean bool, String text, char[][] array2d) {
        return 7;
    }

    @SuppressWarnings("unused")
    private ClassWithMethods privateMethod(ClassWithMethods instance, SomeAbstractClass importedClass,
            List<String> textList) {
        return null;
    }
}
