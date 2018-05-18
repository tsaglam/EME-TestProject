package eme.generics;

import java.util.List;
import java.util.Map;

/**
 * This is a class for testing purposes of the Ecore metamodel extraction.
 */
public class WildcardClass3<T> {

    private List<? extends T> list;

    public <S> void wildcardMethod(Map<? extends S, ? super T> list) {
    }

    public List<? extends T> getList() {
        return list;
    }

    public void setList(List<? extends T> list) {
        this.list = list;
    }
}
