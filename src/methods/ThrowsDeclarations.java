package methods;

import utility.CustomException;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class ThrowsDeclarations {
    public void noException() throws Exception {
    }

    public void oneException() throws IllegalArgumentException {
    }

    public void threeExceptions() throws UnsupportedOperationException, IllegalStateException, Error {
    }

    public void customException() throws CustomException {
    }
}
