package eme.methods;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class AccessMethods {
    private boolean active;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}