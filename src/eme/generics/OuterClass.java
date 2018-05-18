package eme.generics;

import java.util.LinkedList;
import java.util.List;

public class OuterClass {

    public static class InnerClass<T> {
        public InnerClass(T element) {
            list = new LinkedList<T>();
            add(element);
        }

        public void add(T element) {
            list.add(element);
            System.out.println("Added: " + element);
        }

        public void print() {
            System.out.println("Content: " + list);
        }

        List<T> list;
    }

    private InnerClass<Integer> intCapsule;
    private InnerClass<String> stringCapsule;

    public void doSomething() {
        intCapsule = new InnerClass<Integer>(1);
        intCapsule.add(9);
        intCapsule.print();
        stringCapsule = new InnerClass<String>("One");
        stringCapsule.add("Nine");
        stringCapsule.print();
    }

    public static void main(String[] args) {
        OuterClass instance = new OuterClass();
        instance.doSomething();
    }
}
