package eme.nestedClasses;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class OuterClass {

    public class InnerClass {
        class InnerInnerClass {
        }
    }

    enum InnerEnum {
        ONE, TWO, THREE;
        enum InnerInnerEnum {
            BIR, IKI, ÜC
        }
    }

    interface InnerInterface {
        interface InnerInnerInterface {
        }
    }
}
